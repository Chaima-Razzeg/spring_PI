package com.zach.garderie.repos;

import com.zach.garderie.entities.Enseignant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EnseignantRepository extends JpaRepository<Enseignant, Long> {
    int countAllBy();
    @Query("select e from Enseignant e where e.Cin = ?1")
    List<Enseignant> findByCin(Long cin);
}
