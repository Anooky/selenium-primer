package com.anooky.testproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class GotoAnooky {
	
  @Test
  public void visitAnooky() {
	  System.setProperty("webdriver.gecko.driver", "./geckodriver");

	  WebDriver driver = new FirefoxDriver();	  
	  driver.navigate().to("http://www.anooky.com");
	   
	  driver.quit();
  }
}
