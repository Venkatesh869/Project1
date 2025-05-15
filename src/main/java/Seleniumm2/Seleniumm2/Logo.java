package Seleniumm2.Seleniumm2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Logo {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/");
		
		WebElement Logo = driver.findElement(By.xpath("//a[@class=\"w3-bar-item w3-button w3-hover-none w3-left ga-top ga-top-w3home\"]"));
		System.out.print("The logo is Displaid:" + Logo.isDisplayed() );
		
		WebElement Logo1 = driver.findElement( By.xpath("//a[@class=\"w3-bar-item w3-button w3-hover-none w3-left ga-top ga-top-w3home\"]"));
				System.out.println("The logo is enabled :" +Logo1.isEnabled());
				
				WebElement Logo2 = driver.findElement(By.xpath("//a[@class=\"w3-bar-item w3-button w3-hover-none w3-left ga-top ga-top-w3home\"]"));
				System.out.println("The logo is selected:" + Logo2.isSelected());
				
				driver.findElement(By.xpath("//a[@class=\"w3-bar-item w3-button w3-hover-none w3-left ga-top ga-top-w3home\"]")).getRect();

	Thread.sleep(2000);
		
		driver.findElement(By.linkText("Try it Yourself")).click();
		

		
		}

}
