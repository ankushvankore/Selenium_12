package com.Assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A23DemoQA_Registration {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://demoqa.com/automation-practice-form");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0, 300)", "");
		
		driver.findElement(By.id("firstName")).sendKeys("Sharvari");
		driver.findElement(By.id("lastName")).sendKeys("Suryavanshi");
		driver.findElement(By.id("userEmail")).sendKeys("sharvari@gmail.com");
		//driver.findElement(By.id("gender-radio-2")).click();
		js.executeScript("arguments[0].click()", driver.findElement(By.id("gender-radio-2")));
		driver.findElement(By.id("userNumber")).sendKeys("9898989898");
		driver.findElement(By.id("dateOfBirthInput")).sendKeys(Keys.CONTROL + "A");
		driver.findElement(By.id("dateOfBirthInput")).sendKeys("08 Jan 2005", Keys.ENTER);
		
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0, 500)", "");
		driver.findElement(By.id("subjectsInput")).sendKeys("H");
		js.executeScript("arguments[0].click()", driver.findElement(By.xpath("//*[@id=\"react-select-2-option-0\"]")));
		js.executeScript("arguments[0].click()", driver.findElement(By.id("hobbies-checkbox-1")));
		driver.findElement(By.id("uploadPicture")).sendKeys("C:\\Users\\Dell\\Desktop\\Award.jpg");
		driver.findElement(By.id("currentAddress")).sendKeys("Kolhapur");
		driver.findElement(By.xpath("//*[@id=\"state\"]/div[1]/div[2]/div")).click();
		driver.findElement(By.xpath("//*[@id=\"react-select-3-option-1\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"city\"]/div/div[2]/div")).click();
		driver.findElement(By.xpath("//*[@id=\"react-select-4-option-1\"]")).click();
		
		driver.findElement(By.id("submit")).submit();
		
		List<WebElement>info = driver.findElements(By.xpath("/html/body/div[5]/div/div/div[2]/div/table/tbody/tr"));
		for(WebElement i : info)
			System.out.println(i.getText());
		
		js.executeScript("arguments[0].click()",driver.findElement(By.id("closeLargeModal")));
		
		driver.close();
	}

}
