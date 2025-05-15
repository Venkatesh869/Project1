package Seleniumm2.Seleniumm2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Frame {

	public static void main(String[] args) throws InterruptedException 
	
	{
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
	driver.manage().window().maximize();
 
	driver.findElement(By.id("name")).sendKeys("Macha");
	
	driver.switchTo().frame(driver.findElement(By.id("frm1")));
	
	WebElement Drop = driver.findElement(By.id("course"));
	
	
	Select DD = new Select(Drop);
	DD.selectByVisibleText("Java");
	
	List<WebElement> Option = DD.getOptions();
  for (WebElement Options : Option)
  System.out.println(Options.getText());
	
	driver.switchTo().defaultContent();
	

	driver.findElement(By.id("name")).sendKeys("Venkatesh");
	
	Thread.sleep(5000);
    driver.switchTo().frame(driver.findElement(By.id("frm2")));
    driver.findElement(By.id("firstName")).sendKeys("Macha");
    driver.findElement(By.id("lastName")).sendKeys("Venkatesh");
    driver.findElement(By.className("bcRadioButton")).click();
    driver.findElement(By.id("englishchbx")).click();
    driver.findElement(By.name("email")).sendKeys("Venky@gmail.com");
    driver.findElement(By.name("psw")).sendKeys("0000000000");
   
    driver.switchTo().defaultContent(); 
    WebElement Logo = driver.findElement(By.id("Header1_headerimg"));
    System.out.println("The Logo is Visible : " + Logo.isDisplayed());
    System.out.println("The Logo is Enabled :" + Logo.isEnabled());
    System.out.println("The Logo is Selected :" + Logo.isSelected());
    
    String A = driver.getPageSource();
    System.out.println(A); 
    
    String B= driver.getCurrentUrl();
    System.out.println(B);
    String C = driver.getTitle();
    System.out.println(C);
    String D= driver.getWindowHandle();
    System.out.println(D);
    
    
    
	
	
	
	
	
	

	
	

	}

}
