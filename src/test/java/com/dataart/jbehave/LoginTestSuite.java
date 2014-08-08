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

	@Then("user should see a page title $message")
	public void userShouldSeeAPageTitleMessage(String message) {

		user.should_see_a_page_title(message);

	}
	
	@Then("user should see invalid flash message $message")
	public void userShouldSeeAFlashMessage(String message) {

		user.should_see_invalid_flash_message(message);

	}
	
	@When("the user click the login button")
	public void clickLoginButton(){
		
		user.click_login_button();
	}
	
	@Then("user loged out")
	public void clickLogoutLink(){
		
		user.click_logout_link();
	}
	
	@When("the user enters name: $username and click the 'login' button")
	public void userEntersLoginAndClicksButton(String userName){
		user.enter(userName, "");
		user.click_login_button();
	}
	
	@When("the user enters password: $password and click the 'login' button")
	public void userEntersPasswordAndClicksButton(String password){
		user.enter("", password);
		user.click_login_button();
	}
}
