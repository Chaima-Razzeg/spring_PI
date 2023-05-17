package com.zach.garderie.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
public class Enseignant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEnseignant;
    private Long Cin;
    private String NomEns;
    private String PrenomEns;
    private Date DateNaissEns;
    private String Adresse;
    private String Email;
    private int Tel;
    private String diplome;

    private String Specialite;
    @JsonIgnore

    @OneToMany(mappedBy = "enseignant")
    private List<Classe> classes;

    public Enseignant() {
        super();
    }

    public Enseignant(Long idEnseignant, Long cin, String nomEns, String prenomEns, Date dateNaissEns, String adresse,
                      String email, int tel, String diplome, List<Classe> classes, String specialite) {
        this.idEnseignant = idEnseignant;
        Cin = cin;
        NomEns = nomEns;
        PrenomEns = prenomEns;
        DateNaissEns = dateNaissEns;
        Adresse = adresse;
        Email = email;
        Tel = tel;
        this.diplome = diplome;
        this.classes = classes;
        this.Specialite=specialite;
    }

    public Long getIdEnseignant() {
        return idEnseignant;
    }

    public Long getCin() {
        return Cin;
    }

    public String getNomEns() {
        return NomEns;
    }

    public String getPrenomEns() {
        return PrenomEns;
    }

    public Date getDateNaissEns() {
        return DateNaissEns;
    }

    public String getAdresse() {
        return Adresse;
    }

    public String getEmail() {
        return Email;
    }

    public int getTel() {
        return Tel;
    }

    public String getDiplome() {
        return diplome;
    }

    public void setIdEnseignant(Long idEnseignant) {
        this.idEnseignant = idEnseignant;
    }

    public void setCin(Long cin) {
        Cin = cin;
    }

    public void setNomEns(String nomEns) {
        NomEns = nomEns;
    }

    public void setPrenomEns(String prenomEns) {
        PrenomEns = prenomEns;
    }

    public void setDateNaissEns(Date dateNaissEns) {
        DateNaissEns = dateNaissEns;
    }

    public void setAdresse(String adresse) {
        Adresse = adresse;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public void setTel(int tel) {
        Tel = tel;
    }

    public void setDiplome(String diplome) {
        this.diplome = diplome;
    }

    public List<Classe> getClasses() {
        return classes;
    }

    public void setClasses(List<Classe> classes) {
        this.classes = classes;
    }
    public String getSpecialite() {
        return Specialite;
    }

    public void setSpecialite(String specialite) {
        Specialite = specialite;   }


    @Override
    public String toString() {
        return "Enseignant{" +
                "idEnseignant=" + idEnseignant +
                ", Cin=" + Cin +
                ", NomEns='" + NomEns + '\'' +
                ", PrenomEns='" + PrenomEns + '\'' +
                ", DateNaissEns=" + DateNaissEns +
                ", Adresse='" + Adresse + '\'' +
                ", Email='" + Email + '\'' +
                ", Tel=" + Tel +
                ", diplome='" + diplome + '\'' +
                ", Spécialité='" + Specialite + '\'' +
                ", classes=" + classes +
                '}';
    }
}
