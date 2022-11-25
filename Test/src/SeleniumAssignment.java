import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;

public class SeleniumAssignment {

	public static void main(String args[])

	{

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shalini.chilupuri\\Downloads\\chromedriver_win32\\chromedriver.exe");

WebDriver driver= new ChromeDriver();
driver.get("http://rahulshettyacademy.com/angularpractice/");

driver.findElement(By.name("name")).sendKeys("Kavitha");    
driver.findElement(By.xpath("//input[@name='email']")).sendKeys("kavitha@gmail.com");
driver.findElement(By.id("exampleInputPassword1")).sendKeys("K@vith@123");
driver.findElement(By.id("exampleCheck1")).click();
WebElement Dropdown = driver.findElement(By.id("exampleFormControlSelect1"));
Select options= new Select(Dropdown);
options.selectByVisibleText("Female");
driver.findElement(By.id("inlineRadio1")).click();
driver.findElement(By.cssSelector("input[name='bday']")).sendKeys("19/02/1980");
driver.findElement(By.cssSelector("input[class*='btn-success']")).click();


	}
}
