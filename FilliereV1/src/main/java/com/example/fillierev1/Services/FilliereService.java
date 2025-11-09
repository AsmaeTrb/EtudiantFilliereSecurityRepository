package com.example.fillierev1.Services;

import com.example.fillierev1.DTO.FilliereRequest;
import com.example.fillierev1.DTO.FilliereResponse;
import com.example.fillierev1.Entities.Filliere;
import com.example.fillierev1.Mapper.FilliereMapper;
import com.example.fillierev1.Repository.FilliereRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FilliereService {
    FilliereRepository filliereRepository;
    FilliereMapper filliereMapper;
    public FilliereService(FilliereRepository filliereRepository, FilliereMapper filliereMapper) {
        this.filliereRepository = filliereRepository;
        this.filliereMapper = filliereMapper;
    }
    public FilliereResponse getById(Integer id) {
        Filliere filliere = filliereRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Filière non trouvée avec l'ID: " + id));
        return filliereMapper.entityToDto(filliere);
    }
    public FilliereResponse create (FilliereRequest filliereresquest) {
        Filliere filliere = filliereMapper.dtoToEntity(filliereresquest);
        Filliere saved =filliereRepository.save(filliere);
        return filliereMapper.entityToDto(saved);
    }
    public List<FilliereResponse> getAllFilliere() {
        List<Filliere> fillieres = filliereRepository.findAll();
        List<FilliereResponse> responses=new ArrayList<>();
        for (Filliere filliere : fillieres) {
            FilliereResponse response =filliereMapper.entityToDto(filliere);
            responses.add(response);
        }
   return responses;
    }
    public void deleteById(Integer id) {
        Filliere filliere=filliereRepository.findById(id).orElseThrow(() -> new RuntimeException("Étudiant non trouvé avec ID : " + id));
        filliereRepository.delete(filliere);
    }
}
