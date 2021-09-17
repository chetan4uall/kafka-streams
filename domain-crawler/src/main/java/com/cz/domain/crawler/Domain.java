package com.cz.domain.crawler;

import java.util.Objects;

public class Domain {

    String domain;
    String create_date;
    String update_date;
    String country;
    boolean isDead;
    String A;
    String NS;
    String CNAME;
    String MX;
    String TXT;

    public Domain() {

    }

    public Domain(String domain, String create_date, String update_date, String country, boolean isDead, String a, String NS, String CNAME, String MX, String TXT) {
        this.domain = domain;
        this.create_date = create_date;
        this.update_date = update_date;
        this.country = country;
        this.isDead = isDead;
        A = a;
        this.NS = NS;
        this.CNAME = CNAME;
        this.MX = MX;
        this.TXT = TXT;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getCreate_date() {
        return create_date;
    }

    public void setCreate_date(String create_date) {
        this.create_date = create_date;
    }

    public String getUpdate_date() {
        return update_date;
    }

    public void setUpdate_date(String update_date) {
        this.update_date = update_date;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public boolean isDead() {
        return isDead;
    }

    public void setDead(boolean dead) {
        isDead = dead;
    }

    public String getA() {
        return A;
    }

    public void setA(String a) {
        A = a;
    }

    public String getNS() {
        return NS;
    }

    public void setNS(String NS) {
        this.NS = NS;
    }

    public String getCNAME() {
        return CNAME;
    }

    public void setCNAME(String CNAME) {
        this.CNAME = CNAME;
    }

    public String getMX() {
        return MX;
    }

    public void setMX(String MX) {
        this.MX = MX;
    }

    public String getTXT() {
        return TXT;
    }

    public void setTXT(String TXT) {
        this.TXT = TXT;
    }

    @Override
    public String toString() {
        return "Domain{" +
                "domain='" + domain + '\'' +
                ", create_date='" + create_date + '\'' +
                ", update_date='" + update_date + '\'' +
                ", country='" + country + '\'' +
                ", isDead=" + isDead +
                ", A='" + A + '\'' +
                ", NS='" + NS + '\'' +
                ", CNAME='" + CNAME + '\'' +
                ", MX='" + MX + '\'' +
                ", TXT='" + TXT + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Domain)) return false;
        Domain domain1 = (Domain) o;
        return isDead() == domain1.isDead() && Objects.equals(getDomain(), domain1.getDomain()) && Objects.equals(getCreate_date(), domain1.getCreate_date()) && Objects.equals(getUpdate_date(), domain1.getUpdate_date()) && Objects.equals(getCountry(), domain1.getCountry()) && Objects.equals(getA(), domain1.getA()) && Objects.equals(getNS(), domain1.getNS()) && Objects.equals(getCNAME(), domain1.getCNAME()) && Objects.equals(getMX(), domain1.getMX()) && Objects.equals(getTXT(), domain1.getTXT());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDomain(), getCreate_date(), getUpdate_date(), getCountry(), isDead(), getA(), getNS(), getCNAME(), getMX(), getTXT());
    }
}
