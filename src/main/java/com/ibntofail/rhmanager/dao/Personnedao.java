package com.ibntofail.rhmanager.dao;
import com.ibntofail.rhmanager.model.Personne;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

@Repository
public class Personnedao {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	
	
	public Personne findByEmail(String email) {
		 return entityManager.find(Personne.class, email);
	}
	
	
	public boolean Findlogin(String email, String password ) {
		boolean bool;
		Personne personne=new Personne();
		personne = findByEmail(email);
		if(personne.getEmail() != "" && personne.getPassword() == password) {
			return bool=true;
		}
		return bool=false;
	}
}
