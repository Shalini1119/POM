package test;

	import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pom1.FBLoginPage;
import pom1.FB_HomePage;

import pom1.GoogleSearchPage;

	public class GoogleSearchTest {
		
		private static WebDriver driver=null;
		
		//my 1st Comment
		
		@BeforeTest
		public static void main(String[] args) throws InterruptedException
		{
			googleSearch();
			Login();
			SearchOption();
		}
		
		@Test(priority=1)
		@SuppressWarnings("deprecation")
		public static void googleSearch() throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\shalini.chilupuri\\Downloads\\chromedriver_win32\\chromedriver.exe");
			
			driver=new ChromeDriver();
			driver.get("https://www.google.com/");
			
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS) ;
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
			GoogleSearchPage.Text_SearchBox(driver).sendKeys("FaceBook Login");
			
			Thread.sleep(2000);
			GoogleSearchPage.Btn_SearchBox(driver).click();
			
			FBLoginPage.Link_Fb(driver).click();
			WebDriverWait wait=new  WebDriverWait(driver, Duration.ofSeconds(20));  
		}
		
		@Test(priority=2, description="Verifying the Login Method")
		public static void Login()
		{
			
			FBLoginPage.Fb_Username(driver).sendKeys("9985142583");
			FBLoginPage.Fb_Password(driver).sendKeys("Sh@lu1927");
			FBLoginPage.Click_btn(driver).click();
			
		}
		
		@AfterTest
		public static void SearchOption()
		{
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
			FB_HomePage.Profile_Picture(driver).click();
			FB_HomePage.Select_Profile(driver).click();
			FB_HomePage.Add_To_Story(driver).click();
			FB_HomePage.Create_Text_Story(driver).click();
			FB_HomePage.Profile_Picture1(driver).click();
			FB_HomePage.Log_Out(driver).click();
			FB_HomePage.Alert_Btn(driver);
			driver.quit();
			
				
		}
		}
		

