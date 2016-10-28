package com.cts.basicselenium;

import static junit.framework.Assert.assertEquals;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class seleniumTest {
  private String baseUrl;
  private WebDriver driver;
  
  @Before
  public void openBrowser() {
	  System.out.println("******START********");  
	driver = new HtmlUnitDriver();

	// open facebook webpage
	driver.get("http://localhost:8080/petclinic/");

	// Print the title
	System.out.println("Title of the page -"+ driver.getTitle());
	
    //screenshotHelper = new ScreenshotHelper();
  }

  @After
  public void complete() {
	  System.out.println("******END*******");
  }
  
  
  @Test
  public void pageTitleCompare() throws IOException {
    assertEquals("Comparing the page title", "PetClinic :: a Spring Framework demonstration", driver.getTitle());
    //WebElement searchField = driver.findElement(By.name("q"));
    
  }
  
 
}