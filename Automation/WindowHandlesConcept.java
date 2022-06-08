package maven_project.Automation;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandlesConcept {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		String parentWindow = driver.getWindowHandle();
		driver.findElement(By.id("newTabBtn")).click();
		Set<String> allWindows=driver.getWindowHandles();
			
	
	for (String window:allWindows)
	{
		driver.switchTo().window(window);
		System.out.println("window is "+driver.getTitle());
	
	if (driver.getTitle().equalsIgnoreCase("AlertsDemo - H Y R Tutorials")) {
		System.out.println("Reached to Expect");
		driver.findElement(By.id("alertBox")).click();
	}

	}
}
}