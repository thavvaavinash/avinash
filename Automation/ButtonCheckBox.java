package maven_project.Automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ButtonCheckBox {
	WebDriver driver; 
	
	public void setup() { 
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	public void ButtonValidation() {
	
	 driver.get("https://courses.letskodeit.com/practice");
	WebElement bmwRadioButton =  driver.findElement(By.xpath("//input[@id='bmwradio']"));
	WebElement benzRadioButton =  driver.findElement(By.xpath("//input[@id='benzradio']"));
	WebElement hondaRadioButton = driver.findElement(By.xpath("//input[@id='hondaradio']"));
	bmwRadioButton.click();
	System.out.println("Is bmw radiobutton selected::"+bmwRadioButton.isSelected());
	System.out.println("Is benz radiobutton selected::"+benzRadioButton.isSelected());
	System.out.println("Is honda radiobutton selected::"+hondaRadioButton.isSelected());
	 
	}	
	public void ButtonCheckBoxValidation() {
		driver.get("https://courses.letskodeit.com/practice");
	WebElement bmwcheckbox = driver.findElement(By.xpath("//input[@id='bmwcheck']"));
	WebElement benzcheckbox = driver.findElement(By.xpath("//input[@id='benzcheck']"));
	WebElement hondacheckbox = driver.findElement(By.xpath("//input[@id='hondacheck']"));
	hondacheckbox.click();
	
	if (!bmwcheckbox.isSelected())
	{
		bmwcheckbox.click();
	}
	if(!benzcheckbox.isSelected())
	{
		benzcheckbox.click();
	}
	if(!hondacheckbox.isSelected())
	{
		hondacheckbox.click();
	}
	else
	{
		System.out.println("hondacheckbox alreday selected");
	}
	}
	public void dynamicRadioBoxSelection(String myselection)
	{
		driver.get("https://courses.letskodeit.com/practice");
		List<WebElement> cars = driver.findElements(By.xpath("//input[@type='radio']"));
		for (WebElement eachcar:cars)
		{
			System.out.println(eachcar.getAttribute("value"));
		
		if (eachcar.getText().equals("myselection"));
		{
		eachcar.click();
		}
		}

	}
	public static void main(String[] args) {
		ButtonCheckBox ref = new ButtonCheckBox();
		ref.setup();
		ref.dynamicRadioBoxSelection("Honda");
		ref.ButtonCheckBoxValidation();
		ref.ButtonValidation();
	}
	}
