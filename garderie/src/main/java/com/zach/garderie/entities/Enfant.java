package com.zach.garderie.entities;

import jakarta.persistence.*;

import java.util.Date;

@Entity

public class Enfant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEnfant;
    private Long identifiant;
    private String nomEnf;
    private String prenomEnf;
    private Date DateNaissEnf;
    @OneToOne
    private Image image;
    private String genre;

    private String adresse;
    private String tuteur;
    private int numTut;
    private String situationFam;
    private String residence;
    private String maladies;
    private String vaccin;
    private String infoSupp;

    @ManyToOne
    private Classe classe;


    public Enfant() {
        super();
    }

    public Enfant(Long idEnfant, Long identifiant, String nomEnf, String prenomEnf, Date dateNaissEnf,
                  Image image, String genre, String adresse, String tuteur, int numTut, String situationFam, String residence, String maladies, String vaccin, String infoSupp, Classe classe) {
        this.idEnfant = idEnfant;
        this.identifiant = identifiant;
        this.nomEnf = nomEnf;
        this.prenomEnf = prenomEnf;
        DateNaissEnf = dateNaissEnf;
        this.image = image;
        this.genre = genre;
        this.adresse = adresse;
        this.tuteur = tuteur;
        this.numTut = numTut;
        this.situationFam = situationFam;
        this.residence = residence;
        this.maladies = maladies;
        this.vaccin = vaccin;
        this.infoSupp = infoSupp;
        this.classe = classe;
    }

    public Long getIdEnfant() {
        return idEnfant;
    }

    public String getNomEnf() {
        return nomEnf;
    }

    public String getPrenomEnf() {
        return prenomEnf;
    }

    public Date getDateNaissEnf() {
        return DateNaissEnf;
    }

    public Image getImage() {
        return image;
    }

    public String getGenre() {
        return genre;
    }


    public String getAdresse() {
        return adresse;
    }

    public String getTuteur() {
        return tuteur;
    }

    public int getNumTut() {
        return numTut;
    }

    public String getSituationFam() {
        return situationFam;
    }

    public String getResidence() {
        return residence;
    }

    public String getMaladies() {
        return maladies;
    }

    public String getVaccin() {
        return vaccin;
    }

    public String getInfoSupp() {
        return infoSupp;
    }

    public void setIdEnfant(Long idEnfant) {
        this.idEnfant = idEnfant;
    }

    public void setNomEnf(String nomEnf) {
        this.nomEnf = nomEnf;
    }

    public void setPrenomEnf(String prenomEnf) {
        this.prenomEnf = prenomEnf;
    }

    public void setDateNaissEnf(Date dateNaissEnf) {
        DateNaissEnf = dateNaissEnf;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }


    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setTuteur(String tuteur) {
        this.tuteur = tuteur;
    }

    public void setNumTut(int numTut) {
        this.numTut = numTut;
    }

    public void setSituationFam(String situationFam) {
        this.situationFam = situationFam;
    }

    public void setResidence(String residence) {
        this.residence = residence;
    }

    public void setMaladies(String maladies) {
        this.maladies = maladies;
    }

    public void setVaccin(String vaccin) {
        this.vaccin = vaccin;
    }

    public void setInfoSupp(String infoSupp) {
        this.infoSupp = infoSupp;
    }

    public Classe getClasse() {
        return classe;
    }

    public void setClasse(Classe classe) {
        this.classe = classe;
    }

    public Long getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(Long identifiant) {
        this.identifiant = identifiant;
    }

    @Override
    public String toString() {
        return "Enfant{" +
                "idEnfant=" + idEnfant +
                ", identifiant=" + identifiant +
                ", nomEnf='" + nomEnf + '\'' +
                ", prenomEnf='" + prenomEnf + '\'' +
                ", DateNaissEnf=" + DateNaissEnf +
                ", image=" + image +
                ", genre='" + genre + '\'' +
                ", adresse='" + adresse + '\'' +
                ", tuteur='" + tuteur + '\'' +
                ", numTut=" + numTut +
                ", situationFam='" + situationFam + '\'' +
                ", residence='" + residence + '\'' +
                ", maladies='" + maladies + '\'' +
                ", vaccin='" + vaccin + '\'' +
                ", infoSupp='" + infoSupp + '\'' +
                ", classe=" + classe +
                '}';
    }
}
