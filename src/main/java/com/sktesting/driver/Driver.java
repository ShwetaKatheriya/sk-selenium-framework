package com.sktesting.driver;

import java.util.Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sktesting.constants.FrameworkConstants;

public class Driver {
	public static WebDriver driver;
	public static void initDriver() {
		//Use java inbuilt objects.isNull feature instead of using (driver==null)
		if(Objects.isNull(driver))
		{
			//For details related to FrameworkConstants.getChromeDriverPath() check the FrameworkConstants class to understand.
			System.setProperty("webdriver.chrome.driver", FrameworkConstants.getChromeDriverPath());
			driver= new ChromeDriver();
			driver.get("https://google.com/");
		}
	}

	public static void quitDriver() {
		//Use java inbuilt objects.notnull feature instead of using (driver!=null)
		if(Objects.nonNull(driver)) {
			driver.quit();
			driver= null;
		}

	}
}
