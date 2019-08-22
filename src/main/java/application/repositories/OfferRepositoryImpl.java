package application.repositories;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import application.model.Offer;

public class OfferRepositoryImpl {
	@PersistenceContext
    private EntityManager entityManager;
	
	public List<Offer> findLastResultsByStartDateDesc(int numberOfResults){
		return entityManager.createQuery("SELECT o FROM Offer o ORDER BY o.startDate",
		          Offer.class).setMaxResults(numberOfResults).getResultList();
	};
}
