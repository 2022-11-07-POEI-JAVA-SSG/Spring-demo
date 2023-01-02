package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("admin/api")
public class AdminController {

    @Autowired
    private AnnuaireService annuaireService;

    @DeleteMapping("personnes/{id}")
    public void deletePersonne(@PathVariable Integer id){
        annuaireService.delete(id);
    }

}
