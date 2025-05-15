package Seleniumm2.Seleniumm2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboardctions 

{

public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://text-compare.com/");
        driver.manage().window().maximize();
        
   driver.findElement(By.id("inputText1")).sendKeys("WELCOME");
        
       Actions action = new Actions(driver);
        action.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).build().perform();
        action.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).build().perform();
        action.keyDown(Keys.TAB).keyUp(Keys.TAB).build().perform();
        action.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).build().perform();
         driver.quit();
        
         
        
}
}