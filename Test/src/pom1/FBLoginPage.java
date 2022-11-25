package pom1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class FBLoginPage {
	
	WebDriver driver =null;
	
	@Test
	 public static WebElement Link_Fb(WebDriver driver)
	 {
		 WebElement element = driver.findElement(By.xpath("//a//h3[@class='LC20lb MBeuO DKV0Md']/.. //div[@class='TbwUpd NJjxre']"));
		 return element;
	 }
	@Test
	 public static WebElement Fb_Username(WebDriver driver)
	 {
		 WebElement element = driver.findElement(By.id("email"));
		 return element;
	 }
	@Test
	 public static WebElement Fb_Password(WebDriver driver)
	 {
		 WebElement element = driver.findElement(By.id("pass"));
		 return element;
	 }
	@Test
	 public static WebElement Click_btn(WebDriver driver)
	 {
		 WebElement element = driver.findElement(By.id("loginbutton"));
		 return element;
	 }
	 
	 
}
