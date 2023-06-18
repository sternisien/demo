package com.example.spring.jpa.demo.service;


import com.example.spring.jpa.demo.dto.ProprietaireDto;
import com.example.spring.jpa.demo.entities.Proprietaire;
import com.example.spring.jpa.demo.repository.ProprietaireRepository;
import com.github.dozermapper.core.Mapper;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProprietaireService {

  private final ProprietaireRepository proprietaireRepository;
  private final Mapper mapper;

  public ProprietaireService(
    ProprietaireRepository proprietaireRepository, Mapper mapper) {
    this.proprietaireRepository = proprietaireRepository;
    this.mapper = mapper;
  }

  public Long insertNouveauProprietaire(ProprietaireDto proprietaireDto) throws Exception {
    Proprietaire newProprio = mapper.map(proprietaireDto, Proprietaire.class);
    proprietaireRepository.save(newProprio);
   proprietaireRepository.saveAndFlush(newProprio);
    return newProprio.getId();
  }

  public List<ProprietaireDto> getTousLesProprietaires() throws Exception {
    return proprietaireRepository.findAll().stream()
        .map(proprietaire -> mapper.map(proprietaire, ProprietaireDto.class))
        .collect(Collectors.toList());
  }

  public ProprietaireDto getProprietaireById(Long id) throws Exception {
    return mapper.map(proprietaireRepository.findById(id), ProprietaireDto.class);
  }

  public void deleteProprietaireById(Long id) throws Exception {
    proprietaireRepository.deleteById(id);
  }
}
