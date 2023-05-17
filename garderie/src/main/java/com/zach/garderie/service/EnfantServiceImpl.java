package com.zach.garderie.service;

import com.zach.garderie.entities.Enfant;
import com.zach.garderie.entities.Enseignant;
import com.zach.garderie.repos.EnfantRepository;
import com.zach.garderie.repos.EnseignantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class EnfantServiceImpl implements EnfantService{
    @Autowired
    EnfantRepository enfantRepository;
    @Override
    public Enfant saveEnfant(Enfant e) {
        return enfantRepository.save(e);
    }

    @Override
    public Enfant updateEnfant(Enfant e) {
        return enfantRepository.save(e);
    }

    @Override
    public void deleteEnfant(Enfant e) {
        enfantRepository.delete(e);
    }

    @Override
    public void deleteEnfantById(Long id) {
        enfantRepository.deleteById(id);
    }

    @Override
    public Enfant getEnfant(Long id) {
        return enfantRepository.findById(id).get();
    }

    @Override
    public List<Enfant> getAllEnfants() {
        return enfantRepository.findAll();
    }

    @Override
    public int countAllBy() {
        return enfantRepository.countAllBy();
    }

    @Override
    public List<Enfant> findByIdentifiant(Long identifiant) {
        return enfantRepository.findByIdentifiant(identifiant);

    }
}
