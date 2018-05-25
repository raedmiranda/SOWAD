package com.sowad.t2.app.models.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.sowad.t2.app.models.entity.Plato;

@Repository
public class PlatoDaoImpl implements IPlatoDao {

	@PersistenceContext
	private EntityManager em;
	
	@SuppressWarnings("unchecked")
	@Transactional(readOnly=true)
	@Override
	public List<Plato> findAll() {
		return em.createQuery("from Plato").getResultList();
	}

}
