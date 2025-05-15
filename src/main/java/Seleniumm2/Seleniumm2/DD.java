package Seleniumm2.Seleniumm2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class DD {

	public static void main(String[] args)
	{
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
	
WebElement DD = driver.findElement(By.xpath("//*[@id=\"post-2646\"]/div[2]/div/div/div/p/select"));
 
Select select = new Select(DD);
select.selectByVisibleText("Australia");

               List<WebElement> Options = select.getOptions();
               for (WebElement Option : Options) 
               System.out.println(Option.getText());
               
               {
				
			}
	{
		
	}
	}

}
