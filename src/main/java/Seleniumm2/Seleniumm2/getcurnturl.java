package Seleniumm2.Seleniumm2;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getcurnturl {

	public static void main(String[] args) throws Exception 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");
		

		TakesScreenshot Ts = (TakesScreenshot) driver;
		File T1 = Ts.getScreenshotAs(OutputType.FILE);
		File T2= new File("./Screenshots/img1.png");
		FileUtils.copyFile(T1, T2);
		
		String URL = driver.getCurrentUrl();
		System.out.println("Current url is " + URL);
		
		if (URL.startsWith("https")) 
		{
			
			System.out.println("This is Secured");
		}	
			else {
				System.out.println("This is not Secured");
			}
		driver.quit();
		}
	
	}


