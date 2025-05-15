package Seleniumm2.Seleniumm2;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRM {
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		
		WebElement UN=driver.findElement(By.xpath("//input[@name='username']"));
		UN.sendKeys("Admin");
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@class=\"oxd-main-menu-item\"]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//i[@class='oxd-icon bi-check oxd-checkbox-input-icon']")).click();
		
		driver.findElement(By.xpath("//input[@class=\"oxd-input oxd-input--active\"]")).sendKeys("Venkatesh");
		
		TakesScreenshot TS = (TakesScreenshot) driver;
		File sourceFile = TS.getScreenshotAs(OutputType.FILE);
		File destFile = new File("./Screenshots/img2.png");
		FileUtils.copyFile(sourceFile, destFile);
		
		driver.quit();
	
	}
}
