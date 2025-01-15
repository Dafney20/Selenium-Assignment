package week2.day2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;


public class FacebookRegistration {
	 public static void main(String[] args)  {
	        

	        // Initialize WebDriver
	        WebDriver driver = new ChromeDriver();

	        // Load the Facebook URL
	        driver.get("https://en-gb.facebook.com/");

	        // Maximize the browser window
	        driver.manage().window().maximize();

	        // Add an implicit wait to ensure the web page elements are fully loaded
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        
	        // Step 1: Click on the "Create new account" button
	        WebElement createAccountButton = driver.findElement(By.linkText("Create new account"));
	        createAccountButton.click();
	        
	        WebElement firstNameField = wait.until(
	                ExpectedConditions.visibilityOfElementLocated(By.name("firstname")));
	        firstNameField.sendKeys("Dafney");

	        // Wait for the "Surname" input field to be visible and enter the value
	        WebElement surnameField = wait.until(
	                ExpectedConditions.visibilityOfElementLocated(By.name("lastname")));
	        surnameField.sendKeys("Jervis");
	        
	        //Enter mob no or mail-id
	        WebElement mobileNumberField = wait.until(
	                ExpectedConditions.visibilityOfElementLocated(By.name("reg_email__"))
	        );
	        mobileNumberField.sendKeys("9876543210");
	        
	        //Enter new password
	        
	     
	        WebElement passwordField = wait.until(
	                ExpectedConditions.visibilityOfElementLocated(By.name("reg_passwd__"))
	        );
	        passwordField.sendKeys("daf20");
            
	        
	        // Handle the Day dropdown (select "20")
	        WebElement dayDropdown = wait.until(
	                ExpectedConditions.visibilityOfElementLocated(By.name("birthday_day"))
	        );
	        Select daySelect = new Select(dayDropdown);
	        daySelect.selectByVisibleText("20");

	        // Handle the Month dropdown (select "December")
	        WebElement monthDropdown = wait.until(
	                ExpectedConditions.visibilityOfElementLocated(By.name("birthday_month"))
	        );
	        Select monthSelect = new Select(monthDropdown);
	        monthSelect.selectByVisibleText("Dec");

	        // Handle the Year dropdown (select "2001")
	        WebElement yearDropdown = wait.until(
	                ExpectedConditions.visibilityOfElementLocated(By.name("birthday_year"))
	        );
	        Select yearSelect = new Select(yearDropdown);
	        yearSelect.selectByVisibleText("2001");
	        
	        //Gender select
	        WebElement femaleRadioButton = wait.until(
	                ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='sex' and @value='1']"))
	        );
	        femaleRadioButton.click();

	        driver.quit();
} 
}