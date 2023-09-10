package org.hcl.web.library;

import org.hcl.web.base.InitiateDriver;
import org.openqa.selenium.By;

public class GenericActions extends InitiateDriver {
	
	
	public static void clickOnElement(String xpath){
		
		System.out.println("[INFO ] Clicked on Element ---  " + xpath);
		try{
			driver.findElement(By.xpath(xpath)).click();
		}
		catch(Exception e){
			System.out.println("[ERROR ]Not able to click on Element as Locator is incorrect");
		}
		
		
	}
	
	public static void typeTextOnElement(String xpath, String text){
		
		driver.findElement(By.xpath(xpath)).sendKeys(text);
		
	}

}
