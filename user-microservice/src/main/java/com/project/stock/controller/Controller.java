package com.project.stock.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.project.stock.entity.User;
import com.project.stock.service.RestService;

@RestController  
@CrossOrigin(origins="http://localhost:4200")  
 
public class Controller {
	
	@Autowired
	private RestService restService;;
	

	@PostMapping("/add-user") 
	public Boolean addUser(@RequestBody User user) {
		return restService.addUser(user);
	}
	
	
	@GetMapping("/getUserList")  
	public List<User> getUserList() {
		
		return restService.getUserList();
	}
	
	
	@GetMapping("/getUser/{name}/{password}/{type}") 
	public List<User> getUser(@PathVariable("name") String username,@PathVariable("password")String password,@PathVariable("type") String type) {
		return restService.getUser(username, password, type);
	}
	
	@GetMapping("/updateUser/{name}/{password}/{newpassword}/{email}/{mobileNumber}/{type}") 
	public Boolean updateUser(@PathVariable("name") String username,@PathVariable("password")String password,@PathVariable("newPassword")String newPassword,@PathVariable("email")String email,@PathVariable("mobileNumber")String mobileNumber,@PathVariable("type") String type) {
		return restService.updateUser(username, password, newPassword, email, mobileNumber, type);
	}

	

	
	
	
}
