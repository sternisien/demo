package com.example.spring.jpa.demo.entities;

import jakarta.persistence.*;
@Entity
@Table(name = "voiture")
public class Voiture {

  @Id
  @Column(name = "id")
  private Long id;

  @Column(name = "marque")
  private String marque;

  @Column(name = "immatriculation")
  private String immatriculation;

  @ManyToOne
  @JoinColumn(name = "proprio_id")
  private Proprietaire proprietaire;

  // Getter pour l'attribut id
  public Long getId() {
    return id;
  }

  // Setter pour l'attribut id
  public void setId(Long id) {
    this.id = id;
  }

  // Getter pour l'attribut marque
  public String getMarque() {
    return marque;
  }

  // Setter pour l'attribut marque
  public void setMarque(String marque) {
    this.marque = marque;
  }

  // Getter pour l'attribut immatriculation
  public String getImmatriculation() {
    return immatriculation;
  }

  // Setter pour l'attribut immatriculation
  public void setImmatriculation(String immatriculation) {
    this.immatriculation = immatriculation;
  }

  // Getter pour l'attribut proprietaire
  public Proprietaire getProprietaire() {
    return proprietaire;
  }

  // Setter pour l'attribut proprietaire
  public void setProprietaire(Proprietaire proprietaire) {
    this.proprietaire = proprietaire;
  }
}
