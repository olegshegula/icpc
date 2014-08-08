package com.dataart.steps;

import org.junit.Assert;

import com.dataart.pages.LoginPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class UserLoginSteps extends ScenarioSteps {

	LoginPage loginPage;
	
	@Step
	public void is_on_the_login_page(){
		
		loginPage.open();
	}
	
	@Step 
	public void enter(String userName, String password){
		
		loginPage.enterLoginAndPassword(userName, password);
	}
	
	@Step
	public void click_login_button(){
		
		loginPage.clickLogin();
		
	}
	
	@Step 
	public void should_see_a_page_title(String message){
		
		Assert.assertEquals(loginPage.getPageTitle(),message);
		
	}
	
	@Step 
	public void should_see_a_flash_message(String message){
		
		Assert.assertEquals(loginPage.getFlashMessage(),message);
		
	}
	
}
