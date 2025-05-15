package Seleniumm2.Seleniumm2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Findelements 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.opencart.com/");
		
	List<WebElement> Links = driver.findElements(By.tagName("a"));
	System.out.println(Links.size());
	
	List<WebElement> Images = driver.findElements(By.tagName("img"));
	System.out.println(Images.size());
	
	List<WebElement> AllElements = driver.findElements(By.xpath("//*"));
	System.out.println(AllElements.size());
	
}

}
