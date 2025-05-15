package Seleniumm2.Seleniumm2;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDndSendkeys {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		Thread.sleep(2000);
		
		WebElement DD=driver.findElement(By.id("course"));
		
		Select DropD = new Select(DD);
		DropD.selectByVisibleText("Java");
		
		List<WebElement> Options = DropD.getOptions();
		for (WebElement Option : Options) 
			System.out.println(Option.getText());
		{
			
		}
	
		String B = driver.getPageSource();
		System.out.println(B);
		String C = driver.getTitle();
		System.out.println(C);
		String A = driver.getCurrentUrl();
		System.out.println(A);
		
		driver.navigate().to("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Macha");
		driver.findElement(By.xpath("//input[@maxlength='15']")).sendKeys("Venkatesh");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Venkatesh");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Clear']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Click']")).click();
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		
		
		
		

	}

}


