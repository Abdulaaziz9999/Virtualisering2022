package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class controller {
   @Autowired
   private Bilitrepostory rep;

    @GetMapping("/hentAlle")
    public List<Bilter> hentAlle() {
        return rep.hentalle();
    }

    @PostMapping("/lagre")
    public void leggTilkunde(Bilter innbilt) {
        rep.leggTilkunde(innbilt);
    }
    @GetMapping("slettAlle")
    public void slettAlle(){
        rep.sletall();
    }



}
