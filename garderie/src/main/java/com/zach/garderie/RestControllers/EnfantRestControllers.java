package com.zach.garderie.RestControllers;

import com.zach.garderie.entities.Enfant;
import com.zach.garderie.entities.Enseignant;
import com.zach.garderie.service.EnfantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/enfant")
@CrossOrigin(origins = "*")
public class EnfantRestControllers {
    @Autowired
    private EnfantService enfantService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Enfant> getAllEnfant() {
        return enfantService.getAllEnfants();
    }


    @RequestMapping(value="/{id}",method = RequestMethod.GET)
    public Enfant getEnfantById(@PathVariable("id") Long id) {
        return enfantService.getEnfant(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public Enfant createEnfant(@RequestBody Enfant enfant) {
        return enfantService.saveEnfant(enfant);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public Enfant updateEnfant(@RequestBody Enfant enfant) {
        return enfantService.updateEnfant(enfant);
    }

    @RequestMapping(value="/{id}",method = RequestMethod.DELETE)
    public void deleteEnfant(@PathVariable("id") Long id)
    {
        enfantService.deleteEnfantById(id);
    }


    @RequestMapping(value="/count",method = RequestMethod.GET)
    public int countAllBy() {
        return enfantService.countAllBy();
    }
    @RequestMapping(value="/identifiant/{identifiant}",method = RequestMethod.GET)
    public List<Enfant> findByIdentifiant(@PathVariable("identifiant") Long identifiant) {
        return enfantService.findByIdentifiant(identifiant);
    }




}
