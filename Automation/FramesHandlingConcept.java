package maven_project.Automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FramesHandlingConcept {
	WebDriver driver;
	 
	    public void setUp() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		WebElement textbox = driver.findElement(By.className("frmTextBox"));
		textbox.sendKeys("firsttym");
		WebElement frame1 = driver.findElement(By.id("frm1"));
		driver.switchTo().frame(frame1);
		Thread.sleep(1000);
		WebElement Courseslist = driver.findElement(By.id("course"));
		
		Select course = new Select(Courseslist);
		//course.selectByValue("2");
		course.selectByVisibleText("python");
		
		}
	public  void teardown() throws InterruptedException {
		Thread.sleep(1000);
		driver.close();
	}
	
	public static void main(String[] args) throws InterruptedException {
		FramesHandlingConcept frames = new FramesHandlingConcept();
		frames.setUp();
		frames.teardown();
		
		
	}

}