package com.example.spring.jpa.demo.controller;

import com.example.spring.jpa.demo.dto.VoitureDto;
import com.example.spring.jpa.demo.service.VoitureService;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;

@RestController
@RequestMapping(value = "api/car")
public class VoitureController {

    private final VoitureService voitureService;

    public VoitureController(VoitureService voitureService) {
        this.voitureService = voitureService;
    }

    @GetMapping
    public ResponseEntity<List<VoitureDto>> getToutesLesVoitures() throws Exception {
        return ResponseEntity.status(HttpStatus.OK).body(voitureService.getToutesLesVoitures());
    }

    @GetMapping("/{id}")
    public ResponseEntity<VoitureDto> getVoitureParId(@PathVariable Long id) throws Exception {
        return ResponseEntity.status(HttpStatus.OK).body(voitureService.getVoitureById(id));
    }

    @PostMapping
    public ResponseEntity<Void> creerNouvelleVoiture(
            UriComponentsBuilder uriComponentsBuilder, @RequestBody VoitureDto voitureDto)
            throws Exception {
        Long id = voitureService.insertNouvelleVoiture(voitureDto);
        UriComponents uriComponents = uriComponentsBuilder.path("/{id}").buildAndExpand(id);
        return ResponseEntity.status(HttpStatus.CREATED)
                .header(HttpHeaders.LOCATION, uriComponents.toUriString())
                .build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> supprimerVoiture(@PathVariable Long id) throws Exception {
        voitureService.deleteVoitureById(id);
        return ResponseEntity.status(HttpStatus.OK).build();
    }
}
