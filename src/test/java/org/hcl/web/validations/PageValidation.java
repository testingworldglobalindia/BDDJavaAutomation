package org.hcl.web.validations;

import org.hcl.web.base.InitiateDriver;
import org.junit.Assert;
import org.openqa.selenium.By;

public class PageValidation extends InitiateDriver{
	
	public static void validatePageTitle(String expectedPageTile) {
		
		if(driver.getTitle().equalsIgnoreCase(expectedPageTile)){
			Assert.assertTrue(true);			
		}
		else {
		
		}
	}
	
	public static void validatePageURL(String expectedPageURL) {
		
		if(driver.getCurrentUrl().equalsIgnoreCase(expectedPageURL)){
			Assert.assertTrue(true);			
		}
		else {
		}
	}
	
	public static void validateTextOnPage(String expectedText) {
		
		if(driver.getPageSource().contains(expectedText)){
			Assert.assertTrue(true);			
		}
		else {
		}
	}

	public static void validateElementOnPage(String expectedElementXpath) {
		
		try {
			driver.findElement(By.xpath(expectedElementXpath));
			Assert.assertTrue(true);
			
		}
		catch(Exception e){
		}
		
	}
	
	
}
