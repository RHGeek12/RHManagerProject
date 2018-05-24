package com.ibntofail.rhmanager.service;

import com.ibntofail.rhmanager.dao.EnseignantDao;
import com.ibntofail.rhmanager.model.Enseignant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.Table;

@Service
public class EnseignantService {

    @Autowired
    EnseignantDao enseignantDao;

    @Transactional
    public void create(Enseignant enseignant) {
        enseignantDao.create(enseignant);
    }

    @Transactional
    public void delete(Long id) {
        enseignantDao.delete(id);
    }



}
