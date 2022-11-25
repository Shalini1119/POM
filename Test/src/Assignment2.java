import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {

	private static final List<WebElement>[] WebElement = null;

	public static void main(String[] args) throws IndexOutOfBoundsException
	{
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\shalini.chilupuri\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("product")).getSize();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		List<WebElement> values = driver.findElements(By.cssSelector(".table-display tr:nth-child(n)"));
		System.out.println(values.size());
		List<WebElement> values1 = driver.findElements(By.cssSelector(".table-display th:nth-of-type(n)"));
		System.out.println(values1.size());
		
		List<WebElement> SecondRow= driver.findElements(By.cssSelector(".table-display tr:nth-of-type(3)"));
		System.out.println(SecondRow.get(0).getText());
		System.out.println(SecondRow.get(1).getText());
		System.out.println(SecondRow.get(2).getText());
		int index =0;
		if (index >= 0  && index < WebElement.length)
			SecondRow =  WebElement[index];
        else
            throw new ArrayIndexOutOfBoundsException("Invalid Index");
		driver.close();
		
	}

}
