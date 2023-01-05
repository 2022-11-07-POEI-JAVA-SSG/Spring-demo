package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class ChienController {

    @Autowired
    ChienService chienService;

    @PostMapping("chiens")
    public void createChien(@RequestBody Chien chien){

        System.out.println(chien);
        chienService.saveChien(chien);
    }
}
