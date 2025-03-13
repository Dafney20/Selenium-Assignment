package week4.marathon;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
public class PVRTestCase {
public static void main(String[] args) throws InterruptedException  {
        
        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();

       // Load the URL
       driver.get("https://www.pvrcinemas.com/");
       

       // Maximize the browser window
       driver.manage().window().maximize();

       // Add an implicit wait to ensure the web page elements are fully loaded
       WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
 
      
    // Wait for the "Cinema" text to appear and click it
       WebElement cinemaText = driver.findElement(By.xpath("//span[text()='Cinema']"));
       
       // Click on the "Cinema" text
       cinemaText.click();
       
       // Print confirmation message
       System.out.println("Clicked on Cinema");
       
    // Wait for the "Select Cinema" span to appear and click it
       WebElement selectCinemaButton = driver.findElement(By.xpath("//span[text()='Select Cinema']"));
       
       // Click on the "Select Cinema" element
       selectCinemaButton.click();
       
       // Print confirmation message
       System.out.println("Clicked on Select Cinema");
       
       // Wait for the "INOX National, Virugambakkam Chennai" text to appear and click it
       WebElement inoxCinema = driver.findElement(By.xpath("//span[text()='INOX National, Virugambakkam Chennai']"));
       
       // Click on the INOX Cinema element
       inoxCinema.click();
       
       // Print confirmation message
       System.out.println("Clicked on INOX National, Virugambakkam Chennai");
       
    // Wait for the "Select Date" span to appear and click it
       WebElement selectDateButton = driver.findElement(By.xpath("//span[text()='Select Date']"));
       
       // Click on the "Select Date" element
       selectDateButton.click();
       
       // Print confirmation message
       System.out.println("Clicked on Select Date");
       
    // Now click on "Tomorrow, 24th Jan"
       WebElement tomorrowDate = driver.findElement(By.xpath("//span[text()='24']"));  // Assuming the date is displayed with just "24"
       
       // Click on the "24" element for tomorrow
       tomorrowDate.click();
       
       // Wait for the movie dropdown to load and click on the movie list
       WebElement movieDropdown = driver.findElement(By.xpath("//span[text()='Select Movie']"));
       movieDropdown.click();
       
       // Wait for the KUDUMBASTHAN movie item and click it
       WebElement kudumbasthanMovie = driver.findElement(By.xpath("//li[contains(text(),'KUDUMBASTHAN')]"));
       kudumbasthanMovie.click();
       
       // Print confirmation message
       System.out.println("Selected KUDUMBASTHAN movie");
       
    // Wait for the "Select Timing" dropdown to appear and click it
       WebElement selectTimingButton = driver.findElement(By.xpath("//span[text()='Select Timing']"));
       
       // Click on the "Select Timing" element
       selectTimingButton.click();
       
       // Print confirmation message
       System.out.println("Clicked on Select Timing");
       
    // Wait for the specific time element and click it
       WebElement timingButton = driver.findElement(By.xpath("//span[text()='12:45 PM']"));
       
       // Click on the "12:45 PM" element
       timingButton.click();
       
       // Print confirmation message
       System.out.println("Clicked on 12:45 PM");
       
    // Wait for the "Book" button to appear and click it
       WebElement bookButton = driver.findElement(By.xpath("//button[@aria-label='Submit']//span[text()='Book']"));
       
       // Click on the "Book" button
       bookButton.click();
       
       // Print confirmation message
       System.out.println("Clicked on the Book button");
       
    // Wait for the "Accept" button to appear and click it
       WebElement acceptButton = driver.findElement(By.xpath("//button[contains(@class, 'reject-terms') and text()='Accept']"));
       
       // Click on the "Accept" button
       acceptButton.click();
       
       // Print confirmation message
       System.out.println("Clicked on Accept button");
       
       // Wait for the seat element to appear and click it
       WebElement seat = driver.findElement(By.id("SL.SILVER|D:8"));
       
       // Click on the seat element
       seat.click();
       
       // Print confirmation message
       System.out.println("Clicked on Seat 8");
       
    // Wait for the "Proceed" button to appear and click it
       WebElement proceedButton = driver.findElement(By.xpath("//button[contains(@class, 'btn-proceeded')]"));
       
       // Click on the "Proceed" button
       proceedButton.click();
       
       // Print confirmation message
       System.out.println("Clicked on Proceed button");
      
       driver.quit();
}
}