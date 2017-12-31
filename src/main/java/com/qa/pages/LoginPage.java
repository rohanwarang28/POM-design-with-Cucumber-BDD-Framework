package com.qa.pages;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.pages.HomePage;
import com.qa.util.TestBase;

public class LoginPage extends TestBase {
	
	public LoginPage() throws IOException {
		//super();
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver,this);
	}

	@FindBy(name="username")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement loginBtn;
	
	@FindBy(xpath="//button[contains(text(),'Sign Up')]")
	WebElement signUpBtn;

	@FindBy(xpath="//a[@class='navbar-brand']")
	WebElement logo;
	
	public Boolean verifyLogo(){
		Boolean b1=logo.isDisplayed();
		return b1;
	}
	
	public String getTitle(){
		return driver.getTitle();
		
	} 
	
	public HomePage login() throws Exception{
		username.sendKeys(prop.getProperty("username"));
		password.sendKeys(prop.getProperty("password"));
		JavascriptExecutor js=(JavascriptExecutor) driver;
    	js.executeScript("arguments[0].click();",loginBtn);
        return new HomePage();
	}
	
	
}
