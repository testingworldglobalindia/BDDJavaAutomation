package org.hcl.web.base;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.hcl.web.library.ConfigReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class InitiateDriver {

	public static WebDriver driver;

	public static WebDriver startBrowser() throws IOException{
		System.out.println("Testing");
		System.out.println(ConfigReader.readApplicationConfigutation("Browser_Name"));
		if(ConfigReader.readApplicationConfigutation("Browser_Name").equalsIgnoreCase("Chrome")){
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			System.setProperty("webdriver.chrome.driver", "D:\\Download\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
			driver = new ChromeDriver(options);
		}
		else if(ConfigReader.readApplicationConfigutation("Browser_Name").equalsIgnoreCase("Firefox")){
			driver = new FirefoxDriver();
		}
		
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(ConfigReader.readApplicationConfigutation("Application_URL"));
		return driver;
	}
	

	public void closeBrowser(){
		//driver.close();
	}
	
}
