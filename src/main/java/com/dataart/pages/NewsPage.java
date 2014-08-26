package com.dataart.pages;

import java.util.List;

import org.openqa.selenium.WebElement;

import net.thucydides.core.annotations.At;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;
import net.thucydides.core.pages.WebElementFacade;

@DefaultUrl("http://acc.icpc.org.ua")
@At("http://acc.icpc.org.ua")
public class NewsPage extends PageObject{

@FindBy(xpath="//*[@class='nav navbar-nav']/li/a")
List<WebElement> mainMenuList;
@FindBy(css=".btn.btn-success.btn-lg")
public WebElementFacade addNewsButton;
@FindBy(css="#uploadNewsImages")
public WebElement uploadImage;
@FindBy(xpath="//input[@name='title']")
public WebElementFacade titleField;
@FindBy(css=".cke_editable.cke_editable_themed.cke_contents_ltr>p")
public WebElementFacade memoField;
@FindBy(css=".btn.btn-primary.save-news.btn-lg.pull-left")
public WebElementFacade saveNewsButton;
@FindBy(css=".btn.btn-success.btn-lg")
public WebElementFacade publishButton;
@FindBy(xpath="//*[@id='main']//h2/a[1]")
public List<WebElement> newsTitles;

@FindBy(xpath="//div[@class='news-edit__image-item hide']/img")
public WebElement pictureForNews;

public void goToNews(){
	mainMenuList.get(0).click();
}

public String getFirstNewsTitle(){
	return newsTitles.get(0).getText();
}
}
