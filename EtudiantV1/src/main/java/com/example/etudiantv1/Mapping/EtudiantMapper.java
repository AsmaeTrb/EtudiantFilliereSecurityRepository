package com.example.etudiantv1.Mapping;

import com.example.etudiantv1.DTO.EtudiantRequest;
import com.example.etudiantv1.DTO.EtudiantResponse;
import com.example.etudiantv1.DTO.FilliereDto;
import com.example.etudiantv1.Entities.Etudiant;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class EtudiantMapper {

    public Etudiant dtoToEntity(EtudiantRequest etudiantRequest) {
        Etudiant etudiant = new Etudiant();
        etudiant.setNom(etudiantRequest.getNom());
        etudiant.setPrenom(etudiantRequest.getPrenom());
        etudiant.setCne(etudiantRequest.getCne());
        etudiant.setFilliereId(etudiantRequest.getFilliereId());
        return etudiant;
    }
    public EtudiantResponse entityToDto ( Etudiant etudiant) {
        EtudiantResponse etudiantResponse = new EtudiantResponse();
        etudiantResponse.setId(etudiant.getId());
        etudiantResponse.setNom(etudiant.getNom());
        etudiantResponse.setPrenom(etudiant.getPrenom());
        etudiantResponse.setCne(etudiant.getCne());
        etudiantResponse.setFilliereId(etudiant.getFilliereId());
        return etudiantResponse;
    }
}
