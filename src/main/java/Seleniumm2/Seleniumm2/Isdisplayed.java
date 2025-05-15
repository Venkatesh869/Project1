package Seleniumm2.Seleniumm2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Isdisplayed {

	public static void main(String[] args) 
	{
 WebDriver driver = new ChromeDriver();
 driver.get("https://demo.nopcommerce.com/");
 
 WebElement Logo = driver.findElement(By.xpath("//img[@alt=\"nopCommerce demo store\"]"));
 System.out.println("Logo is Available : " + Logo.isDisplayed());
 
 WebElement Logo1 = driver.findElement(By.xpath("//a[@rel=\"noopener noreferrer\"]"));
 System.out.println("Logo is Selected :" + Logo1.isSelected());
 
 WebElement SearchBox = driver.findElement(By.xpath("//input[@id=\"small-searchterms\"]"));
 System.out.println("SearchBox is Enabled : " + SearchBox.isEnabled());
	}

}
