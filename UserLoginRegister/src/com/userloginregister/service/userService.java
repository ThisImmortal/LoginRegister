package com.userloginregister.service;

import javax.validation.Valid;

import com.userloginregister.entity.Login;
import com.userloginregister.entity.User;

public interface userService {
	
	public void registerUser(User theUser);

	public User userIsValid(Login login);

	public User getUserById(int theId);

	public void updateUserInfo(@Valid User theUser);

	public String getPasswordForEmail(String email);

	

}
