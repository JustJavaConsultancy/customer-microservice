package ng.com.justjava.service;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import ng.com.justjava.entity.Customer;

@ApplicationScoped
public class CustomerServiceLayer {
	
    @Inject
    EntityManager em;
    
    public String customer(String name) {
        return "Customer 1";
    }
    
    @Transactional
    public void createCustomer(String firstName, String lastName) {
    	Customer customer = new Customer();
    	customer.setFirstName(firstName);
    	customer.setLastName(lastName);
    	em.persist(customer);
    }
}
