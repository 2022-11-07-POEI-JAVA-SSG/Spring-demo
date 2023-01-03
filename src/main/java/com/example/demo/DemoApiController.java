package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api")
public class DemoApiController {


    @Autowired
    AnnuaireDatabaseService annuaireDatabaseService;

    @PostMapping("personnes")
    public void createPersonne(@RequestBody Personne personne){
        annuaireDatabaseService.addPersonne(personne);
    }

    @GetMapping("personnes")
    public List<Personne> getPersonnes(){
        return annuaireDatabaseService.getPersonnes();
    }

    @GetMapping("personnes/{id}")
    public ResponseEntity getOnePersonne(@PathVariable Integer id){
        Optional<Personne> optional = annuaireDatabaseService.getPersonneById(id);
        if(optional.isEmpty()) {
            return ResponseEntity.notFound().build();
        } else {
            Personne personne = optional.get();
            return ResponseEntity.ok(personne);
        }
    }
  /*

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
    }*/
}
