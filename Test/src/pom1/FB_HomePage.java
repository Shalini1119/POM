package pom1;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


public class FB_HomePage {
	
	WebDriver driver= null;
	
	@Test(priority=1)
	public static WebElement Profile_Picture(WebDriver driver)
	{
	WebElement element= driver.findElement(By.xpath("//div[@class='x1i10hfl x1qjc9v5 xjbqb8w xjqpnuy xa49m3k xqeqjp1 x2hbi6w x13fuv20 xu3j5b3 x1q0q8m5 x26u7qi x972fbf xcfux6l x1qhh985 xm0m39n x9f619 x1ypdohk xdl72j9 x2lah0s xe8uvvx xdj266r x11i5rnm xat24cr x1mh8g0r x2lwn1j xeuugli xexx8yu x4uap5 x18d9i69 xkhd6sd x1n2onr6 x16tdsg8 x1hl2dhg xggy1nq x1ja2u2z x1t137rt x1o1ewxj x3x9cwd x1e5q0jg x13rtm0m x1q0g3np x87ps6o x1lku1pv x1a2a7pz xzsf02u x1rg5ohu']//div[@class='x1rg5ohu x1n2onr6 x3ajldb x1ja2u2z']//*[name()='svg']//*[name()='g' and contains(@mask,'url(#jsc_c')]//*[name()='image' and contains(@x,'0')]"));
	return element;
	
	}
	
	
	@Test(priority=2)
	public static WebElement Select_Profile(WebDriver driver) 
	{
		WebElement element1 =driver.findElement(By.xpath("//span[@class='x193iq5w xeuugli x13faqbe x1vvkbs x1xmvt09 x1lliihq x1s928wv xhkezso x1gmr53x x1cpjm7i x1fgarty x1943h6x xudqn12 x676frb x1lkfr7t x1lbecb7 x1s688f xzsf02u x1yc453h']"));
		return element1;
		
	}
	
	@Test(priority=3)
	public static WebElement Add_To_Story(WebDriver driver) 
	{
		WebElement element2 =driver.findElement(By.xpath("//span[@class='x1lliihq x6ikm8r x10wlt62 x1n2onr6 xlyipyv xuxw1ft' and text()='Add to Story']"));
		return element2;
	}
	
	@Test(priority=3)
	public static WebElement Create_Text_Story(WebDriver driver) 
	{
		WebElement element3 =driver.findElement(By.xpath("//div[@class='x9f619 x14ctfv x78zum5 x67ct29 x117nqv4 xl56j7k x5ib6vp xc73u3c x1n2onr6 x2b8uid xh8yej3' and text()='Create a Text Story']"));
	return element3;
	}
	
	
	@Test(priority=4)
	public static WebElement Profile_Picture1(WebDriver driver) 
	{
		WebElement element4 =driver.findElement(By.xpath("//div[@class='x78zum5 x1n2onr6']//div[@class='x1rg5ohu x1n2onr6 x3ajldb x1ja2u2z']//*[name()='svg']//*[name()='g' and contains(@mask,'url(#jsc_c')]//*[name()='image' and contains(@x,'0')]"));
		return element4;
	}

	@Test(priority=5)
	public static WebElement Log_Out(WebDriver driver)
	{
	WebElement element5= driver.findElement(By.xpath("//span[normalize-space()='Log Out']"));
	return element5;
	
	}
	
	@Test(priority=6)
	public static WebDriver Alert_Btn(WebDriver driver)
	{
	System.out.println(driver.switchTo().alert().getText());
	driver.switchTo().alert().accept();
	return driver;
	
	}
	
}
