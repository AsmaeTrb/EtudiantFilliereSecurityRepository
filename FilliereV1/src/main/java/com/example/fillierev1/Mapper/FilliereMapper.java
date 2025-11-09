package com.example.fillierev1.Mapper;

import com.example.fillierev1.DTO.FilliereRequest;
import com.example.fillierev1.DTO.FilliereResponse;
import com.example.fillierev1.Entities.Filliere;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class FilliereMapper {

    public Filliere dtoToEntity(FilliereRequest filliereRequest) {
        Filliere filliere = new Filliere();
        filliere.setCode(filliereRequest.getCode());
        filliere.setLibelle(filliereRequest.getLibelle());
        return filliere;
    }

    public FilliereResponse entityToDto(Filliere filliere) {
        FilliereResponse filliereResponse = new FilliereResponse();
        filliereResponse.setId(filliere.getIdfilliere());
        filliereResponse.setCode(filliere.getCode());
        filliereResponse.setLibelle(filliere.getLibelle());
        return filliereResponse;
    }
}
