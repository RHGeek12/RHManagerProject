package com.ibntofail.rhmanager.dao;

import com.ibntofail.rhmanager.model.Enseignant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.orm.jpa.EntityManagerFactoryUtils;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class EnseignantDao {

    @PersistenceContext
    private EntityManager entityManager;

    public void create(Enseignant enseignant) {
        entityManager.persist(enseignant);
    }

    public void update(Enseignant enseignant) {
        entityManager.merge(enseignant);
    }

    public Enseignant findById(Long id) {
        return entityManager.find(Enseignant.class, id);
    }

    public void delete(Long id) {
        Enseignant enseignant = findById(id);
        if (enseignant != null) {
            entityManager.remove(enseignant);
        }
    }

}
