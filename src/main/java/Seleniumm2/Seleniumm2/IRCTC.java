package Seleniumm2.Seleniumm2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IRCTC {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
driver.get("https://www.amazon.in/");
driver.manage().window().maximize();

WebElement Search = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
Search.sendKeys("Iphone 16 Pro Max");

Thread.sleep(2000);

WebElement Click = driver.findElement(By.id("nav-search-submit-button"));
  Click.click();

  WebElement Link = driver.findElement(By.className("s-image"));
Link.click();
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@id=\"buy-now-button\"]")).click();

//driver.findElement(By.xpath("//a[text()=\"Sell on Amazon\"]")).click();		

	}

		
	}


