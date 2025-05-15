package Seleniumm2.Seleniumm2;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class irct {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().window().maximize();
		
		String X =driver.getCurrentUrl();
		System.out.println(X);
		
		String Y=driver.getTitle();
		System.out.println(Y);
		
	    WebElement From = driver.findElement(By.xpath("//input[@class=\"ng-tns-c57-8 ui-inputtext ui-widget ui-state-default ui-corner-all ui-autocomplete-input ng-star-inserted\"]"));
		From.sendKeys("Anantapur");
		
		
		WebElement To = driver.findElement(By.xpath("//input[@class=\"ng-tns-c57-9 ui-inputtext ui-widget ui-state-default ui-corner-all ui-autocomplete-input ng-star-inserted\"]"));
		To.sendKeys("Proddatur");
		
		driver.findElement(By.xpath("//label[text()='Flexible With Date']")).click();
	
	    driver.findElement(By.xpath("//span[@class=\"ui-dropdown-trigger-icon ui-clickable ng-tns-c65-12 pi pi-chevron-down\"]")).click();
	    driver.findElement(By.xpath("//span[text()='DUTY PASS']")).click();
		driver.findElement(By.xpath("//span[@class=\"ui-button-text ui-clickable\"]")).click();
		driver.findElement(By.xpath("//button[text()='Easy Booking on AskDISHA']")).click();
		
		    ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
	        driver.switchTo().window(tabs.get(1));
	        
	    driver.navigate().refresh();
		driver.findElement(By.xpath("//div[text()='Select Your Source Station']")).click();
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div[3]/div/div[1]/div[1]/div/div/input")).sendKeys("Anantapur");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//*[@id=\"disha-drawer-1\"]/div/div[1]/div[2]/div/div[2]/div[1]/div/div/div/p")).click();
		
			driver.findElement(By.xpath("//*[@id=\"book-form\"]/div[1]/div[3]/div/span")).click();
			driver.findElement(By.id("station-textbox")).sendKeys("Proddatur");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.findElement(By.xpath("//*[@id=\"disha-drawer-1\"]/div/div[1]/div[2]/div/div[2]/div[1]/div")).click();
            
            driver.findElement(By.xpath("//*[@id=\"book-form\"]/div[2]/div[1]/div/div")).click();
            driver.findElement(By.xpath("//*[@id=\"May-2025\"]/ul[2]/li[14]/span")).click();
            
            driver.findElement(By.xpath("//div[text()='General - GN']")).click();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.findElement(By.xpath("/html/body/div/div/div[2]/div[3]/div/div[1]/div[2]/div/div[1]")).click();
            
            driver.findElement(By.xpath("//button[text()='Book Ticket']")).click();
            driver.findElement(By.xpath("//*[@id=\"corover-body\"]/div/div[3]/div/div[5]/div[1]/div/div/p")).click();
          //  driver.findElement(By.xpath("//p[text()='RAC  62/RAC  55']")).click();
            driver.findElement(By.xpath("//*[@id=\"disha-drawer-1\"]/div/div[1]/div[2]/div/div[5]/span[3]")).click();
            driver.findElement(By.className("book-submit")).click();
            driver.findElement(By.xpath("//input[@placeholder=\"Enter mobile number\"]")).sendKeys("8639082431");
            driver.findElement(By.xpath("//*[@id=\"drawer-footer\"]/button")).click();
           
            
        WebElement Logo = driver.findElement(By.xpath("//div[@class=\"row col-sm-12 h_head2\"]"));
		System.out.println("Logo is Visible :"	+ Logo.isDisplayed() );	
	}
}
