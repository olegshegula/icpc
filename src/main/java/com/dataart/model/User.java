package com.dataart.model;

import net.thucydides.junit.annotations.Qualifier;

public class User {

	private String firstNameField;
	private String middleNameField;
	private String lastNameField;
	private String emailField;
	private String passwordField;
	private String passwordRepeatField;
	private String role;
	private String school;

	public String getFirstNameField() {
		return firstNameField;
	}

	public void setFirstNameField(String firstNameField) {
		this.firstNameField = firstNameField;
	}

	public String getMiddleNameField() {
		return middleNameField;
	}

	public void setMiddleNameField(String middleNameField) {
		this.middleNameField = middleNameField;
	}

	public String getLastNameField() {
		return lastNameField;
	}

	public void setLastNameField(String lastNameField) {
		this.lastNameField = lastNameField;
	}

	public String getEmailField() {
		return emailField;
	}

	public void setEmailField(String emailField) {
		this.emailField = emailField;
	}

	public String getPasswordField() {
		return passwordField;
	}

	public void setPasswordField(String passwordField) {
		this.passwordField = passwordField;
	}

	public String getPasswordRepeatField() {
		return passwordRepeatField;
	}

	public void setPasswordRepeatField(String passwordRepeatField) {
		this.passwordRepeatField = passwordRepeatField;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

}
