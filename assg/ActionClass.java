package week6.assg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.*;
import org.openqa.selenium.io.FileHandler;
import java.io.File;
import java.io.IOException;

public class ActionClass {
    public static void main(String[] args) throws IOException {
    	// Initialize WebDriver
        WebDriver driver = new ChromeDriver();

        // Maximize browser and add implicit wait
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        // Load Amazon India website
        driver.get("https://www.amazon.in/");
 
        //Search the element 
        driver.findElement(By.name("field-keywords")).sendKeys("oneplus 9 pro", Keys.ENTER);
        
       // Locate the first product price using class name
        WebElement firstProductPrice = driver.findElement(By.className("a-price-whole"));

        // Get the text of the price
        String price = firstProductPrice.getText();

        // Print the price
        System.out.println("Price of first product: ₹" + price);
        
        
        //print the number of reviews 
        WebElement customerRatings = driver.findElement(By.className("a-size-base"));

        // Get the text of the ratings
        String ratings = customerRatings.getText();

        // Print the customer ratings count
        System.out.println("Customer ratings for the first product: " + ratings);

        // Locate the first product image and click on it
        WebElement firstProductImage = driver.findElement(By.cssSelector("img.s-image"));

        // Click the image link to open the product details page
        firstProductImage.click();

        // Take a screenshot
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        // Define the destination path (Downloads folder)
        String filePath = System.getProperty("user.home") + "\\Downloads\\screenshot.png";

        try {
            // Copy the screenshot to the destination
            FileHandler.copy(screenshot, new File(filePath));
            System.out.println("Screenshot saved successfully at: " + filePath);
        } catch (IOException e) {
            System.out.println("Failed to save screenshot: " + e.getMessage());
        }
        
        //Add to cart
        driver.findElement(By.id("a-autoid-1-announce")).click();

        String subtotal = driver.findElement(By.xpath("//h2[contains(@class, 'a-size-base a-color-price a-text-bold')]")).getText();
        System.out.println("Subtotal Amount: " + subtotal);
        driver.quit();
    }
    
}
    