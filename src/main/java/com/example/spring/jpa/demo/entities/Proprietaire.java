package com.example.spring.jpa.demo.entities;


import com.github.dozermapper.core.Mapping;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "proprietaire")
public class Proprietaire {

  @Id
  @Column(name = "id")
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ma_sequence")
  @SequenceGenerator(name = "ma_sequence", sequenceName = "proprietaire_seq", allocationSize = 1)
  @Mapping(optional = true)
  private Long id;

  @Column(name = "prenom")
  private String prenom;

  @Column(name = "nom")
  private String nom;


  @OneToMany(fetch = FetchType.LAZY, orphanRemoval = true)
  @JoinColumn(name = "proprietaire_id")
  private List<Voiture> mesVoitures;

  public Proprietaire() {}

  public Proprietaire(Long id, String prenom, String nom) {
    this.id = id;
    this.prenom = prenom;
    this.nom = nom;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getPrenom() {
    return prenom;
  }

  public void setPrenom(String prenom) {
    this.prenom = prenom;
  }

  public String getNom() {
    return nom;
  }

  public void setNom(String nom) {
    this.nom = nom;
  }
}
