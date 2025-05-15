package Seleniumm2.Seleniumm2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouseoveractions {

    public static void main(String[] args) throws Exception {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        Thread.sleep(2000);
        driver.manage().window().maximize();
        WebElement Com = driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[1]/a"));
        Actions action = new Actions(driver);
        action.moveToElement(Com).perform();
        System.out.println("what the text :" + Com.getText());
        
        WebElement Appearl = driver.findElement(By.xpath("//a[text()='Apparel ']"));
        Actions action1 = new Actions(driver);
        action1.moveToElement(Appearl).perform(); 
        System.out.println("what the text :" + Appearl.getText());

      
        
    }
}
