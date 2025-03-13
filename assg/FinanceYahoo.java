package week6.assg;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.messages.types.Duration;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.List;
public class FinanceYahoo {
	 @Test
	 public  void yahoo() {
		// Setup WebDriver
	        WebDriverManager.chromedriver().setup();
	        WebDriver driver = new ChromeDriver();
	        
	        // Step 1: Open Yahoo Finance
	        driver.get("https://finance.yahoo.com/");
	        driver.manage().window().maximize();
            
	        //Type crypto
	        driver.findElement(By.id("ybar-sbq")).sendKeys("Crypto");
	        
	        WebElement cryptoTab = driver.findElement(By.xpath("//div[contains(text(), 'Go to Crypto')]"));
	        cryptoTab.click();

	     

	 }
}
