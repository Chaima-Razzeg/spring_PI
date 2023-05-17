package com.zach.garderie.service;

import com.zach.garderie.entities.Enfant;
import com.zach.garderie.entities.Enseignant;

import java.util.List;

public interface EnfantService {
    Enfant saveEnfant(Enfant e);
    Enfant updateEnfant(Enfant e);
    void deleteEnfant(Enfant e);
    void deleteEnfantById(Long id);
    Enfant getEnfant(Long id);
    List<Enfant> getAllEnfants();
    int countAllBy();
    List<Enfant> findByIdentifiant(Long identifiant);

}
