package com.zach.garderie.repos;

import com.zach.garderie.entities.Classe;
import com.zach.garderie.entities.Enfant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ClasseRepository extends JpaRepository<Classe, Long> {
    int countAllBy();
    @Query("select c from Classe c where c.numClasse= ?1")
    List<Classe> findByNumClasse(int numClasse);
}
