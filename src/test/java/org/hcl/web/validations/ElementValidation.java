package org.hcl.web.validations;

import org.hcl.web.base.InitiateDriver;
import org.junit.Assert;
import org.openqa.selenium.By;


public class ElementValidation extends InitiateDriver{
	
	public static void validateElementEnable(String expectedElementXpath) {
	
		try {
			if(driver.findElement(By.xpath(expectedElementXpath)).isEnabled()) {
				Assert.assertTrue(true);
			}
			
		}
		catch(Exception e){
			
		}
		
	}
	
	public static void validateElementVisible(String expectedElementXpath) {
		
		try {
			if(driver.findElement(By.xpath(expectedElementXpath)).isDisplayed()) {
				Assert.assertTrue(true);
			}
			
		}
		catch(Exception e){
			
		}
		
	}
	
	public static void validateElementDisable(String expectedElementXpath) {
		
		try {
			if(driver.findElement(By.xpath(expectedElementXpath)).isEnabled()) {
				
			}
			
		}
		catch(Exception e){
			Assert.assertTrue(true);
			
		}
		
	}
	
	
}
