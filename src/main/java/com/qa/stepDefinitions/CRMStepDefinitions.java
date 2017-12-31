package com.qa.stepDefinitions;

import java.io.IOException;

import org.junit.Assert;

import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.util.TestBase;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CRMStepDefinitions extends TestBase{

	LoginPage loginpage;
	HomePage homepage;
	public CRMStepDefinitions() throws IOException {
		//super();
		// TODO Auto-generated constructor stub
	}

	@When("^:User is on login page$")
	public void user_is_on_login_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		initialization();
	}

	@When("^: User enters the username and password and clicks on login button$")
	public void user_enters_the_username() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		loginpage=new LoginPage();
		homepage=loginpage.login();
			}


	@Then("^: User lands on the home page$")
	public void user_lands_on_the_home_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		//homepage=new HomePage();
		String actual=homepage.getPageTitle();
		Assert.assertEquals("CRMPRO1", actual);
	}
}
