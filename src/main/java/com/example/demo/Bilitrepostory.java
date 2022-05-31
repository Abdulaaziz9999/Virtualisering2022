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

    public void leggTilkunde(Kamper innKamper){
        String sql = "INSERT INTO Kamper (kamp , fornavn , etternavn, telfon, epost,antall)VALUES(?,?,?,?,?,?)";
        db.update(sql, innKamper.getkamp(),innKamper.getfornavn(),innKamper.getetternavn(),
                innKamper.gettelfon(),innKamper.getepost(),innKamper.getantall() );

    }
    public List<Kamper> hentalle(){
        String sql = "SELECT * FROM Kamper ";
        List<Kamper>alleKamper=db.query(sql,new BeanPropertyRowMapper(Kamper.class));
        Collections.sort(alleKamper);
        return alleKamper;
    }
     public  void sletall(){
        String sql = "DELETE FROM Kamper";
        db.update(sql);
     }
}
