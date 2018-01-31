package com.mxd.dao;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.mxd.model.User;


@Repository
public class LoginDao {
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	public void saveUser(String username,String password){
		User user = new User();
		user.setUsername(username);
		user.setPassword(password);
		
		hibernateTemplate.save(user);
	}


}
