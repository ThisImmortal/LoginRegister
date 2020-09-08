package com.userloginregister.entity;


import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


public class Login {
	
	
	@NotNull(message = "is required")
	@Size(min = 1, message = "is required")
	@Email(message = "Must be email")
	private String email;
	
	
	@NotNull(message = "is required")
	@Size(min = 1, message = "is required")
	private String password;
	
	public Login() {
		
		
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
