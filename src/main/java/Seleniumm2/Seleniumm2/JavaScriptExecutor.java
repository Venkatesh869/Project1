package Seleniumm2.Seleniumm2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor {

	public static void main(String[] args) throws Exception
	{
		WebDriver driver = new ChromeDriver();
		//driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		/* JavascriptExecutor js = (JavascriptExecutor) driver;                                       //finding WebElement
 WebElement Username = (WebElement) js.executeScript("return document.getElementById('email');");    
Username.sendKeys("Venkatesh"); */
		
		driver.get("https://www.amazon.in/");
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		
			WebElement Search = driver.findElement(By.id("twotabsearchtextbox"));
	//	js1.executeScript("arguments[0].style.border='2px solid red'", Search);
	//	js1.executeScript("arguments[0].style.background='yellow'", Search);
	
	//js1.executeScript("arguments[0].setAttribute('style', 'background: red; ,border: 2px solid red; ')", Search);
	
	js1.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red; background: yellow !important')", Search);
//js1.executeScript("window.scroll(0,500)", "");
//js1.executeScript("window.scrollBy(0,1000)", "");
		Thread.sleep(3000);
WebElement Signin = driver.findElement(By.xpath("//div[@class=\"nav-logo-base nav-sprite\"]"));
Thread.sleep(3000);


js1.executeScript("arguments[0].scrollIntoView()", Signin);
	}

}
