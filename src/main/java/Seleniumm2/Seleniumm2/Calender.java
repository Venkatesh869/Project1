package Seleniumm2.Seleniumm2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Calender {

	public static void main(String[] args) 
	{
WebDriver driver = new ChromeDriver();
driver.get("https://www.irctc.co.in/nget/train-search");
driver.findElement(By.xpath("//input[@class='ng-tns-c58-10 ui-inputtext ui-widget ui-state-default ui-corner-all ng-star-inserted']")).click();"/."

WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("ng-trigger ng-trigger-overlayAnimation ng-tns-c58-10 ui-datepicker ui-widget ui-widget-content ui-helper-clearfix ui-corner-all ui-shadow ng-star-inserted")));

String Month = driver.findElement(By.className("ui-datepicker-month")).getText();
String Year = driver.findElement(By.className("ui-datepicker-year")).getText();

while (!(Month.equals("July") && Year.equals("2025"))) {
	
	driver.findElement(By.className("ui-datepicker-next ui-corner-all ng-tns-c58-10 ng-star-inserted")).click();
	
	 Month = driver.findElement(By.className("ui-datepicker-month ng-tns-c58-10 ng-star-inserted")).getText();
	 Year = driver.findElement(By.className("ui-datepicker-year ng-tns-c58-10 ng-star-inserted")).getText();
	 
	 driver.findElement(By.xpath("//a[text()='16']")).click();

}

driver.quit();
	}

}
