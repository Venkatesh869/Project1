package Seleniumm2.Seleniumm2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragndDrop {

	public static void main(String[] args) 
	{
WebDriver driver = new ChromeDriver();
driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		
		WebElement Washing = driver.findElement(By.xpath("//*[@id=\"box3\"]"));
		WebElement Italy = driver.findElement(By.id("box106"));
		WebElement Copenhagen = driver.findElement(By.id("box4"));
		WebElement Spain = driver.findElement(By.id("box107"));
		WebElement Rome = driver.findElement(By.id("box6"));
		WebElement Norway = driver.findElement(By.id("box101"));
		WebElement oslo = driver.findElement(By.id("box1"));
		WebElement Denmark = driver.findElement(By.id("box104"));
		WebElement Seoul = driver.findElement(By.id("box5"));
		WebElement Sweden = driver.findElement(By.id("box102"));
		WebElement Stockholem = driver.findElement(By.id("box2"));
		WebElement US = driver.findElement(By.id("box103"));
		WebElement Madriad = driver.findElement(By.id("box7"));
		WebElement Southkorea = driver.findElement(By.id("box105"));

		
		Actions action = new Actions(driver);
		action.dragAndDrop(Washing, Italy).build().perform();
		action.dragAndDrop(Rome, Norway).build().perform();
		action.dragAndDrop(Copenhagen, Spain).build().perform();
		action.dragAndDrop(oslo, Denmark).build().perform();
		action.dragAndDrop(Seoul, Sweden).build().perform();
		action.dragAndDrop(Stockholem, US).build().perform();
		action.dragAndDrop(Madriad, Southkorea).build().perform();
		
	}
	
	

}
