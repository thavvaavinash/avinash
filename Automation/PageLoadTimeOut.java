package maven_project.Automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PageLoadTimeOut {
	public static void main(String[] args) {
		
	WebDriverManager.chromedriver().setup();
	WebDriver driver= new ChromeDriver();
	driver.manage().timeouts().pageLoadTimeout(12, TimeUnit.SECONDS);
	driver.get("https://courses.letskodeit.com/practice");
	System.out.println("lets title is "+driver.getTitle());
	
	}
}
