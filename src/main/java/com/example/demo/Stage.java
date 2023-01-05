package com.example.demo;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "stages")
public class Stage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nom;
    private LocalDateTime horaire;

    @ManyToMany(fetch = FetchType.EAGER) // Collections are lazy-loaded by default
    List<Personne> stagiaires  = new ArrayList<>();

    public Stage(String nom, LocalDateTime horaire) {
        this.nom = nom;
        this.horaire = horaire;
    }

    public Stage() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public LocalDateTime getHoraire() {
        return horaire;
    }

    public void setHoraire(LocalDateTime horaire) {
        this.horaire = horaire;
    }

    public List<Personne> getStagiaires() {
        return stagiaires;
    }

    public void setStagiaires(List<Personne> stagiaires) {
        this.stagiaires = stagiaires;
    }

    public void addStagiaire(Personne p) {
        stagiaires.add(p);
    }

    @Override
    public String toString() {
        return "Stage{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", horaire=" + horaire +
                '}';
    }
}
