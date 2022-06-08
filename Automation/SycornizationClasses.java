package maven_project.Automation;

import java.util.concurrent.TimeUnit;

import org.apache.hc.core5.util.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.sourceforge.htmlunit.corejs.javascript.tools.debugger.Main;

public class SycornizationClasses  {
	
	public static void implicityWaitConcept() {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(7,TimeUnit.SECONDS);
	driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
	driver.findElement(By.id("btn1")).click();
	driver.findElement( By.xpath("(//button[@id='btn1']/following::h3/input)[1]")).sendKeys("avinash");
	driver.findElement(By.id("btn2")).click();
	driver.findElement(By.xpath("(//button[@id='btn2']/following::h3/input)[2]")).sendKeys("Thavva");
	}
	public static void main(String[] args) {
		implicityWaitConcept();
	}
} 
