import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shalini.chilupuri\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/nested_frames");
		//System.out.println(driver.findElement(By.tagName("frameset")));
		driver.switchTo().frame("frame-top");
		driver.switchTo().frame(1);
		System.out.println(driver.findElement(By.id("content")).getText());
		
		
		
	}

}
