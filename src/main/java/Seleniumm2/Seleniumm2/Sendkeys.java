package Seleniumm2.Seleniumm2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sendkeys {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/");
		driver.manage().window().maximize();
		WebElement TP = driver.findElement(By.xpath("//a[text()='Telecom Project']"));
		TP.click();
		
		WebElement ADD = driver.findElement(By.xpath("//a[text()='Add Customer']"));
		ADD .click();
		
		WebElement Done = driver.findElement(By.xpath("//label [text()='Done' ]"));
		Done.click();
		
				WebElement FN = driver.findElement(By.id("fname"));
				FN.sendKeys("Macha");
				
				WebElement LN = driver.findElement(By.id("lname"));
				LN.sendKeys("Venkatesh");
				

				WebElement Email = driver.findElement(By.xpath("//input[@name='emailid']"));
				Email.sendKeys("sandygadupreethi@gmail.com");
				
				WebElement ADD1 = driver.findElement(By.xpath("//textarea[@name='addr']"));
				ADD1.sendKeys("Ameerpet, Hyd");
				
				WebElement Cell = driver.findElement(By.id("telephoneno"));
				Cell.sendKeys("8639082431");
				Thread.sleep(2000);
				
				WebElement Reset = driver.findElement(By.xpath("//input[@class='alt']"));
				Reset.click();
				
				driver.navigate().to("https://demo.guru99.com/Security/SEC_V1/index.php");
				
				driver.navigate().back();
				driver.navigate().forward();
				String A = driver.getCurrentUrl();
				System.out.println(A);
				String B=driver.getPageSource();
				System.out.println(B);
				String c = driver.getTitle();
				System.out.println(c);
				String D = driver.getWindowHandle();
				System.out.println(D);
				
				WebElement Logo = driver.findElement(By.xpath("//img[@src='/logo.png']"));
				System.out.println("The Logo is Visible:" + Logo.isDisplayed());
				
	}
}
