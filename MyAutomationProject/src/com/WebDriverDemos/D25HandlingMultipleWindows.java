package com.WebDriverDemos;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D25HandlingMultipleWindows {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.naukri.com/");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 300)", "");
		
		driver.findElement(By.xpath("//span[contains(text(), \"Remote\")]")).click();
		System.out.println("Title: " + driver.getTitle());

		Set<String>windows = driver.getWindowHandles();
		Iterator<String>itr = windows.iterator();
		
		String win1 = itr.next();		//Read 1st element from set
		String win2 = itr.next();		//Read 2nd element from the set
		
		driver.switchTo().window(win2);
		Thread.sleep(5000);
		System.out.println("Title: " + driver.getTitle());
		
		driver.findElement(By.xpath("//*[@id=\"search-result-container\"]/div[1]/div[1]/div/div/div[2]/div[1]/div[2]/div[1]/label/i")).click();
		Thread.sleep(2000);
		
		driver.switchTo().window(win1);
		driver.findElement(By.linkText("Login")).click();
		Thread.sleep(2000);
		
		driver.quit();
	}

}
