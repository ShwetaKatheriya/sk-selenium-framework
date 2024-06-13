package com.sktesting.constants;

// We are making this class final so that no other class can extend/inherit constants class
public final class FrameworkConstants {
	
	//We are creating a private constructor here because we do not want user to create an object if this class
	private FrameworkConstants() {
		
	}
	
	// we are creating CHROMEDRIVERPATH as a final variable because once we have defined the path we are not going to be changing it in future.
private static final String CHROMEDRIVERPATH= System.getProperty("user.dir")+ "/src/test/resources/executables/chromedriver.exe";

//we are using getter method because we have defined our CHROMEDRIVERPATH as a private variable.
public static String getChromeDriverPath() {
	return CHROMEDRIVERPATH;
}
}
