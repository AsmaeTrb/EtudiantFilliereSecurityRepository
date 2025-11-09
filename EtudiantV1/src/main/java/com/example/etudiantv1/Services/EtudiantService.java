package com.example.etudiantv1.Services;

import com.example.etudiantv1.Client.FilliereClient;
import com.example.etudiantv1.DTO.EtudiantRequest;
import com.example.etudiantv1.DTO.EtudiantResponse;
import com.example.etudiantv1.DTO.FilliereDto;
import com.example.etudiantv1.Entities.Etudiant;
import com.example.etudiantv1.Mapping.EtudiantMapper;
import com.example.etudiantv1.Repository.EtudiantRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
@Service
public class EtudiantService {
   private final  EtudiantRepository  etudiantRepository;
   private final  EtudiantMapper etudiantMapper;
   private final FilliereClient filliereClient;
    public EtudiantService(EtudiantRepository etudiantRepository,
                           EtudiantMapper etudiantMapper,
                           FilliereClient filliereClient) {
        this.etudiantRepository = etudiantRepository;
        this.etudiantMapper = etudiantMapper;
        this.filliereClient = filliereClient;
    }


    public EtudiantResponse createEtudiant (EtudiantRequest etudiantRequest) {
        Etudiant etudiant = etudiantMapper.dtoToEntity(etudiantRequest);
        Etudiant saved =etudiantRepository.save(etudiant);
        FilliereDto filliere = filliereClient.getFiliereById(etudiantRequest.getFilliereId());
        EtudiantResponse response = etudiantMapper.entityToDto(saved);
        response.setFilliere(filliere);
        response.setFilliereId(etudiantRequest.getFilliereId()); // IMPORTANT !
        return response;
    }
    public List<EtudiantResponse> getALLEtudiant() {
        List<Etudiant> etudiants = etudiantRepository.findAll();
        List<EtudiantResponse> responses = new ArrayList<>();

        for (Etudiant etudiant : etudiants) {
            // Utiliser le mapper pour la conversion de base
            EtudiantResponse response = etudiantMapper.entityToDto(etudiant);

            // Ajouter manuellement les détails de la filière
            if (etudiant.getFilliereId() != null) {
                FilliereDto filliere = filliereClient.getFiliereById(etudiant.getFilliereId());
                response.setFilliere(filliere);
            }

            responses.add(response);
        }

        return responses;
    }

        public EtudiantResponse getEtudiantById(Integer id) {
            Etudiant etudiant = etudiantRepository.findById(id)
                    .orElseThrow(() -> new RuntimeException("Étudiant non trouvé avec ID : " + id));

            // Construction manuelle de la réponse
            EtudiantResponse response = new EtudiantResponse();
            response.setId(etudiant.getId());
            response.setNom(etudiant.getNom());
            response.setPrenom(etudiant.getPrenom());
            response.setCne(etudiant.getCne());
            response.setFilliereId(etudiant.getFilliereId());

            if (etudiant.getFilliereId() != null) {
                FilliereDto filliere = filliereClient.getFiliereById(etudiant.getFilliereId());
                response.setFilliere(filliere);
            }

            return response;
        }

    public EtudiantResponse UpdateEtudiant (Integer id,EtudiantRequest etudiantRequest) {
        Etudiant update=etudiantRepository.findById(id).orElseThrow(() -> new RuntimeException("Étudiant non trouvé"));
        FilliereDto filliere = filliereClient.getFiliereById(etudiantRequest.getFilliereId());
        update.setNom(etudiantRequest.getNom());
        update.setPrenom(etudiantRequest.getPrenom());
        update.setFilliereId(etudiantRequest.getFilliereId());
        update.setCne(etudiantRequest.getCne());
        Etudiant saved= etudiantRepository.save(update);
        EtudiantResponse response = etudiantMapper.entityToDto(saved);
        response.setFilliere(filliere);
        return response;
    }

    public void DeleteByid(Integer id) {
        Etudiant etudiant = etudiantRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Étudiant non trouvé avec ID : " + id));

        etudiantRepository.delete(etudiant);
    }



}
