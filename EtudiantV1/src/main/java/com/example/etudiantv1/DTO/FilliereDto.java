package com.example.etudiantv1.DTO;

import lombok.Data;
public class FilliereDto {
    private Integer id;
    private String code;
    private String libelle;

    public Integer getId() {
        return id;
    }

    public String getCode() {
        return code;
    }
    public String getLibelle() {
        return libelle;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

}
