package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("admin/api")
public class AdminController {

    @Autowired
    private AnnuaireService annuaireService;

    @DeleteMapping("personnes/{id}")
    public void deletePersonne(@PathVariable Integer id){
        annuaireService.delete(id);
    }

    @PutMapping("personnes/{id}")
    public void updatePersonne(@PathVariable Integer id, @RequestBody Personne personne){
        annuaireService.updatePersonne(id, personne);
    }

}
