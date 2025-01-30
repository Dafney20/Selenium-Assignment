package week5.assg;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AjioHomePage {
    public static void main(String[] args) throws InterruptedException {
        // Set up WebDriver
        ChromeDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().window().maximize();

        // Step 1: Launch the URL
        driver.get("https://www.ajio.com/");

        //search bags
        driver.findElement(By.name("searchVal")).sendKeys("Bags", Keys.ENTER);
        
        //Select Gender as Men
        driver.findElement(By.xpath("//label[@for='Men']")).click();

        // Wait for filter to apply
        Thread.sleep(3000);

        // Click on "Fashion Bags" checkbox
        WebElement fashionBagsCheckbox = driver.findElement(By.xpath("//label[contains(text(), 'Fashion Bags')]"));
        fashionBagsCheckbox.click();

        // Wait for results to update
        Thread.sleep(3000);

     // Fetch item count
        WebElement itemCount = driver.findElement(By.xpath("//div[@class='length']/strong"));
        System.out.println("Total items found: " + itemCount.getText());

        
     // Get the list of brand names
       List<WebElement> brandElements = driver.findElements(By.xpath("//div[@class='brand']"));
        System.out.println("\nList of Brands:");
        for (WebElement brand : brandElements) {
            System.out.println(brand.getText());
        }

        // Get the list of product names
        List<WebElement> productElements = driver.findElements(By.xpath("//div[@class='nameCls']"));
        System.out.println("\nList of Product Names:");
        for (WebElement product : productElements) {
            System.out.println(product.getText());
        }

        driver.quit();
    }

    }
