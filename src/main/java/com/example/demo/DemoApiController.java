package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api")
public class DemoApiController {

    @Autowired
    AnnuaireService annuaireService;

    @GetMapping("personnes")
    public List<Personne> getPersonnes(){
        return annuaireService.getPersonnes();
    }

    @PostMapping("personnes")
    public void createPersonne(@RequestBody Personne personne){
        annuaireService.addPersonne(personne);
    }

    @GetMapping("personnes/{id}")
    public Personne getOnePersonne(@PathVariable Integer id){
        return annuaireService.getPersonneById(id);
    }
}
