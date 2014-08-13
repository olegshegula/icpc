package com.dataart.jbehave;

import net.thucydides.core.annotations.Steps;
import net.thucydides.jbehave.ThucydidesJUnitStories;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import com.dataart.steps.UserLoginSteps;

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
	public void clickLoginButton() {

		user.click_login_button();
	}

	@Then("user loged out")
	public void clickLogoutLink() {

		user.click_logout_link();
	}

	@When("the user enters name: $username and click the 'login' button")
	public void userEntersLoginAndClicksButton(String userName) {
		user.enter(userName, "");
		user.click_login_button();
	}

	@When("the user enters password: $password and click the 'login' button")
	public void userEntersPasswordAndClicksButton(String password) {
		user.enter("", password);
		user.click_login_button();
	}

	@When("the user click on the Register now link")
	public void the_user_click_on_the_Register_now_link() {
		user.click_on_the_Register_now_link();
	}

	@When("the user click on the swich language button and choose $Русский")
	public void userClickOnTheSwichLanguageButtonAndChoose(String language) {

		user.click_on_the_swich_language_button_and_choose(language);
	}

	@Then("user should see the header $header")
	public void userShouldSeeTheHeader(String header) {

		user.user_should_see_the_header(header);
	}
	
	@When("the user click on the DA link")
	public void userClicksOnDALink(){
		user.user_clicks_on_DA_link();
	}
	
	@Then("user should be sent to DataArt page")
	public void verifyDAPage(){
		user.verify_DA_page();
	}
	
	@When("the user click on the GitHub link")
	public void userClicksOnGitHubLink(){
		user.user_clicks_on_GitHub_link();
	}
	
	@Then("user should be sent to GitHub's project page")
	public void verifyGithubPage(){
		user.verify_GitHub_page();
	}
	
	@When("the user click on the Twitter link")
	public void userClicksOnTwitterLink(){
		user.user_clicks_on_Twitter_link();
	}
	
	@Then("user should be sent to Twitter's project page")
	public void verifyTwitterPage(){
		user.verify_Twitter_page();
	}
	
	@Then("user should see correct project's email")
	public void verifyProjectEmail(){
		user.verify_project_email();
	}
	

}
