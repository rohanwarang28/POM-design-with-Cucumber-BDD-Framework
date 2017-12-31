package com.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.TestBase;

public class HomePage extends TestBase{

	
		// TODO Auto-generated constructor stub
		@FindBy(xpath="//td[contains(text(),'User: rohanw')]")
		WebElement nameDisplay;
		
		
		
		
		public HomePage() throws Exception{
			PageFactory.initElements(driver,this);
		}
		
		
		public boolean displayName(){
			return nameDisplay.isDisplayed();
		}
		
		public String getPageTitle(){
			return driver.getTitle();
		}
		
	}


