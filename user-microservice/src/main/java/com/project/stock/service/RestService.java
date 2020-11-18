package com.project.stock.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.stock.entity.User;
import com.project.stock.repository.UserRepository;

@Service
public class RestService {
	@Autowired
	private UserRepository userRepository;
	
	
	public Boolean addUser(User user) {
		user.setStatus("OK");
		user.setType("user");
		userRepository.save(user);
		return true;
	}
	
	

	public List<User> getUserList() {
		List<User> userlist = new ArrayList<User>();
		userRepository.findAll().forEach(userlist::add);
		return userlist;
	}
	
	public List<User> getUser( String username,String password,String type) {
		List<User> user = new ArrayList<User>();
		User gotUser = userRepository.findByUserNameAndPasswordAndType(username, password,type).get();
		user.add(gotUser);
		return user;
	}
	
	public Boolean updateUser( String username,String password, String newPassword, String email, String mobileNumber, String type) {
	
		User gotUser = userRepository.findByUserNameAndPasswordAndType(username, password,type).get();
		gotUser.setPassword(newPassword);
		gotUser.setEmail(email);
		gotUser.setMobile_number(mobileNumber);
		gotUser.setType(type);
		userRepository.save(gotUser);
		
		return true;
	}





	
 
	
}
