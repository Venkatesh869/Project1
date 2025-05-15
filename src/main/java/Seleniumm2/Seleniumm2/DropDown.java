package Seleniumm2.Seleniumm2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://practice.expandtesting.com/dropdown");
		
		WebElement Dropd = driver.findElement(By.id("elementsPerPageSelect"));
		
		Thread.sleep(2000);
		
		Select SD = new Select(Dropd);
		Thread.sleep(2000);
		
		SD.selectByIndex(3);
		Thread.sleep(2000);
		
		SD.selectByVisibleText("20");
		
		List<WebElement> SDoptions = SD.getOptions();
		for (WebElement Options : SDoptions)
		System.out.println(Options.getText());
		
		WebElement Country = driver.findElement(By.name("country"));
		
		Select CN = new Select(Country);
		
		CN.selectByValue("AQ");
		CN.selectByIndex(3);
		CN.selectByVisibleText("Bhutan");
		
		List<WebElement> CNOptions = CN.getOptions();
		for (WebElement Option : CNOptions) 
		System.out.println(Option.getText());
		
	
    

	}

}
