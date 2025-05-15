package Seleniumm2.Seleniumm2;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboardactions {

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_default_default");
WebElement Search = driver.findElement(By.xpath("//*[@id=\"textareawrapper\"]/div/div[6]/div[1]/div/div"));

Actions action = new Actions(driver);
action.moveToElement(Search).click();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
action.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).build().perform();
action.keyDown(Keys.CONTROL).sendKeys("X").keyUp(Keys.CONTROL).build().perform();


	}

}
