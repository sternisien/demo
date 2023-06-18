package com.example.spring.jpa.demo.repository;

import com.example.spring.jpa.demo.entities.Proprietaire;
import com.example.spring.jpa.demo.entities.Voiture;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VoitureRepository extends JpaRepository<Voiture, Long> {
}
