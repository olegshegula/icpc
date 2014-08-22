package com.dataart.pages;

import net.thucydides.core.annotations.At;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;
import net.thucydides.core.pages.WebElementFacade;

@DefaultUrl("http://acc.icpc.org.ua/user/me")
@At("http://acc.icpc.org.ua/user/me")
public class ProfilePage extends PageObject{
	
	@FindBy(xpath="//li/a[@href='/user/me']")
	public WebElementFacade mainInfoTab;
	@FindBy(id="currentPassword")
	public WebElementFacade currentPasswordField;
	@FindBy(id="password")
	public WebElementFacade passwordField;
	@FindBy(id="passwordRepeat")
	public WebElementFacade passwordRepeatField;
	@FindBy(css=".btn.btn-lg.btn-primary.btn-save-password")
	public WebElementFacade changePasswordButton;
	@FindBy(css=".alert.alert-success")
	public WebElementFacade successAlert;
	
	@FindBy(css=".help-block")
	public WebElementFacade errorMessageForPasswordChange;
	
	public String getSuccessMessage(){
		
		return successAlert.getText();
	}
	
	public String getErrorMessage(){
		return errorMessageForPasswordChange.getText();
	}
}
