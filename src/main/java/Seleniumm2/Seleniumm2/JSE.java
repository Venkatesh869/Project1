package Seleniumm2.Seleniumm2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSE {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com.gr/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();

		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("window.scroll(0,200)");
		Thread.sleep(3000);
		//js.executeScript("window.scrollBy(0,300)");
		//Thread.sleep(3000);
		//  js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
		//  Thread.sleep(3000);
       // js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
      
        
		 //    WebElement MB = driver.findElement(By.xpath("(//div[@class='product-thumb transition'])[1]"));
       WebElement SB = driver.findElement(By.xpath("(//img[@alt=\"iPhone 6\"])[1]"));
   
       //     js.executeScript("arguments[0].scrollIntoView();", MB);
      js.executeScript("arguments[0].scrollIntoView();", SB);

  js.executeScript("arguments[0].setAttribute('style', 'border:2px black dotted ; background : yellow;')", SB);
  //     js.executeScript("arguments[0].setAttribute('style', 'border:2px black dotted ; background : yellow;')", MB);
        
       //For Single WebElement SC
       File sourceFile = SB.getScreenshotAs(OutputType.FILE);
		File destFile = new File("./Screenshots/img2.png");
		FileUtils.copyFile(sourceFile, destFile);
  
  // For Full Page SC
  TakesScreenshot TS = (TakesScreenshot) driver;
  File sourceFile1 = TS.getScreenshotAs(OutputType.FILE);
  File destFile1 = new File("./Screenshots/img3.png");
  FileUtils.copyFile(sourceFile1, destFile1);
  
	}

}
