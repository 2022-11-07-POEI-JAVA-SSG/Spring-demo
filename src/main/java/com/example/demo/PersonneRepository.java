package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PersonneRepository extends JpaRepository<Personne,Integer> {

    List<Personne> findAllByNom(String nom);
    List<Personne> findAllByNomAndPrenom(String prenom, String nom);
}
