package com.dataart.jbehave;

import com.dataart.steps.UserLoginSteps;
import com.dataart.steps.UserRegistrationSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class GeneralSteps {

	@Steps
	UserRegistrationSteps userreg;

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
	public void userClicksOnDALink() {
		user.user_clicks_on_DA_link();
	}

	@Then("user should be sent to DataArt page")
	public void verifyDAPage() {
		user.verify_DA_page();
	}

	@When("the user click on the GitHub link")
	public void userClicksOnGitHubLink() {
		user.user_clicks_on_GitHub_link();
	}

	@Then("user should be sent to GitHub's project page")
	public void verifyGithubPage() {
		user.verify_GitHub_page();
	}

	@When("the user click on the Twitter link")
	public void userClicksOnTwitterLink() {
		user.user_clicks_on_Twitter_link();
	}

	@Then("user should be sent to Twitter's project page")
	public void verifyTwitterPage() {
		user.verify_Twitter_page();
	}

	@Then("user should see correct project's email")
	public void verifyProjectEmail() {
		user.verify_project_email();
	}

	@Given("the user is on the Registration page")
	public void givenTheUserIsOnTheRegisterPage() {
		userreg.is_on_the_registration_page();

	}

	@When("enter all correct credentials")
	public void enterAllCorrectCredentials() {
		userreg.enter_all_correct_credentials();

	}

	@When("user click Sign up")
	public void clickSignUp() {
		userreg.click_Sign_up();
	}

	@Then("user should see the E-mail confirmation message $message")
	public void userShouldSeeTheEMailConfirmationMessage(String message) {

		userreg.user_should_see_the_E_mail_confirmation_message(message);
	}

	@Then("user should see $7 warrning messages about blank fields")
	public void userShouldSeeTheWarrningMessagesAboutBlankFields(int number) {

		userreg.user_should_see_the_warrning_messages_about_blank_fields(number);
	}

	@Then("user should see the Resend email button")
	public void userShouldSeeTheResendEmailButton() {

		userreg.user_should_see_the_Resend_email_button();
	}
	
	@Then("user should see the News link")
	public void userShouldSeetheNewsLink(){
		user.is_News_Link_present();
	}
	
	@Then("user should see the Docs link")
	public void userShouldSeetheDocsLink(){
		user.is_Docs_Link_present();
	}
	
	@Then("user should see the Teams link")
	public void userShouldSeetheTeamsLink(){
		user.is_Teams_Link_present();
	}
	
	@Then("user should see the Results link")
	public void userShouldSeetheResultsLink(){
		user.is_Results_Link_present();
	}
	
	@Then("user should see the QA link")
	public void userShouldSeetheQALink(){
		user.is_QA_Link_present();
	}
	
	@When("user clicks on the News link")
	public void user_clicks_on_News_link(){
		user.user_clicks_on_News_link();
	}
	
	@Then("user is on the News page")
	public void verifyNewsPage(){
		user.verify_News_Page();
	}
	
	@When("user clicks on the Teams link")
	public void user_clicks_on_Teams_link(){
		user.user_clicks_on_Teams_link();
	}
	
	@Then("user is on the Teams page")
	public void verifyTeamsPage(){
		user.verify_Teams_Page();
	}
	
	@When("user clicks on the Results link")
	public void user_clicks_on_Results_link(){
		user.user_clicks_on_Results_link();
	}
	
	@Then("user is on the Results page")
	public void verifyResultsPage(){
		user.verify_Results_Page();
	}
	
	@When("user clicks on the QA link")
	public void user_clicks_on_QA_link(){
		user.user_clicks_on_QA_link();
	}
	
	@Then("user is on the QA page")
	public void verifyQAPage(){
		user.verify_QA_Page();
	}
	
	@When("user clicks on the Docs link and chooses Regulations item")
	public void user_clicks_on_the_Docs_link_and_chooses_Regulations_item(){
		user.click_Docs_and_choose_Regulations();
	}
	
	@Then("user is on the Regulations Docs page")
	public void verifyRegulationDocsPage(){
		user.verify_Regulation_Docs_Page();
	}
	
	@When("user clicks on the Docs link and chooses Guidance item")
	public void user_clicks_on_the_Docs_link_and_chooses_Guidance_item(){
		user.click_Docs_and_choose_Guidance();
	}
	
	@Then("user is on the Guidance Docs page")
	public void verifyGuidanceDocsPage(){
		user.verify_Guidance_Docs_Page();
	}
	
	@Then("user tries to download doc")
	public void verifyIfDocIsDownloadable(){
		user.verify_if_Doc_is_Downloadable();
	}
	
	

}