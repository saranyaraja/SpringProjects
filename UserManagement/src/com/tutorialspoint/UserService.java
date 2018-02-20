package com.tutorialspoint;  

import java.util.List; 
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path; 
import javax.ws.rs.Produces; 
import javax.ws.rs.core.MediaType;  
@Path("/Service") 

public class UserService {  
   UserDao userDao = new UserDao();  
   @GET 
   @Path("/users") 
   @Produces(MediaType.APPLICATION_XML)
   public List<User> getUsers(){ 
	  System.out.println("getUsers Inside");
      return userDao.getAllUsers(); 
   }
   
   @GET 
   @Path("/user1") 
   @Produces(MediaType.APPLICATION_JSON)
   public List<User> getUsers1(){ 
	  System.out.println("getUsersJ Inside");
      return userDao.getAllUsers(); 
   }
   
   
   
}