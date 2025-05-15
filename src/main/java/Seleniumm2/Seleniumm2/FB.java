package Seleniumm2.Seleniumm2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FB {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = (WebDriver) new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		 WebElement searchfb = driver.findElement(By.xpath("//input[@aria-label='Search']"));
		searchfb.sendKeys("facebook");
		WebElement clicksearch = driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]"));
		clicksearch.click(); 
		driver.findElement(By.xpath("a[@aria-label='Google apps']")).click();
		Thread.sleep(3000);
		driver.switchTo().frame("iframe");
		driver.findElement(By.xpath("//*[@id=\"yDmH0d\"]/c-wiz/div/div/c-wiz/div/div/ul[1]/li[4]/a/div/span")).click();
		
		//WebElement clicksign = driver.findElement(By.xpath("//a[text()='Sign in']"));
		//clicksign.click();
		//WebElement clickapp = driver.findElement(By.xpath("//*[@class='gb_Pe']"));
		//clickapp.click();
		
		//WebElement clickNext = driver.findElement(By.xpath("//span[text()='Next']"));
		//clickNext.click();
		//from apps want to click on google news
		/*WebElement googlenew = driver.findElement(By.xpath("//*[@id=\"yDmH0d\"]/c-wiz/div/div/c-wiz/div/div/ul[1]/li[6]/a"));
		googlenew.click();*/
		
		
		//driver.quit();
	}
}
