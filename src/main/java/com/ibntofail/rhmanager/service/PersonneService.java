package com.ibntofail.rhmanager.service;
import com.ibntofail.rhmanager.model.Personne;
import com.ibntofail.rhmanager.dao.Personnedao;
import com.ibntofail.rhmanager.model.Personne;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.Table;

@Service
public class PersonneService {

    @Autowired
    Personnedao personneDao;

    @Transactional
    public Personne findByEmail(String email) {
    	return personneDao.findByEmail(email);
    }
    
    @Transactional
    public boolean Findlogin(String email, String password ) {
    	return personneDao.Findlogin(email, password);
    }
    



}

