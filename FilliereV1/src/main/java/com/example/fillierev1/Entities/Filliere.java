package com.example.fillierev1.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicInsert;

@Entity
@NoArgsConstructor
@AllArgsConstructor

public class Filliere {
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idfilliere;
    @Column(unique = true, nullable = false)
    private String code;
    @Column(nullable = false)
     private String libelle;
    // --- GETTERS ---
    public Integer getIdfilliere() {
        return idfilliere;
    }

    public String getCode() {
        return code;
    }

    public String getLibelle() {
        return libelle;
    }

    // --- SETTERS ---
    public void setIdfilliere(Integer idfilliere) {
        this.idfilliere = idfilliere;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

}
