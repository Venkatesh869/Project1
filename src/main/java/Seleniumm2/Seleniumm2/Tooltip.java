package Seleniumm2.Seleniumm2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Tooltip {

	public static void main(String[] args) throws InterruptedException
	{
		/* WebDriver driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();
        
        WebElement Cart = driver.findElement(By.xpath("//a[text()='Cart']"));
        
        Actions action = new Actions(driver);
        action.moveToElement(Cart).build().perform();
        System.out.println("What the Text : " + Cart.getText());
        driver.quit(); */
        
        WebDriver driver1 = new ChromeDriver();
        driver1.get("https://www.facebook.com/r.php?entry_point=login");
        driver1.manage().window().maximize();
        
        //method 2
        WebElement Dob = driver1.findElement(By.xpath("(//i[@class='img sp_98fCI7IVTTz sx_c4643a'])[1]"));
        Actions action1 = new Actions(driver1);
        action1.moveToElement(Dob).click().build().perform();
         
        WebElement Text =  driver1.findElement(By.xpath("//div[@class='_9hzn']"));
        System.out.println("What the Text : " + Text.getText()); 
        
        Thread.sleep(3000);
        
        WebElement G = driver1.findElement(By.xpath("(//i[@class='img sp_98fCI7IVTTz sx_c4643a'])[2]"));
        Actions action = new Actions(driver1);
        action.moveToElement(G).click().build().perform();
        
        WebElement T2 = driver1.findElement(By.xpath("//div[@class='_9hzn']"));
        System.out.println("What the text :" + T2.getText());
        
        
        //method1
  /*      driver1.findElement(By.xpath("(//i[@class='img sp_98fCI7IVTTz sx_c4643a'])[1]")).click();
       WebElement Text = driver1.findElement(By.xpath("//div[@class='_9hzn']"));
        System.out.println("What the text :" + Text.getText());  */
        
        
        
	}

}
