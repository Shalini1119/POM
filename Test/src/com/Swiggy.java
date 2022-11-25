package com;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Swiggy {

	public static void main (String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shalini.chilupuri\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.swiggy.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("location")).sendKeys("kashibugga warangal");
		Thread.sleep(1000);
		driver.findElement(By.className("_2W-T9")).click();
		Thread.sleep(3000);
		//driver.findElement(By.linkText("Paradise Biryani")).click();
		//driver.findElement(By.className("nA6kb")).click
//		List<WebElement> hotels= driver.findElements(By.xpath("//div[normalize-space()='A1 Cake Shoppe']"));
//		for (int i=0; i<hotels.size(); i++)
//		{
//			String name= hotels.get(i).getText();
//			if (name.contains("Chicken Roll"))
//			{
//				driver.findElements(By.xpath(("//div[contains(text(),'ADD')[1]"))).get(i).click();
//				
//			}
//			
			
		
		driver.findElement(By.xpath("//div[normalize-space()='A1 Cake Shoppe']")).click();
		Thread.sleep(2000);
		
		((WebElement) driver.findElements(By.xpath("(//div[contains(text(), 'ADD')])[1]"))).click();

		
		

	}

} 


