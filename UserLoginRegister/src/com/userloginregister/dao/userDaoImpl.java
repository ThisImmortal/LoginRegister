package com.userloginregister.dao;

import java.util.List;

import javax.validation.Valid;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.userloginregister.entity.Login;
import com.userloginregister.entity.User;

@Repository
public class userDaoImpl implements userDao {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void registerUser(User theUser) {

		Session session = sessionFactory.getCurrentSession();

		session.saveOrUpdate(theUser);

	}

	@Override
	public User userIsValid(Login login) {

		try {
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		Session session = sessionFactory.openSession();

		String email = login.getEmail();
		String password = login.getPassword();

		String SQLScript = "from User as u where u.email=:email and u.password=:password";

		Query<User> query = session.createQuery(SQLScript);
		query.setParameter("email", email);
		query.setParameter("password", password);

		List<User> userList = query.getResultList();
		User user = null;

		if (userList != null && userList.size() > 0) {

			user = userList.get(0);

		}

		return user;
	}

	@Override
	public User getUserById(int theId) {
		
		
		Session session = sessionFactory.getCurrentSession();
		User theUser = session.get(User.class, theId);
		
		
		return theUser;
	}

	@Override
	public void updateUserInfo(@Valid User theUser) {
		
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(theUser);
		
	}

}
