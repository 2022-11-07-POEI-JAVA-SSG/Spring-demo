package com.example.demo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PersonneMvcController {

    @GetMapping("personnes")
    public String affichePersonnes(Model model){

        String prenom = "Jean-Christophe";
        model.addAttribute("prenom", prenom);

        return "personnes.html";
    }
}