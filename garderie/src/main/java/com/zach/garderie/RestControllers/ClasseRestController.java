package com.zach.garderie.RestControllers;

import com.zach.garderie.entities.Classe;
import com.zach.garderie.entities.Enfant;
import com.zach.garderie.service.ClasseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/classe")
@CrossOrigin

public class ClasseRestController {
@Autowired
private ClasseService classeService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Classe> getAllClasses() {
        return classeService.getAllClasses();
    }

    @RequestMapping(value="/{id}",method = RequestMethod.GET)
    public Classe getClasseById(@PathVariable("id") Long id) {
        return classeService.getClasse(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public Classe createClasse(@RequestBody Classe classe) {
        return classeService.saveClasse(classe);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public Classe updateClasse(@RequestBody Classe classe) {
        return classeService.updateClasse(classe);
    }

    @RequestMapping(value="/{id}",method = RequestMethod.DELETE)
    public void deleteClasse(@PathVariable("id") Long id)
    {
        classeService.deleteClasseById(id);
    }

    @RequestMapping(value="/count",method = RequestMethod.GET)
    public int countAllBy() {
        return classeService.countAllBy();
    }
    @RequestMapping(value="/num/{numClasse}",method = RequestMethod.GET)
    public List<Classe> findByNumClasse(@PathVariable("numClasse") int numClasse) {
        return classeService.findByNumClasse(numClasse);
    }






}
