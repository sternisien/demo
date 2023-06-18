package com.example.spring.jpa.demo.repository;

import com.example.spring.jpa.demo.entities.Proprietaire;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProprietaireRepository extends JpaRepository<Proprietaire, Long> {
}
