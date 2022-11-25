package pom1;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

	public class GoogleSearchPage {
		
		private static WebDriver driver = null;
		
		@Test
		public static WebElement Text_SearchBox(WebDriver driver)
		{
			WebElement element = driver.findElement(By.name("q"));
			return element;
		}
		@Test
		public static WebElement Btn_SearchBox(WebDriver driver)
		
		{
			WebElement element = driver.findElement(By.name("btnK"));
			return element;
		}
	}

