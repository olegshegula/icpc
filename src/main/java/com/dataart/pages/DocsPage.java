

package com.dataart.pages;

import java.util.concurrent.TimeUnit;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

/**
 *
 * @author kmartyshchenko
 */
public class DocsPage extends PageObject {
    
        @FindBy(xpath="//a[@href='/docs/regulations']")
	public WebElement regulationsDocsMenuItem;
	
	@FindBy(xpath="//*[@href='/docs/guidance'][contains(text(), 'Guidance')]")
	public WebElement guidanceDocsMenuItem;
	
	@FindBy(xpath="//a[@class='document-title']")
	public WebElement docsTitlesGeneralXpath;
        
        @FindBy (xpath="html/body/div[2]/div/div[5]/div[2]/a[1]")
        public WebElement firstDocLink;
        
        @FindBy(xpath="//li[contains(@class,'dropdown')]/a[@class='dropdown-toggle']")
	public WebElement docsLink;
        
        @FindBy(xpath="//*[@href='/staff/docs/create/type/regulations']")
	public WebElement uploadRegulationDocButton;
        
        @FindBy(xpath="//*[@href='/staff/docs/create/type/guidance']")
	public WebElement uploadGuidanceDocButton;
        
        @FindBy(xpath="//input[@name='title']")
	public WebElement titleInputField;
        
        @FindBy(xpath="//textarea[@name='desc']")
	public WebElement descriptionInputField;
        
        @FindBy(xpath="//select[@name='type']")
	public WebElement docTypeDropdown;
        
        @FindBy(xpath="//button[@id='pickfiles']")
	public WebElement chooseFileButton;
        
        @FindBy(xpath="//button[@type='submit']")
	public WebElement saveDocumentButton;
        
        @FindBy(xpath="html/body/div[2]/div/div[5]/div[2]/button")
	public WebElement deleteFirstDocButton;
        
        @FindBy(xpath="html/body/div[2]/div/div[5]/div[2]/a[2]")
	public WebElement editFirstDocButton;
        
        @FindBy(xpath="//select[@class='form-control'][@name='type']")
	public WebElement editMenuDocTypeDropdown;
        
        @FindBy(xpath="//option[@value='guidance']")
	public WebElement editMenuDocTypeGuidanceItem;
        
        @FindBy(xpath="//option[@value='regulations']")
	public WebElement editMenuDocTypeRegulationsItem;
        
        @FindBy(xpath="//p[contains(text(),'testdesc')]")
	public WebElement docWithPresetSescription;
        
        public final static String REGULATIONS_DOCS_PAGE_TITLE = "Docs - ICPC";
	
	public final static String GUIDANCE_DOCS_PAGE_TITLE = "Guidance Docs - ICPC";
	
	public final static String DOCS_TITLE_GENERAL_XPATH = "//a[@class='document-title']";
        
        public final static String GUIDANCE_DOCS_MENU_XPATH = "//*[@href='/docs/guidance'][contains(text(), 'Guidance')]";
        
        public final static String SAVE_DOCUMENT_BUTTON_XPATH = "//button[@type='submit']";
        
        public final static String FIRST_DOCUMENT_LINK_XPATH = "html/body/div[2]/div/div[5]/div[2]/a[1]";
        
        public final static String DOC_WITH_PRESET_DESCRIPTION_XPATH = "//p[contains(text(),'testdesc')]";
        
        
        
        
        
        
        
        
}
