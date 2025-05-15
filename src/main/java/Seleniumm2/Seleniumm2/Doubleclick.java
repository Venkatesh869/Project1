package Seleniumm2.Seleniumm2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Doubleclick {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		
		WebElement Button= driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
		
		Actions action = new Actions(driver);
		action.doubleClick(Button).build().perform();
		
		Alert alert = driver.switchTo().alert();
		System.out.println("what the Text :" + alert.getText());
		alert.accept();
	}

}
