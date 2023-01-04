package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
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
    public List<PersonneDTO> getPersonnes(){

        List<PersonneDTO> dtos = new ArrayList<>();
        List<Personne> entities = annuaireDatabaseService.getPersonnes();

        for(Personne entity : entities){
            PersonneDTO dto = PersonneMapper.convertToDTO(entity);
            dtos.add(dto);
        }

        return dtos;
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

    // findallbynom?nom=bond
    @GetMapping("findallbynom")
    public List<Personne> findAllByNom(@RequestParam String nom){
        return annuaireDatabaseService.getPersonnesByNom(nom);
    }

    // findallbynomandprenom?nom=bond&prenom=james
    @GetMapping("findallbynomandprenom")
    public List<Personne> findAllByNomAndPrenom(@RequestParam String nom, @RequestParam String prenom){
        return annuaireDatabaseService.getPersonnesByNomAndPrenom(nom, prenom);
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
