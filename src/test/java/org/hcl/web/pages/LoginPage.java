package org.hcl.web.pages;

import java.io.IOException;

import org.hcl.web.base.InitiateDriver;
import org.hcl.web.library.ConfigReader;
import org.hcl.web.library.GenericActions;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage extends InitiateDriver{

	
	public static void enterUsername(String username) throws IOException {
		GenericActions.typeTextOnElement(ConfigReader.readElementLocators("login_username_xpath"), username);
	}
	
	public static void enterPassword(String password) throws IOException {
		GenericActions.typeTextOnElement(ConfigReader.readElementLocators("login_password_xpath"), password);
		
	}
	
	public static void clicksignin() throws IOException {
		GenericActions.clickOnElement(ConfigReader.readElementLocators("login_signin_xpath"));
	}
	
	public void clickForgotPassword() {
		
	}
	
	
}
