package com.userloginregister.dao;

import javax.validation.Valid;

import com.userloginregister.entity.Login;
import com.userloginregister.entity.User;

public interface userDao {
	
	public void registerUser(User theUser);

	public User userIsValid(Login login);

	public User getUserById(int theId);

	public void updateUserInfo(@Valid User theUser);

	public String getPasswordForEmail(String email);

}
