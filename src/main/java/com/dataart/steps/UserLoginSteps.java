package com.dataart.steps;

import org.junit.Assert;

import com.dataart.pages.LoginPage;
import java.io.IOException;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class UserLoginSteps extends ScenarioSteps {

	LoginPage loginPage;

	@Step
	public void is_on_the_login_page() {

		loginPage.open();
		loginPage.chooseLanguage(LoginPage.EN_LANG_CHOOSE);
	}

	@Step
	public void enter(String userName, String password) {

		loginPage.enterLoginAndPassword(userName, password);
	}

	@Step
	public void click_login_button() {

		loginPage.clickLogin();

	}

	@Step
	public void click_logout_link() {

		loginPage.clickLogOut();
	}

	@Step
	public void should_see_a_page_title(String message) {

		Assert.assertEquals(loginPage.getPageTitle(), message);

	}

	@Step
	public void should_see_invalid_flash_message(String message) {

		Assert.assertEquals(loginPage.getInvalidFlashMessage(), message);

	}

	@Step
	public void click_on_the_Register_now_link() {

		loginPage.clickOnRegisterLink();
	}

	@Step
	public void click_on_the_swich_language_button_and_choose(String language) {

		loginPage.chooseLanguage(language);

	}

	@Step
	public void user_should_see_the_header(String header) {

		Assert.assertEquals(loginPage.getHearer(), header);

	}

	@Step
	public void user_clicks_on_DA_link() {
		loginPage.dataartLinkClick();
	}

	@Step
	public void user_clicks_on_GitHub_link() {
		loginPage.githubLinkClick();
	}

	@Step
	public void user_clicks_on_Twitter_link() {
		loginPage.twitterLinkClick();
	}

	@Step
	public void verify_DA_page() {
		loginPage.goToNewWindow();
		loginPage.driverWaitForTitle();
		Assert.assertEquals(loginPage.getPageTitle(), LoginPage.DA_PAGE_TITLE);
	}

	@Step
	public void verify_GitHub_page() {
		loginPage.goToNewWindow();
		loginPage.driverWaitForTitle();
		Assert.assertEquals(loginPage.getPageTitle(),
				LoginPage.GITHUB_PAGE_TITLE);
	}

	@Step
	public void verify_Twitter_page() {
		loginPage.goToNewWindow();
		loginPage.driverWaitForTitle();
		Assert.assertEquals(loginPage.getPageTitle(),
				LoginPage.TWITTER_PAGE_TITLE);
	}

	@Step
	public void verify_project_email() {
		Assert.assertEquals(loginPage.getEmailLinkTest(),
				LoginPage.MAILTO_LINK_TEXT);
	}
	
	@Step
	public void is_News_Link_present(){
		loginPage.chooseLanguage(LoginPage.EN_LANG_CHOOSE);
		Assert.assertTrue(loginPage.isElementPresent(LoginPage.newsLink));
	}
	
	@Step
	public void is_Docs_Link_present(){
		Assert.assertTrue(loginPage.isElementPresent(LoginPage.docsLink));
	}
	
	@Step
	public void is_Teams_Link_present(){
		Assert.assertTrue(loginPage.isElementPresent(LoginPage.teamsLink));
	}
	
	@Step
	public void is_Results_Link_present(){
		Assert.assertTrue(loginPage.isElementPresent(LoginPage.resultsLink));
	}
	
	@Step
	public void is_QA_Link_present(){
		Assert.assertTrue(loginPage.isElementPresent(LoginPage.qaLink));
	}
	
	@Step
	public void user_clicks_on_News_link() {
		loginPage.newsLinkClick();
	}
	
	@Step
	public void user_clicks_on_Teams_link() {
		loginPage.teamLinkClick();
	}
	
	@Step
	public void user_clicks_on_Results_link() {
		loginPage.resultLinkClick();
	}
	
	@Step
	public void user_clicks_on_QA_link() {
		loginPage.qaLinkClick();
	}
	
	@Step
	public void verify_News_Page() {
		loginPage.driverWaitForTitle();
		Assert.assertEquals(loginPage.getPageTitle(), LoginPage.NEWS_PAGE_TITLE);
	}
	
	@Step
	public void verify_Teams_Page() {
		loginPage.driverWaitForTitle();
		Assert.assertEquals(loginPage.getPageTitle(), LoginPage.TEAMS_PAGE_TITLE);
	}
	
	@Step
	public void verify_Results_Page() {
		loginPage.driverWaitForTitle();
		Assert.assertEquals(loginPage.getPageTitle(), LoginPage.RESULTS_PAGE_TITLE);
	}
	
	@Step
	public void verify_QA_Page() {
		loginPage.driverWaitForTitle();
		Assert.assertEquals(loginPage.getPageTitle(), LoginPage.QA_PAGE_TITLE);
	}
	
	@Step
	public void click_Docs_and_choose_Regulations() {
		loginPage.chooseDocs(LoginPage.regulationsDocsMenuItem);
	}
	
	@Step
	public void click_Docs_and_choose_Guidance() {
		loginPage.driverWait();
		loginPage.chooseDocs(LoginPage.guidanceDocsMenuItem);
	}
	
	@Step
	public void verify_Regulation_Docs_Page() {
		loginPage.driverWaitForTitle();
		Assert.assertEquals(loginPage.getPageTitle(), LoginPage.REGULATIONS_DOCS_PAGE_TITLE);
	}
	
	@Step
	public void verify_Guidance_Docs_Page() {
		loginPage.driverWaitForTitle();
		Assert.assertEquals(loginPage.getPageTitle(), LoginPage.GUIDANCE_DOCS_PAGE_TITLE);
	}
        
        @Step
        public void user_clicks_on_first_doc_link(){
            loginPage.firstDocLinkClick();
        }
        
        
	
	@Step
	public void verify_if_Doc_is_Downloadable() throws IOException{
            Assert.assertEquals(200, loginPage.isResourceAvailableByUrl(LoginPage.firstDocLink));
		//loginPage.isResourceAvailableByUrl(LoginPage.firstDocLink);
	}
        
        @Step
        public void user_clicks_on_Ask_question_button(){
            loginPage.clickAskQuestionBtn();
        }
        
        @Step
        public void verify_Login_page(){
            loginPage.driverWaitForTitle();
            Assert.assertEquals(loginPage.getPageTitle(), LoginPage.LOGIN_PAGE_TITLE);
        }

}
