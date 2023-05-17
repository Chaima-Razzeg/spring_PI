package com.zach.garderie.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Classe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idClasse;
    private String numClasse;
    private int nbmaxEnfant;
    private String salle;
    @JsonIgnore

    @OneToMany(mappedBy = "classe")
    private List<Enfant> enfants;

    @ManyToOne
    private Enseignant enseignant;

    public Classe() {
        super();
    }

    public Classe(Long idClasse, String numClasse, int nbmaxEnfant, String salle, List<Enfant> enfants, Enseignant enseignant) {

        this.idClasse = idClasse;
        this.numClasse = numClasse;
        this.nbmaxEnfant = nbmaxEnfant;
        this.salle = salle;
        this.enfants = enfants;
        this.enseignant = enseignant;
    }

    public Long getIdClasse() {
        return idClasse;
    }

    public String getNumClasse() {
        return numClasse;
    }

    public int getNbmaxEnfant() {
        return nbmaxEnfant;
    }

    public String getSalle() {
        return salle;
    }

    public void setIdClasse(Long idClasse) {
        this.idClasse = idClasse;
    }

    public void setNumClasse(String numClasse) {
        this.numClasse = numClasse;
    }

    public void setNbmaxEnfant(int nbmaxEnfant) {
        this.nbmaxEnfant = nbmaxEnfant;
    }

    public void setSalle(String salle) {
        this.salle = salle;
    }

    public List<Enfant> getEnfants() {
        return enfants;
    }

    public void setEnfants(List<Enfant> enfants) {
        this.enfants = enfants;
    }

    public Enseignant getEnseignant() {
        return enseignant;
    }

    public void setEnseignant(Enseignant enseignant) {
        this.enseignant = enseignant;
    }

    @Override
    public String toString() {
        return "Classe{" +
                "idClasse=" + idClasse +
                ", numClasse=" + numClasse +
                ", nbmaxEnfant=" + nbmaxEnfant +
                ", salle='" + salle + '\'' +
                ", enfants=" + enfants +
                ", enseignant=" + enseignant +
                '}';
    }
}
