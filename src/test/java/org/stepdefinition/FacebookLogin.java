package org.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FacebookLogin extends BaseClass{
	
	@Given("To open the chrome browser and launch the fb Url")
	public void to_open_the_chrome_browser_and_launch_the_fb_Url() {
	   chromeBrowser();
	   urlLaunch("https://www.facebook.com/");
	   maxWindow();
	}

	@When("To enter valid username in email field")
	public void to_enter_valid_username_in_email_field() {
	    WebElement element = driver.findElement(By.id("email"));
	    element(element, "srinivasan@gmail.com");
	}

	@When("To enter invalid password in password field")
	public void to_enter_invalid_password_in_password_field() {
	   WebElement pass = driver.findElement(By.id("pass"));
	   element(pass, "8o65fokk");
	}

	@When("To click the login button")
	public void to_click_the_login_button() {
	    WebElement btn = driver.findElement(By.xpath("//button[text()='Log In']"));
	    click(btn);
	    
	}

	@Then("To close the Browser")
	public void to_close_the_Browser() {
	//   closeBrowser();
	}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
