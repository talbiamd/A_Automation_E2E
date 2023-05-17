package atech.ny.elementpage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import atech.ny.basepage.BaseClass;
import atech.ny.generic.CommonUtill;

public class MasterPageFactory extends BaseClass {

	// initialia=zation page factory
	// 1st we have to create a constructor
	// than we have to write PageFactory.initElements( driver, this)
	// PageFactory is a class from selenium (in order to store all the web element)
	// init is a method which element you want to invoke
	// driver is must without driver its imposible to run
	//driver is a instance without this its imposible to run
	//this is invoke current class project
	//super is invoke parrent class project
	
	//class crate object
	//data type variable
	//interface create instance
	public MasterPageFactory() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//input[@name='email'])[1]") // finding locator
	@CacheLookup // to make it more faster way to perform better
	private WebElement enterEmail; //webelement: is a interface

	public WebElement getEnterEmail() {
		return enterEmail;
	}

	@FindBy(xpath = "//input[@type='password']")
	@CacheLookup
	private WebElement enterPassword;

	public WebElement getEnterPassword() {
		return enterPassword;
	}

	@FindBy(xpath = "(//button[@type='submit'])[1]")
	@CacheLookup
	private WebElement clickOnLoginBTN;

	public WebElement getClickOnLoginBTN() {
		return clickOnLoginBTN;

	}
	@FindBy(xpath = "//*[text() =' Home']")
	@CacheLookup
	private WebElement varifyHomePage;

	public WebElement getvarifyHomePage() {
		return varifyHomePage;

	}
	@FindBy(xpath = "//a[text()=' Products']")
	@CacheLookup
	private WebElement clickOnProduct;

	public WebElement getclickOnProduct() {
		return clickOnProduct;

	}
	

	public void getLogin(String UserName,String Password) {
		getEnterEmail().sendKeys(UserName);
		getEnterPassword().sendKeys(Password);
		//getClickOnLoginBTN().click();
		CommonUtill.actionClick(getClickOnLoginBTN());
	}
}
