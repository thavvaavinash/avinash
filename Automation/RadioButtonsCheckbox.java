package maven_project.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButtonsCheckbox {
	WebDriver driver;
	
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	}
	public void RadioButtonValidation() throws InterruptedException
	{
	driver.get("https://courses.letskodeit.com/practice");
	WebElement bmwRadioButton= driver.findElement(By.xpath("//input[@id = 'bmwradio']"));
	bmwRadioButton.click();
	Thread.sleep(2000);
	
	if(bmwRadioButton.isSelected())
	{
		System.out.println("success RadioButtonSelected");
		
	}
	else 
		System.out.println("radion not selected");
	}
	
	public void Teardown()
	{
		driver.close();
	}
	public static void main(String[] args) throws InterruptedException {
		RadioButtonsCheckbox ref= new RadioButtonsCheckbox();
		ref.setup();
		ref.RadioButtonValidation();
		ref.Teardown();
		
	}
	
	 
	
	

}
	