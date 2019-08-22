package application.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import application.model.Offer;
import application.model.User;
import application.service.OfferService;

@RestController()
public class HelloController {
	
	@Autowired
	OfferService offerService;

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }
    
    @RequestMapping("/myUser")
    public User myUser() {
    	User myUser = new User();
    	/*try {
    		throw new Exception();
    	} catch (Exception e) {
    		myUser.setName("Catch");
    		//Integer.valueOf("aaa");
    		throw new Exception();
    		//return myUser;
    	} finally {
    		myUser.setName("Finally");
    		return myUser;
    	}*/
    	
    	myUser.setName("Nikola");
    	myUser.setSurname("Milosevic");
    	return myUser;    	
    }
    
    @RequestMapping("/offers")
    public List<Offer> getOffers() {
    	return offerService.listLastResultsByStartDateDesc(5);
    }
    
    @RequestMapping(value="/offers", method=RequestMethod.POST)
    @ResponseBody
    public String addOffer(@RequestBody Offer offer) {
    	offer.setId(null);
    	offerService.add(offer);
		return "Ok";
    }
    

}
