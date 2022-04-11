package com.example.demo;

public class Bilter implements Comparable<Bilter> {
    private String film;
    private String fornavn;
    private String etternavn;
    private String telfon;
    private String epost;
    private String antall;


    public Bilter(String film, String fornavn, String etternavn, String telfon, String epost, String antall) {
        this.film = film;
        this.fornavn = fornavn;
        this.etternavn = etternavn;
        this.telfon = telfon;
        this.epost = epost;
        this.antall = antall;
    }
    public Bilter(){

    }

    public String getfilm() {
        return film;
    }

    public void setfilm(String film) {
        this.film = film;
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
    public int compareTo(Bilter o) {
       return getetternavn().compareTo(o.getetternavn());
    }
}

