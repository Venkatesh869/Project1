package Seleniumm2.Seleniumm2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Tooltip1 {

	public static void main(String[] args) throws Exception {
WebDriver driver = new ChromeDriver();
driver.get("https://www.globalsqa.com/demo-site/tooltip/");

WebElement F1 = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
driver.switchTo().frame(F1);

Thread.sleep(3000);

WebElement E1=driver.findElement(By.xpath("//a[text()='Vienna, Austria']"));
Actions action = new Actions(driver);
action.moveToElement(E1).build().perform();
System.out.println("What the text :" + E1.getText());

WebElement Text2 = driver.findElement(By.xpath("//img[@src='images/st-stephens.jpg']"));
Actions t2 = new Actions(driver);
t2.moveToElement(Text2).build().perform();
System.out.println("what the text :" + Text2.getText());

driver.quit();


	}

}
