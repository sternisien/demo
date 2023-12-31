package com.example.spring.jpa.demo.dto;

public class ProprietaireDto {

  private Long id;

  private String prenom;

  private String nom;

  public ProprietaireDto() {}

  public ProprietaireDto(Long id, String prenom, String nom) {
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
