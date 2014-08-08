package com.dataart.jbehave;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import com.dataart.steps.UserLoginSteps;

import net.thucydides.core.annotations.Steps;
import net.thucydides.jbehave.ThucydidesJUnitStories;

public class LoginTestSuite extends ThucydidesJUnitStories {

	@Steps
	UserLoginSteps user;

	@Given("the user is on the Login page")
	public void givenTheUserIsOnTheLoginPage() {
		user.is_on_the_login_page();

	}

	@When("the user enters name: $userName and password: $password and click the 'login' button")
	public void whenTheUserEnterLoginAndPassword(String userName,
			String password) {
		user.enter(userName, password);
		user.click_login_button();

	}

	@Then("user should see a welcome message $message")
	public void userShouldSeeAWelcomeMessage(String message) {

		user.should_see_a_welcome_message(message);

	}
	
	@Then("user should see a flash message $message")
	public void userShouldSeeAFlashMessage(String message) {

		user.should_see_a_flash_message(message);

	}
	

}
