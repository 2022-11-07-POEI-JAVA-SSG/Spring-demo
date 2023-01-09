package com.example.demo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PersonneMvcController {

    @GetMapping("personnes")
    public String affichePersonnes(){

        return "personnes.html";
    }
}
