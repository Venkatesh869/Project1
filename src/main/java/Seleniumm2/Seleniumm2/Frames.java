package Seleniumm2.Seleniumm2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) throws Exception 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://ui.vision/demo/webtest/frames/");
		
		WebElement Frame1 = driver.findElement(By.xpath("//frame[@src=\"frame_1.html\"]"));
		driver.switchTo().frame(Frame1);
		driver.findElement(By.xpath("//input[@name=\"mytext1\"]")).sendKeys("Macha");
		
		driver.switchTo().defaultContent();
		
		WebElement F2 = driver.findElement(By.xpath("//frame[@src=\"frame_2.html\"]"));
		driver.switchTo().frame(F2);
		driver.findElement(By.xpath("//input[@name=\"mytext2\"]")).sendKeys("Venkatesh");
		
		driver.switchTo().defaultContent();

		WebElement F3= driver.findElement(By.xpath("//frame[@src=\"frame_3.html\"]"));
		driver.switchTo().frame(F3);
		driver.findElement(By.xpath("//input[@name=\"mytext3\"]")).sendKeys("Macha");
		
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//div[@class=\"AB7Lab Id5V1\"]")).click();           //iframe
		driver.findElement(By.xpath("//div[@class=\"uHMk6b fsHoPb\"]")).click();
		
		//WebElement DDD = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div[2]/div[1]/div[2]/div[3]/div/div/div[2]/div/div[1]/div[2]"));
		//Select DD1 = new Select(DDD);
		//DD1.selectByVisibleText("Well, now I know :-)");
		driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div[2]/div[1]/div[2]/div[3]/div/div/div[2]/div/div[1]/div[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div/div/form/div[2]/div[1]/div[2]/div[3]/div/div/div[2]/div/div[2]/div[3]/span")).click();
		driver.findElement(By.xpath("//span[text()='Next']")).click();    //NextPage
		driver.findElement(By.xpath("//input[@jsname=\"YPqjbf\"]")).sendKeys("Macha");
		driver.findElement(By.xpath("//textarea[@aria-label=\"Your answer\"]")).sendKeys("I am at Naresh IT");
		driver.findElement(By.xpath("//span[text()='Submit']")).click();
		
		driver.switchTo().defaultContent();
        WebElement F4 = driver.findElement(By.xpath("//frame[@src=\"frame_4.html\"]"));
		driver.switchTo().frame(F4);
		driver.findElement(By.xpath("//input[@name=\"mytext4\"]")).sendKeys("Venkatesh");
		driver.quit();
		
		

	}

}
