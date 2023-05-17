package com.zach.garderie.service;

import com.zach.garderie.entities.Classe;
import com.zach.garderie.entities.Enfant;

import java.util.List;

public interface ClasseService {
    Classe saveClasse(Classe c);
    Classe updateClasse(Classe c);
    void deleteClasse(Classe c);
    void deleteClasseById(Long id);
    Classe getClasse(Long id);
    List<Classe> getAllClasses();
    int countAllBy();
    List<Classe> findByNumClasse(int numClasse);

}
