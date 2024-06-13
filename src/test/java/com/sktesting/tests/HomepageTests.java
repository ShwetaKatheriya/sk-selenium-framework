package com.sktesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import com.sktesting.driver.Driver;
//We don't want our test classes to be extended so making it Final
public final class HomepageTests extends BaseTests{
	
	//Creating a private constructor of the class so that nobody can create an object of this class
	private HomepageTests() {
		
	}
	@Test
	public void test2() {
		Driver.driver.findElement(By.name("q")).sendKeys("Testing selenium framework", Keys.ENTER);
		
	}
}
