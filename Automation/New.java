package maven_project.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class New {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://github.com/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("login_field")).sendKeys("avinash thavva");
		driver.findElement(By.id("password")).sendKeys("Avi@#123");
		driver.findElement(By.name("commit")).click();

	}

}
