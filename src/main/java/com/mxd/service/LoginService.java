package com.mxd.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mxd.dao.LoginDao;

@Service
@Transactional
public class LoginService {
	@Autowired
	private LoginDao loginDao;
	
	public void saveUser(String username,String password){
		loginDao.saveUser(username,password);
	}
	
}
