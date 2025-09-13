package com.Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A28RevenueCal {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.fitpeo.com/revenue-calculator");
		
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0, 300)", "");
		
		WebElement slider = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div/div/span[1]/span[3]/input"));
		
		for(int i = 1; i <= 20; i++)
			slider.sendKeys(Keys.ARROW_RIGHT);
		
		driver.findElement(By.xpath("//*[@id=\":R57alklbrpida:\"]")).sendKeys(Keys.CONTROL + "A");
		driver.findElement(By.xpath("//*[@id=\":R57alklbrpida:\"]")).sendKeys("600");
	}

}
