package Seleniumm2.Seleniumm2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException 
	{
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
	driver.manage().window().maximize();
	
	driver.findElement(By.id("alertBox")).click();
Alert SA = driver.switchTo().alert();
System.out.println(SA.getText());
Thread.sleep(3000);
SA.accept();

driver.findElement(By.id("confirmBox")).click();
Alert CA = driver.switchTo().alert();
System.out.println(CA.getText());
Thread.sleep(3000);
CA.dismiss();

driver.findElement(By.id("promptBox")).click();
Alert PB = driver.switchTo().alert();
PB.sendKeys("Venky Gadu");
System.out.println(PB.getText());
Thread.sleep(3000);
PB.accept();
System.out.println(driver.findElement(By.id("output")).getText());
driver.quit();

	}

}
