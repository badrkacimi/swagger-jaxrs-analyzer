package com.badr_hive.jax_rs_Analyzer;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.Collections;
import java.util.List;



@Path("Coffee")
@Produces(MediaType.APPLICATION_JSON)
public class CoffeeResource {
	
@GET
public List<Coffee> getCoffees(@QueryParam("type") String type){
	
	return Collections.emptyList();
	
}

@GET
@Path("{id}")
public Coffee  getCoffee(@QueryParam("id") String id){
	return null;


}


	




}
