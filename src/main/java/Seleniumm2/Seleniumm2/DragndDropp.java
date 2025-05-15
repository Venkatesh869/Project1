package Seleniumm2.Seleniumm2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v132.input.model.DragData;
import org.openqa.selenium.interactions.Actions;

public class DragndDropp {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
	
driver.get("https://www.globalsqa.com/demo-site/draganddrop/#Photo%20Manager");

driver.switchTo().frame(driver.findElement(By.xpath("(//iframe[@src='data:image/gif;base64,R0lGODlhAQABAAAAACH5BAEKAAEALAAAAAABAAEAAAICTAEAOw=='])[1]")));

WebElement HT1 = driver.findElement(By.xpath("//h5[text()='High Tatras']"));
WebElement HT2 = driver.findElement(By.xpath("//h5[text()='High Tatras 2']"));
WebElement HT3 = driver.findElement(By.xpath("//h5[text()='High Tatras 3']"));
WebElement HT4 = driver.findElement(By.xpath("//h5[text()='High Tatras 4']"));


WebElement Trash = driver.findElement(By.id("trash"));

Actions action = new Actions(driver);
action.dragAndDrop(HT1, Trash).build().perform();
action.dragAndDrop(HT2, Trash).build().perform();
action.dragAndDrop(HT3, Trash).build().perform();
action.dragAndDrop(HT4, Trash).build().perform();


	}}

