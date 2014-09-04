package com.dataart.pages;

import java.util.List;

import org.openqa.selenium.WebElement;

import net.thucydides.core.annotations.At;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;
import net.thucydides.core.pages.WebElementFacade;
@DefaultUrl("http://acc.icpc.org.ua/qa")
@At("http://acc.icpc.org.ua/qa")
public class QaPage extends PageObject{

	@FindBy(css=".btn.btn-default.btn-lg.pull-right")
	public WebElementFacade manageTagsButton; 
	@FindBy(css=".btn.btn-success.btn-lg.pull-right")
	public WebElementFacade createTagButton;
	@FindBy(xpath="//*[@id='main']//input[@placeholder='Title']")
	public WebElementFacade titleTagField;
	@FindBy(xpath="//*[@id='tag-desc']")
	public WebElementFacade descriptionTagField;
	@FindBy(xpath="//*[@id='main']//button[@class='btn btn-primary save-tag btn-lg']")
	public WebElementFacade saveButton;
	@FindBy(css=".help-block")
	public WebElementFacade warrningMessage;
	@FindBy(css=".table.table-striped>tbody")
	public WebElement tagsTable;
	@FindBy(xpath="//button[@data-bb-handler='confirm']")
	public WebElement confirmButton;
	@FindBy(xpath="//*[@id='main']//button[@class='btn btn-danger btn-delete-tag']")
	public List<WebElement> deleteButtonList;
	@FindBy(xpath="//*[@id='main']//a[@class='btn btn-primary']")
	public List<WebElement> editButtonList;
        @FindBy (xpath="//a[@href='/qa/ask']")
        public WebElement askQuestionButton;
        //
        
        
	
}
