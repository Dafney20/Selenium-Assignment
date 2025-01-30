package week5.assg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.ui.FluentWait;

public class MergeContacts {
    public static void main(String[] args) {
        

    	// Initialize the ChromeDriver
        WebDriver driver = new ChromeDriver();
        // Maximize the browser window
        driver.manage().window().maximize();
        // Load the URL
        driver.get("http://leaftaps.com/opentaps/control/login");

        // Enter the username and password
        driver.findElement(By.id("username")).sendKeys("demosalesmanager");
        driver.findElement(By.id("password")).sendKeys("crmsfa");
        
        // Click on the Login button
        driver.findElement(By.className("decorativeSubmit")).click();

       // Click on the "CRM/SFA" link using XPath
        WebElement crmSfaLink = driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]"));
        crmSfaLink.click();
        
       // Click on the Contacts link
        driver.findElement(By.linkText("Contacts")).click();
        
        // Click on the Merge Contacts link
         driver.findElement(By.linkText("Merge Contacts")).click();

        // Click on the Lookup (widget) button using XPath
        driver.findElement(By.xpath("//img[@alt='Lookup']")).click();
        
        // Get the title of the page
        String pageTitle = driver.getTitle();

        // Print the title
        System.out.println("Page Title: " + pageTitle);

        }
}