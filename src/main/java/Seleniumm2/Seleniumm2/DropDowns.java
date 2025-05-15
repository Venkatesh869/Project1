package Seleniumm2.Seleniumm2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDowns 
{
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://practice.expandtesting.com/dropdown");

		WebElement Dropd = driver.findElement(By.id("dropdown"));

		Select Course = new Select(Dropd);
		Course.selectByVisibleText("Option 1");

		List<WebElement> CourseOptions = Course.getOptions();
		for (WebElement Options : CourseOptions) 
		System.out.println(Options.getText());

		WebElement DOB = driver.findElement(By.className("form-control"));

		Select EPP = new Select(DOB);
		EPP.selectByValue("50");

		List<WebElement> EPPOptions = EPP.getOptions();
		for (WebElement Options : EPPOptions) {
			System.out.println(Options.getText());
			
			WebElement DD1 = driver.findElement(By.xpath("//*[@name=\"country\"]"));
			
			Select CS = new Select(DD1);
			CS.selectByVisibleText("Denmark");
			
			List<WebElement> CSOptions = CS.getOptions();
			for (WebElement options : CSOptions) {
			System.out.println(options.getText());
			
				
			}
			
		}
		{
			
		}

			}

}
