package com.TestNGDemos;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class D02OnlineShopping {
	@Test(priority = 3)
	public void testAmazon() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.amazon.in/");

		System.out.println("Title: " + driver.getTitle());

		driver.quit();
	}
	@Test (priority = 2)
	public void testMyntra() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.myntra.com/");

		System.out.println("Title: " + driver.getTitle());

		driver.quit();
	}
	@Test (priority = 1)
	public void testSmytten() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://smytten.com/");

		System.out.println("Title: " + driver.getTitle());

		driver.quit();
	}
	@Test (priority = 4)
	public void testAjio() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.ajio.com/");

		System.out.println("Title: " + driver.getTitle());

		driver.quit();
	}
}
