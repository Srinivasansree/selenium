package org.stepdefinition;

import java.awt.Desktop.Action;
import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;
	public static Actions a;
	
	public static void chromeBrowser() {

		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();	
	}
	
	public static void maxWindow() {
     
		driver.manage().window().maximize();
		
	}
	
	public static void urlLaunch(String url) {
		
		driver.get(url);

	}
	
	public static void element(WebElement username, String user) {
		
		username.sendKeys(user);

	}
	
	public static void password(WebElement pass, String password) {
	
		pass.sendKeys(password);

	}
	
	public static void logIn(WebElement login) {
		
		login.click();

	}
	
	public static void closeBrowser() {
		driver.close();

	}
	
	public static void currentUrl() {

		driver.getCurrentUrl();

	}
	
	public static void pageTitle() {
		
		driver.getTitle();

	}
	
	public static void pageSource() {
		
		driver.getPageSource();

	}
	
	public static void dragAndDrop() {
	
		Actions a = new Actions(driver);
		
		a.contextClick().perform();

	}
	
public static void click(WebElement ele) {
		
		ele.click();

	}
	
	public static void mouseOver(WebElement move) {
		
		a= new Actions(driver);
		
		a.moveToElement(move).perform();
		move.click();
	    
	}
	
	public static void doubleClick(WebElement click) {
		
		a.doubleClick(click).perform();

	}
	
	
	
	
	
	
	
	
	
	
	

}
