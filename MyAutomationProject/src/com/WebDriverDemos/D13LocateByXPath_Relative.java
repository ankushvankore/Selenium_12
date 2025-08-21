package com.WebDriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D13LocateByXPath_Relative {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.echotrak.com/Login.aspx?ReturnUrl=%2f");
		
		driver.findElement(By.xpath("//form[@id=\"Form2\"]/fieldset/div[2]/fieldset/input[1]")).sendKeys("sharvari");
		driver.findElement(By.xpath("//input[@id=\"txtPassword\"]")).sendKeys("sharvari123");
		driver.findElement(By.xpath("//*[@id=\"Butsub\"]")).click();
		
		System.out.println(driver.findElement(By.xpath("//*[@id=\"lblMsg\"]")).getText());
		
		driver.close();
	}

}
