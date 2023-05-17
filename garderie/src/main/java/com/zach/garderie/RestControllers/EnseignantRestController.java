package com.zach.garderie.RestControllers;

import com.zach.garderie.entities.Classe;
import com.zach.garderie.entities.Enseignant;
import com.zach.garderie.service.EnseignantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/enseignant")
@CrossOrigin
public class EnseignantRestController {
    @Autowired
    private EnseignantService enseignantService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Enseignant> getAllEnseignant() {
        return enseignantService.getAllEnseignants();
    }


    @RequestMapping(value="/{id}",method = RequestMethod.GET)
    public Enseignant getEnseignantById(@PathVariable("id") Long id) {
        return enseignantService.getEnseignant(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public Enseignant createEnseignant(@RequestBody Enseignant enseignant) {
        return enseignantService.saveEnseignant(enseignant);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public Enseignant updateEnseignant(@RequestBody Enseignant enseignant) {
        return enseignantService.updateEnseignant(enseignant);
    }

    @RequestMapping(value="/{id}",method = RequestMethod.DELETE)
    public void deleteEnseignant(@PathVariable("id") Long id)
    {
        enseignantService.deleteEnseignantById(id);
    }


    @RequestMapping(value="/count",method = RequestMethod.GET)
    public int countAllBy() {
        return enseignantService.countAllBy();
    }
    @RequestMapping(value="/cin/{cin}",method = RequestMethod.GET)
    public List<Enseignant> findByCin(@PathVariable("cin") Long cin) {
        return enseignantService.findByCin(cin);
    }



}
