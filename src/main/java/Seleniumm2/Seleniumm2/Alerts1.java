package Seleniumm2.Seleniumm2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts1 {

	public static void main(String[] args)
	{
		     WebDriver driver = new ChromeDriver();
	        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	        driver.manage().window().maximize();
	        
	         driver.findElement(By.xpath("//button[@onclick=\"jsAlert()\"]")).click();
		        Alert JS = driver.switchTo().alert();
                System.out.println(JS.getText());
	            JS .accept();
	            
	            driver.findElement(By.xpath("//button[@onclick=\"jsConfirm()\"]")).click();
	            Alert JSC = driver.switchTo().alert();
	            System.out.println(JSC.getText());
	            JSC.accept();
	            
	            WebElement JSP = driver.findElement(By.xpath("//button[@onclick=\"jsPrompt()\"]"));
	            JSP.click();
	            Alert JSE = driver.switchTo().alert();
	            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	            JSE.sendKeys("Venkatesh");
	            System.out.println(JSE.getText());
	            JSE.accept();
	            
	            WebElement Result = driver.findElement(By.id("result"));
	            System.out.println("What is Entered Text :" + Result.getText());

	        
	        

	}

}
