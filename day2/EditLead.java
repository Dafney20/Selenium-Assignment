package week2.day2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
public class EditLead {
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
	      
	      // Click on Create Lead
	        driver.findElement(By.linkText("Create Lead")).click();
	        
	     // Enter  company name as "TestLeaf"
	        
	        driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("TestLeaf");

	        
	     // Enter the FirstName using XPath
	        driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Dafney");

	      // Enter the LastName using XPath
	        driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Jervis");

	     // Enter the FirstName (Local) using XPath
	        driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("Dafney");
	        
	     // Enter the Department using XPath
	        driver.findElement(By.xpath("//input[@id='createLeadForm_departmentName']")).sendKeys("Computer Science");
	        
	       // Enter the Description using XPath
	        driver.findElement(By.xpath("//textarea[@id='createLeadForm_description']")).sendKeys("Selenium Automation");
	        
	     // Enter the E-mail using XPath
	        driver.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']")).sendKeys("dafneyjervis@gmail.com");

	        // Select State/Province as New York using visible text
	        Select stateDropdown = new Select(driver.findElement(By.xpath("//select[@id='createLeadForm_generalStateProvinceGeoId']")));
	        stateDropdown.selectByVisibleText("New York");
	        
	     // Click on the Create Button
	        driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
	        
	     // Click on the Edit Button using its XPath
	        driver.findElement(By.xpath("//a[@class='subMenuButton' and text()='Edit']")).click();

	     // Locate the description field by its ID
	        WebElement descriptionField = driver.findElement(By.id("updateLeadForm_description"));

	        // Clear the text in the description field
	        descriptionField.clear();
	        
         //Important note
	     WebElement importantNoteField = driver.findElement(By.id("updateLeadForm_importantNote"));
         importantNoteField.sendKeys("Lead creation completed");

         // Locate the update button by its name attribute
         WebElement updateButton = driver.findElement(By.name("submitButton"));

         // Click on the update button
         updateButton.click();

         // Get the title of the current page
         String pageTitle = driver.getTitle();

         // Print the title to the console
         System.out.println("Page Title: " + pageTitle);

      // Quit the entire browser session
         driver.quit();

}
	
}
