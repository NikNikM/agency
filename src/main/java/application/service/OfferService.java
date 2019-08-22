package application.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import application.model.Offer;
import application.repositories.OfferRepository;
import application.repositories.OfferRepositoryImpl;

@Service
public class OfferService {
	@Autowired
    private OfferRepository offerRepository;
	
	@Autowired
	private OfferRepositoryImpl offerRepositoryImpl;
 
    public List<Offer> list() {
    	return offerRepository.findAll();
    }
    
    public Offer add(Offer offer) {
    	return offerRepository.save(offer);
    }
    
    public List<Offer> listLastResultsByStartDateDesc(int numberOfResults){
    	return offerRepositoryImpl.findLastResultsByStartDateDesc(numberOfResults);
    }
}
