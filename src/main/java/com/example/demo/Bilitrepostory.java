package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

@Repository
public class Bilitrepostory {
    @Autowired
    private JdbcTemplate db;

    public void leggTilkunde(Bilter innbilter){
        String sql = "INSERT INTO Bilter (film , fornavn , etternavn, telfon, epost,antall)VALUES(?,?,?,?,?,?)";
        db.update(sql, innbilter.getfilm(),innbilter.getfornavn(),innbilter.getetternavn(),
                innbilter.gettelfon(),innbilter.getepost(),innbilter.getantall() );

    }
    public List<Bilter> hentalle(){
        String sql = "SELECT * FROM Bilter ";
        List<Bilter>allebilter=db.query(sql,new BeanPropertyRowMapper(Bilter.class));
        Collections.sort(allebilter);
        return allebilter;
    }
     public  void sletall(){
        String sql = "DELETE FROM BILTER";
        db.update(sql);
     }
}
