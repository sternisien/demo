package com.example.spring.jpa.demo.service;

import com.example.spring.jpa.demo.dto.VoitureDto;
import com.example.spring.jpa.demo.entities.Voiture;
import com.example.spring.jpa.demo.repository.VoitureRepository;
import com.github.dozermapper.core.Mapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class VoitureService {

    private final VoitureRepository voitureRepository;
    private final Mapper mapper;

    public VoitureService(VoitureRepository voitureRepository, Mapper mapper) {
        this.voitureRepository = voitureRepository;
        this.mapper = mapper;
    }

    public Long insertNouvelleVoiture(VoitureDto voitureDto) throws Exception {
        Voiture nouvelleVoiture = mapper.map(voitureDto, Voiture.class);
        voitureRepository.save(nouvelleVoiture);
        voitureRepository.flush();
        return nouvelleVoiture.getId();
    }

    public List<VoitureDto> getToutesLesVoitures() throws Exception {
        return voitureRepository.findAll().stream()
                .map(voiture -> mapper.map(voiture, VoitureDto.class))
                .collect(Collectors.toList());
    }

    public VoitureDto getVoitureById(Long id) throws Exception {
        Voiture voiture = voitureRepository.findById(id).orElse(null);
        return mapper.map(voiture, VoitureDto.class);
    }

    public void deleteVoitureById(Long id) throws Exception {
        voitureRepository.deleteById(id);
    }
}
