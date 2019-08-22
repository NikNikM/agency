package application.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import application.model.Offer;

@Repository
public interface OfferRepository extends JpaRepository<Offer, Long> {
	
	// LIMIT not supported
	//@Query("select o from OFFER o order by start_date desc LIMIT :numberOfResults")
	//List<Offer> findLastResultsByStartDateDesc(@Param("numberOfResults") int numberOfResults);
	
}
