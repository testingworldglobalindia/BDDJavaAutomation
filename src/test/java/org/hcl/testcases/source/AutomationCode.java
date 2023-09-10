package org.hcl.testcases.source;

import org.hcl.web.base.InitiateDriver;
import org.hcl.web.pages.LoginPage;
import org.hcl.web.validations.PageValidation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import dev.failsafe.internal.util.Assert;

public class AutomationCode {
	WebDriver driver;
	
	@When("^User enters username$")
	public void user_enters_username() throws Throwable {
	    driver.findElement(By.id("email")).sendKeys("Hello");
	}

	@When("^User enters email id$")
	public void user_enters_email_id() throws Throwable {
	   LoginPage.enterUsername("Hello");
	}

	@When("^User enters password$")
	public void user_enters_password() throws Throwable {
	  LoginPage.enterPassword("abcd");
	}

	@When("^User enter DOB$")
	public void user_enter_DOB() throws Throwable {
	   
	}

	@When("^User clicks on submit button$")
	public void user_clicks_on_submit_button() throws Throwable {
	   
	}

	@Then("^User should be logged in$")
	public void user_should_be_logged_in() throws Throwable {
	    PageValidation.validatePageTitle("Hello World");
	}

	@Then("^User should highlight welcome message$")
	public void user_should_get_welcome_message() throws Throwable {
	  
	}
	
	
	@Then("^User should get hello message$")
	public void user_should_get_hello_message() throws Throwable {

	}

	
	@Given("^User is on Login Page$")
	public void user_is_on_Login_Page() throws Throwable {
		driver = InitiateDriver.startBrowser();
	}

	@When("^User clicks on signin button$")
	public void user_clicks_on_signin_button() throws Throwable {
		LoginPage.clicksignin();
	}


	



}
