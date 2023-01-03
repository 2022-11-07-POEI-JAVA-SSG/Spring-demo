package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("admin/api")
public class AdminController {

    @Autowired
    private AnnuaireService annuaireService;

    @DeleteMapping("personnes/{id}")
    public ResponseEntity deletePersonne(@PathVariable Integer id){
        Personne p = annuaireService.getPersonneById(id);
        if(p == null){
            // indiquer status code : 404
            return ResponseEntity.notFound().build();
        } else {
            annuaireService.delete(id);
            // indiquer status code : 200
            return ResponseEntity.ok().build();
        }
    }

    @PutMapping("personnes/{id}")
    public ResponseEntity updatePersonne(@PathVariable Integer id, @RequestBody Personne personne){
        if(!id.equals(personne.getId())){
            return ResponseEntity.badRequest().build();
        } else {
            Personne p = annuaireService.getPersonneById(id);
            if(p == null){
                // indiquer status code : 404
                return ResponseEntity.notFound().build();
            } else {
                annuaireService.updatePersonne(id, personne);
                return ResponseEntity.ok().build();
            }
        }


    }

}
