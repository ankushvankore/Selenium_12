package com.TestNGDemos;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class D03Before_AfterTest {
	WebDriver driver;
	@BeforeTest
	public void launchBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@AfterTest
	public void closeBrowser() {
		driver.quit();
	}

	@Test(priority = 3)
	public void testAmazon() {
		driver.get("https://www.amazon.in/");
		System.out.println("Title: " + driver.getTitle());
	}
	@Test (priority = 2)
	public void testMyntra() {
		driver.get("https://www.myntra.com/");
		System.out.println("Title: " + driver.getTitle());
	}
	@Test (priority = 1)
	public void testSmytten() {
		driver.get("https://smytten.com/");
		System.out.println("Title: " + driver.getTitle());
	}
	@Test (priority = 4)
	public void testAjio() {
		driver.get("https://www.ajio.com/");
		System.out.println("Title: " + driver.getTitle());
	}
}
