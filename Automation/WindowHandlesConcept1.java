package maven_project.Automation;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandlesConcept1 {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		driver.get("https://courses.letskodeit.com/practice");
		String parentWindow = driver.getWindowHandle();
		driver.findElement(By.id("opentab")).click();
  	Set<String> allWindows = driver.getWindowHandles();
  	 for(String window:allWindows) {
  		 driver.switchTo().window(window);
  		 //System.out.println("print"+);
  		 if(driver.getTitle().equalsIgnoreCase("All Courses")) {
  		 
  		 driver.findElement(By.xpath("//div[@class='zen-course-list']/a[@href='/courses/selenium-webdriver-advanced']")).click();
         break;
  		 }
  	 }
  	 driver.switchTo().window(parentWindow);
  	 driver.findElement(By.id("openwindow")).click();
	}
}
