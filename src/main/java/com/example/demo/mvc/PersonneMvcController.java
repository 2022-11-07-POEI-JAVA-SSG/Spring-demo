package com.example.demo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PersonneMvcController {

    @GetMapping("personnes")
    public String affichePersonnes(Model model, @RequestParam String prenom){

        model.addAttribute("prenom", prenom);

        return "personnes.html";
    }
}
