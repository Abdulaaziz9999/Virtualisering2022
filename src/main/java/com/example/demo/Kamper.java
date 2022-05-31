package com.example.demo;

public class Kamper implements Comparable<Kamper> {
    private String kamp;
    private String fornavn;
    private String etternavn;
    private String telfon;
    private String epost;
    private String antall;


    public Kamper(String kamp, String fornavn, String etternavn, String telfon, String epost, String antall) {
        this.kamp = kamp;
        this.fornavn = fornavn;
        this.etternavn = etternavn;
        this.telfon = telfon;
        this.epost = epost;
        this.antall = antall;
    }
    public Kamper(){

    }

    public String getkamp() {
        return kamp;
    }

    public void setkamp(String kamp) {
        this.kamp = kamp;
    }

    public String getfornavn() {
        return fornavn;
    }

    public void setfornavn(String fornavn) {
        this.fornavn = fornavn;
    }

    public String getetternavn() {
        return etternavn;
    }

    public void setetternavn(String etternavn) {
        this.etternavn = etternavn;
    }

    public String gettelfon() {
        return telfon;
    }

    public void settelfon(String telfon) {
        this.telfon = telfon;
    }

    public String getepost() {
        return epost;
    }

    public void setepost(String epost) {
        this.epost = epost;
    }

    public String getantall() {
        return antall;
    }

    public void setantall(String antall) {
        this.antall = antall;
    }

    @Override
    public int compareTo(Kamper o) {
       return getetternavn().compareTo(o.getetternavn());
    }
}

