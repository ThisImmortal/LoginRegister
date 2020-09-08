package com.userloginregister.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.context.annotation.Scope;

@Entity
@Table(name = "user")

public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@NotNull(message = "is required")
	@Size(min = 2, message = "is required")
	@Column(name = "first_name")
	private String firstName;

	@Column(name = "last_name")
	private String lastName;

	@Column(name = "country")
	private String country;

	@NotNull(message = "is required")
	@Email(message = "must be emayl")
	@Column(name = "email")
	private String email;

	@NotNull(message = "is required")
	@Size(min = 5, message = "Minimum 5 symbols")
    @Column(name = "password")
	private String password;

	@NotNull(message = "is required")
	@Size(min = 5, message = "Minimum 5 symbols")
    @Column(name = "rePassword")
	private String rePassword;

	@AssertTrue(message = "Passwords should match!") 
	private boolean isConditionTrue() {

		if(password==null || rePassword==null || password.length()<5 || rePassword.length()<5) {
			return true;
		}
		return this.password.equals(this.rePassword);
	}

	@Transient     //transient annotasiyasi hibernate-in bu property-ni ignore etmesine sebeb olur
	private boolean conditionTrue;

	public boolean getConditionTrue() {
		return conditionTrue;
	}

	public void setConditionTrue(boolean conditionTrue) {
		this.conditionTrue = conditionTrue;
	}

	public User() {

	}

	public User(String email, String password) {
		this.email = email;
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
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

	public String getRePassword() {
		return rePassword;
	}

	public void setRePassword(String rePassword) {
		this.rePassword = rePassword;
	}

}
