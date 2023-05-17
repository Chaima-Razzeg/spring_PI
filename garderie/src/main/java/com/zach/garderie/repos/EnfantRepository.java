package com.zach.garderie.repos;

import com.zach.garderie.entities.Enfant;
import com.zach.garderie.entities.Enseignant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EnfantRepository extends JpaRepository<Enfant, Long> {
        int countAllBy();
        @Query("select e from Enfant e where e.identifiant= ?1")
        List<Enfant> findByIdentifiant(Long identifiant);
        }
