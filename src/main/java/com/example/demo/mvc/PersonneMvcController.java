package com.example.demo.mvc;

import com.example.demo.AnnuaireDatabaseService;
import com.example.demo.Personne;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class PersonneMvcController {

    @Autowired
    private AnnuaireDatabaseService annuaireDatabaseService;

    @GetMapping("personnes")
    public String affichePersonnes(Model model, @RequestParam String prenom){

        List<Personne> personnes = annuaireDatabaseService.getPersonnes();
        model.addAttribute("personnes", personnes);

        model.addAttribute("prenom", prenom);


        return "personnes.html";
    }
}
