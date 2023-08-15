package com.demo.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.demo.model.Traveler;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class CreateTraveler {

	private static final Logger logger = LoggerFactory.getLogger(CreateTraveler.class);

	public static void main(String[] args) {

		logger.info("Started Creating Traveler Entity");

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("demoTravel");

		EntityManager entityManager = entityManagerFactory.createEntityManager();

		entityManager.getTransaction().begin();
		
		

		Traveler travelerNeil = new Traveler();
		travelerNeil.setName("Neil Armstrong");
		entityManager.persist(travelerNeil);
		
		

		Traveler travelerBuzz = new Traveler();
		travelerBuzz.setName("Buzz Aldrin");
		entityManager.persist(travelerBuzz);
		
		

		Traveler travelerMike = new Traveler();
		travelerMike.setName("Michael Collins");
		entityManager.persist(travelerMike);
		
		
		entityManager.getTransaction().commit();
		
		entityManager.close();
		
		entityManagerFactory.close();
		

	}

}
