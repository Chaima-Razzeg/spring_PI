package com.zach.garderie.service;

import com.zach.garderie.entities.Enseignant;

import java.util.List;

public interface EnseignantService {
    Enseignant saveEnseignant(Enseignant e);
    Enseignant updateEnseignant(Enseignant e);
    void deleteEnseignant(Enseignant e);
    void deleteEnseignantById(Long id);
    Enseignant getEnseignant(Long id);
    List<Enseignant> getAllEnseignants();
    int countAllBy();
    List<Enseignant> findByCin(Long cin);

}
