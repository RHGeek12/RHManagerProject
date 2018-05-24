package com.ibntofail.rhmanager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ibntofail.rhmanager.model.Enseignant;
import com.ibntofail.rhmanager.model.Personne;
import com.ibntofail.rhmanager.service.EnseignantService;
import com.ibntofail.rhmanager.service.PersonneService;

@Controller
public class EnseignantController {

    @Autowired
    private EnseignantService enseignantService;
    private PersonneService personneService;


    @RequestMapping("/create/enseignant")
    public void create() {
        Enseignant enseignant = new Enseignant();
        enseignant.setMatiere("industrie");
        enseignant.setDiplome("doctorat");
        enseignantService.create(enseignant);
    }

    @RequestMapping("/update/enseignant/{id}/{matiere}/{diplome}")
    public void updateEnseignant(@PathVariable String id, @PathVariable String matiere, @PathVariable String diplome) {
        Long longId = Long.getLong(id);
        Personne personne = new Personne();

        Enseignant enseignant = new Enseignant();
        enseignant.setId(longId);
        enseignant.setMatiere(matiere);
        enseignant.setDiplome(diplome);
        enseignantService.create(enseignant);
    }

    @RequestMapping("/delete/enseignant/{id}")
    public void deleteEnseignant(@PathVariable String id) {
        Long longId = Long.getLong(id);
        enseignantService.delete(longId);
    }
}
