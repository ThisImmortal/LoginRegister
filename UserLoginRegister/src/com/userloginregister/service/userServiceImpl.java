package com.userloginregister.service;

import javax.transaction.Transactional;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.userloginregister.dao.userDao;
import com.userloginregister.entity.Login;
import com.userloginregister.entity.User;

@Service
public class userServiceImpl implements userService {
	
	@Autowired
	private userDao userDao;

	@Override
	@Transactional
	public void registerUser(User theUser) {
		
		userDao.registerUser(theUser);

	}

	@Override
	@Transactional
	public User userIsValid(Login login) {
		
		return userDao.userIsValid(login);
	}

	@Override
	@Transactional
	public User getUserById(int theId) {
		
		return userDao.getUserById(theId);
	}

	@Override
	@Transactional
	public void updateUserInfo(@Valid User theUser) {
		
		userDao.updateUserInfo(theUser);
		
	}

	@Override
	@Transactional
	public String getPasswordForEmail(String email) {
		
		return userDao.getPasswordForEmail(email);
	}

}
