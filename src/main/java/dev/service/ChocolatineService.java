package dev.service;

import dev.entite.Chocolatine;

import javax.persistence.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChocolatineService {
	
	@Autowired
	private EntityManagerFactory emf;

	public ChocolatineService() {

	}

	public List<Chocolatine> listerChocolatine() {
		EntityManager em = emf.createEntityManager();
		TypedQuery<Chocolatine> q = em.createQuery("from Chocolatine", Chocolatine.class);
		List<Chocolatine> chocolatines = q.getResultList();
		em.close();
		return chocolatines;
	}

	public void ajouterChocolatine(Chocolatine chocolatine) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.persist(chocolatine);
		et.commit();
		em.close();
	}

}
