package com.example.spring.jpa.demo.dto;

public class VoitureDto {


    private Long id;
    private String marque;
    private String immatriculation;


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

}


