package ng.com.justjava;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import ng.com.justjava.service.CustomerServiceLayer;

@Path("/customers")
public class CustomerService {

    @Inject
    CustomerServiceLayer service;
    
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello Here!!";
    }
    
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/customer/{id}")
    public String greeting(@PathParam("id") String id) {
    	service.createCustomer("Akinyemi", "Akinrinde");
        return service.customer(id);
    }    
}