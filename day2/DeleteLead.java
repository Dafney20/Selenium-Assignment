package week2.day2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
public class DeleteLead {
	public static void main(String[] args)  {
	// Initialize WebDriver
      WebDriver driver = new ChromeDriver();

   // Load the URL
      driver.get("http://leaftaps.com/opentaps/.");

   // Maximize the browser window
      driver.manage().window().maximize();

   // Add an implicit wait to ensure the web page elements are fully loaded
      WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
      
      //Enter the username and password
      WebElement username = driver.findElement(By.id("username"));
      username.sendKeys("demosalesmanager"); 
      WebElement password = driver.findElement(By.id("password"));
      password.sendKeys("crmsfa"); 

      // Step 3: Click the Login button
      WebElement loginButton = driver.findElement(By.className("decorativeSubmit"));
      loginButton.click();

      // Step 4: Click the "crm/sfa" link
      WebElement crmLink = driver.findElement(By.linkText("CRM/SFA"));
      crmLink.click();

      // Step 5: Click the "Leads" link
      WebElement leadsLink = driver.findElement(By.linkText("Leads"));
      leadsLink.click();

      // Step 6: Click "Find Leads"
      WebElement findLeadsLink = driver.findElement(By.linkText("Find Leads"));
      findLeadsLink.click();

      // Step 7: Click on the "Phone" tab
      WebElement phoneTab = driver.findElement(By.linkText("Phone"));
      phoneTab.click();

      // Step 8: Enter the phone number
      WebElement phoneNumberField = driver.findElement(By.name("phoneNumber"));
      phoneNumberField.sendKeys("1234567890"); 

      // Step 9: Click the "Find Leads" button
      WebElement findLeadsButton = driver.findElement(By.xpath("//button[text()='Find Leads']"));
      findLeadsButton.click();
   
      //AFTER CLICKING THE FIND LEADS IT IS SHOWNING ONE MOMENT AND NOT GETTING LOADED, NO RESULTS FOUND" 
      
      driver.quit();
}
}