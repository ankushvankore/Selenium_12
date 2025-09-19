package com.Assignments;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DemoQA_Client {
	WebDriver driver;
	DemoQAUtility d1;
	@Test
	public void registration() {
		d1.enterFirstName("Sheetal");
		d1.enterLastName("Pawar");
		d1.enterEmailId("sheetalpawar@gmail.com");
		d1.selectGender("Female");
	}

	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demoqa.com/automation-practice-form");
		
		d1 = new DemoQAUtility(driver);
	}

	@AfterTest
	public void afterTest() {
	}

}
