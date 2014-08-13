package com.dataart.steps;

import org.junit.Assert;

import com.dataart.model.User;
import com.dataart.pages.RegistrationPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class UserRegistrationSteps extends ScenarioSteps {

	RegistrationPage registrationPage;

	@Step
	public void is_on_the_registration_page() {

		registrationPage.open();
	}

	@Step
	public void enter_all_correct_credentials() {
		registrationPage.enterCredentials();
	}

	@Step
	public void click_Sign_up() {

		registrationPage.clickSignUp();
	}

	@Step
	public void user_should_see_the_E_mail_confirmation_message(String message) {
		Assert.assertEquals(registrationPage.getConfirmationMessage(), message);

	}
	
	@Step
	public void user_should_see_the_warrning_messages_about_blank_fields(int numbers){
		Assert.assertEquals(registrationPage.getNumberOfWarrnings(),numbers);
		
	}
}
