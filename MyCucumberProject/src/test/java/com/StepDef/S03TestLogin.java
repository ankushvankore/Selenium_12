package com.StepDef;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class S03TestLogin {
	WebDriver driver;
	@Given("Open Test Application")
	public void open_test_application() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://practicetestautomation.com/practice-test-login/");
	}

	@When("Enter Valid username")
	public void enter_valid_username() {
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("student");
	}

	@When("Enter valid password")
	public void enter_valid_password() {
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Password123");
	}

	@When("Click on Login button")
	public void click_on_login_button() {
	    driver.findElement(By.xpath("//*[@id=\"submit\"]")).sendKeys(Keys.ENTER);
	}

	@Then("Home page should display")
	public void home_page_should_display() {
		Assert.assertTrue(driver.getCurrentUrl().contains("logged-in-successfully"));
	}

	@Given("Open Test App")
	public void open_test_app() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://practicetestautomation.com/practice-test-login/");
	}

	@When("Enter invalid username")
	public void enter_invalid_username() {
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("sheetal");
	}

	@When("Enter invalid password")
	public void enter_invalid_password() {
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Sheetal123");
	}

	@When("I Click on Login button")
	public void i_click_on_login_button() {
		driver.findElement(By.xpath("//*[@id=\"submit\"]")).sendKeys(Keys.ENTER);
	}

	@Then("Error message should display")
	public void error_message_should_display() {
	    Assert.assertTrue(driver.findElement(By.xpath("//div[@id='error']")).getText().contains("invalid"));
	}
}
