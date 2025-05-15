package Seleniumm2.Seleniumm2;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Rightclick {

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
        driver.get("https://swisnl.github.io/jQuery-contextMenu/demo");
        driver.manage().window().maximize();
        
        WebElement Rightclkbutton = driver.findElement(By.xpath("/html/body/div/section/div/div/div/p/span"));
        
        Actions Click = new Actions(driver);
        
        Click.contextClick(Rightclkbutton).build().perform();
        

	}

}
