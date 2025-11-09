package com.example.fillierev1.DTO;

import com.example.fillierev1.Entities.Filliere;
import lombok.Data;

@Data
public class FilliereResponse {
    private Integer id ;
    private String code;
    private String libelle ;
    public Integer getId() {
        return id;
    }

    public String getCode() {
        return code;
    }

    public String getLibelle() {
        return libelle;
    }

    // --- Setters ---
    public void setId(Integer idfilliere) {
        this.id = idfilliere;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }
}
