package com.cz.domain.crawler;

import java.util.List;
import java.util.Objects;

public class DomainList {

    List<Domain> domains;

    public DomainList() {
    }

    public DomainList(List<Domain> domains) {
        this.domains = domains;
    }

    public List<Domain> getDomains() {
        return domains;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DomainList)) return false;
        DomainList that = (DomainList) o;
        return Objects.equals(getDomains(), that.getDomains());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDomains());
    }

    public void setDomains(List<Domain> domains) {
        this.domains = domains;
    }
}
