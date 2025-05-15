    package Seleniumm2.Seleniumm2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {

	public static void main(String[] args)
	{
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.irctc.co.in/nget/train-search");
	
	/* WebElement CB = driver.findElement(By.xpath("//label[text()='Train with Available Berth ']"));
	CB.click();
	System.out.println("The Checkbox is :" + CB.isSelected()); */
	
	/* List<WebElement> CBS = driver.findElements(By.xpath("//label[@class=\"css-label_c t_c\"]"));
	System.out.println(CBS.size());
	for (WebElement webElement : CBS)
	webElement.click(); */
	
	
	{
		
	}

}
}