import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dynamic_Check_Box {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shalini.chilupuri\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("checkBoxOption3")).click();
		
		String str= driver.findElement(By.id("checkBoxOption3")).getText();
		driver.findElement(By.id("dropdown-class-example")).click();
		WebElement dropdown = driver.findElement(By.id("dropdown-class-example"));
		
		Select s= new Select(dropdown);
		s.selectByVisibleText(str);
		driver.findElement(By.id("name")).sendKeys("str");
		driver.findElement(By.id("alertbtn")).click();
		
		
	}
	

}
