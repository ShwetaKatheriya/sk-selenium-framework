package com.sktesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import com.sktesting.driver.Driver;

//Ctrl+Shift+O= to remove all the warnings or unused imports
//Ctrl+A and Ctrl+I=  alignment
//We don't want our test classes to be extended so making it Final
public final class LoginPage extends BaseTests{
	//Creating a private constructor of the class so that nobody can create an object of this class
	private LoginPage() {
		
	}

	@Test
	public void test1() {
		Driver.driver.findElement(By.name("q")).sendKeys("Testing selenium", Keys.ENTER);		
	}	

}
