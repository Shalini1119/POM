import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {
	
	public static void main(String args[]) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shalini.chilupuri\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("Rahul");
		driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
		driver.findElement(By.className("submit")).click();
		//System.out.println(driver.findElement(By.cssSelector("p.[class='value']")).getText());
		//System.out.println(driver.findElement(By.cssSelector("p.error")).getText()); 
		Thread.sleep(2000);
		driver.findElement(By.linkText("Forgot your password?")).click();
		
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Shalini");
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("rahulshettyacademy@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("9638521470");
		driver.findElement(By.cssSelector("reset-pwd-btn")).click();
		System.out.println(driver.findElement(By.cssSelector("form p")).getText());
		
		
		
	}

	
}
