package com.zach.garderie.service;

import com.zach.garderie.entities.Classe;
import com.zach.garderie.repos.ClasseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class ClasseServiceImpl implements ClasseService{
@Autowired
    ClasseRepository classeRepository;
    @Override
    public Classe saveClasse(Classe c) {
        return classeRepository.save(c);
    }

    @Override
    public Classe updateClasse(Classe c) {
        return classeRepository.save(c);
    }

    @Override
    public void deleteClasse(Classe c) {
classeRepository.delete(c);
    }

    @Override
    public void deleteClasseById(Long id) {
classeRepository.deleteById(id);
    }

    @Override
    public Classe getClasse(Long id) {
        return classeRepository.findById(id).get();
    }

    @Override
    public List<Classe> getAllClasses() {
        return classeRepository.findAll();
    }

    @Override
    public int countAllBy() {
        return classeRepository.countAllBy();
    }

    @Override
    public List<Classe> findByNumClasse(int numClasse) {
        return classeRepository.findByNumClasse(numClasse);
    }
}
