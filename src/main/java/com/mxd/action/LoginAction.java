package com.mxd.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.mxd.service.LoginService;
import com.opensymphony.xwork2.ActionSupport;

@Controller
@Scope(scopeName="prototype")
public class LoginAction extends ActionSupport{
	private String username;
	private String password;
	@Autowired
	private LoginService loginService;
	
	public String execute(){
		loginService.saveUser(username,password);
		System.out.println(username+password);
		
		return SUCCESS;
	}
	
	public String toLogin(){
		
		return "success";
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	
}
