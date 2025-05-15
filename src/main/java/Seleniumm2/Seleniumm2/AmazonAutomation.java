//package Seleniumm2.Seleniumm2;

//public class ssss {
	package Seleniumm2.Seleniumm2;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;

	import java.time.Duration;
	import java.util.ArrayList;

	public class AmazonAutomation {

	    public static void main(String[] args) {
	        WebDriver driver = new ChromeDriver();
	        driver.get("https://www.amazon.in/");
	        driver.manage().window().maximize();

	        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
	        searchBox.sendKeys("Iphone 16 Pro Max");

	        WebElement searchButton = driver.findElement(By.id("nav-search-submit-button"));
	        searchButton.click();

	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        WebElement firstProductImage = wait.until(ExpectedConditions.elementToBeClickable(By.className("s-image")));
	        firstProductImage.click();

	        // Direct switch using List
	        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
	        driver.switchTo().window(tabs.get(1)); // Directly switch to second tab (index 1)

	        WebElement sellOnAmazonLink = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Sell on Amazon")));
	        sellOnAmazonLink.click();

	        driver.quit();
	    }
	}


