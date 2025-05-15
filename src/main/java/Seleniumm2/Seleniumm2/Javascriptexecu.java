package Seleniumm2.Seleniumm2;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascriptexecu {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://demo.nopcommerce.com/");

JavascriptExecutor js = (JavascriptExecutor) driver;
//WebElement Search = driver.findElement(By.id("small-searchterms"));
//Search.sendKeys("Laptops");
/*js.executeScript("window.scroll(0,500)");   
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
js.executeScript("window.scrollBy(0,500)");   
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 
js.executeScript("window.scrollBy(0, document.body.scrollHeight)");
Thread.sleep(3000);
js.executeScript("window.scrollBy(0, -document.body.scrollHeight)");*/

WebElement NL = driver.findElement(By.xpath("/html/body/div[6]/div[4]"));
js.executeScript("arguments[0].scrollIntoView()", NL);
//js.executeScript("arguments[0].style.border='6px solid red'", NL);
//js.executeScript("arguments[0].style.background='Yellow'", NL);

js.executeScript("arguments[0].setAttribute('style', 'background: Yellow;border: 5px solid red; ')", NL);

File elementScreenshot = NL.getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(elementScreenshot, new File("./Screenshots/pic1.png"));

System.out.println("Screenshot saved as Sc.png");

/* WebElement SI = driver.findElement(By.className("slider-img"));
js.executeScript("arguments[0].scrollIntoView()", SI);
js.executeScript("arguments[0].setAttribute('style', background : Yellow; border : 5px dotted red')", SI);
 */

driver.quit();




	}

}
