package com.cz.domain.processor;

import com.cz.domain.crawler.Domain;
import org.apache.kafka.streams.kstream.KStream;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Function;

@Configuration
public class DomainKafkaProcessor {

    @Bean
    public Function<KStream<String, Domain>, KStream<String, Domain>> domainProcessor(){
        return abc -> abc.filter((key, domain) -> {
            if(domain.isDead()){
                System.out.println("Inactive domain: "+domain.getDomain());
            } else {
                System.out.println("Active domain: "+domain.getDomain());
            }
            return !domain.isDead();
        });

    }

}
