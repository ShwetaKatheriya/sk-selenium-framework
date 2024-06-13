package com.sktesting.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.sktesting.driver.Driver;

public class BaseTests {
	
	//Creating a protected constructor of the class so that nobody can create an object of this class, because it can't be private otherwise other child classes will not be able to access this class.
	protected BaseTests() {
		
	}
	
	
	@BeforeMethod
	public void setUp() {
		
		Driver.initDriver();		
	}

	@AfterMethod
	public void tearDown() {
		Driver.quitDriver();		
	}
}
