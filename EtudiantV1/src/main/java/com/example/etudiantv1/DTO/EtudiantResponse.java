package com.example.etudiantv1.DTO;

public class EtudiantResponse {
    private Integer id;
    private String nom;
    private String prenom;
    private String cne;
    private Integer filliereId;
    private FilliereDto filliere;

    // ----- Getters -----
    public Integer getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getCne() {
        return cne;
    }

    public Integer getFilliereId() {
        return filliereId;
    }

    public FilliereDto getFilliere() {
        return filliere;
    }

    // ----- Setters -----
    public void setId(Integer id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setCne(String cne) {
        this.cne = cne;
    }

    public void setFilliereId(Integer filliereId) {
        this.filliereId = filliereId;
    }
    public void setFilliere(FilliereDto filliere) {
        this.filliere = filliere;
    }
}
