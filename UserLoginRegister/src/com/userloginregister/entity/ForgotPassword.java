package com.userloginregister.entity;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

public class ForgotPassword {

	@NotNull(message = "is required")
	@Email(message = "must be email")
	private String email;

	public ForgotPassword() {

	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
