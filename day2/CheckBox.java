package week2.day2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

         public class CheckBox{
	     public static void main(String[] args)  {
        
         // Initialize WebDriver
         WebDriver driver = new ChromeDriver();

        // Load the URL
        driver.get("https://leafground.com/checkbox.xhtml");

        // Maximize the browser window
        driver.manage().window().maximize();

        // Add an implicit wait to ensure the web page elements are fully loaded
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        
        // Locate the 'Basic Checkbox' by its input ID
        WebElement basicCheckbox = driver.findElement(By.id("j_idt87:j_idt89_input"));

        // Click the checkbox (the div associated with it) if it's not already selected
        if (!basicCheckbox.isSelected()) {
            WebElement clickableDiv = driver.findElement(By.cssSelector("div.ui-chkbox-box"));
            clickableDiv.click();
            System.out.println("Basic Checkbox clicked successfully.");
        } else {
            System.out.println("Basic Checkbox was already selected.");
        }
        
        // Locate the 'Notification Checkbox' input element by its ID
        WebElement notificationCheckbox = driver.findElement(By.id("j_idt87:j_idt91_input"));

        // Click the checkbox (the div associated with it) if it's not already selected
        if (!notificationCheckbox.isSelected()) {
            WebElement notificationDiv = driver.findElement(By.cssSelector("div#j_idt87\\:j_idt91 div.ui-chkbox-box"));
            notificationDiv.click();
            System.out.println("Notification Checkbox clicked successfully.");
        } else {
            System.out.println("Notification Checkbox was already selected.");
        }
        
        // Locate the 'Python' label element by its text and click its corresponding checkbox
        WebElement pythonLabel = driver.findElement(By.xpath("//label[text()='Python']"));
        WebElement checkboxDiv = pythonLabel.findElement(By.xpath("preceding-sibling::div"));
        checkboxDiv.click();

        System.out.println("Python Checkbox clicked successfully.");
        
    
        
     // Click on the "Toggle Switch"
        WebElement toggleSwitch = driver.findElement(By.xpath("//div[contains(@class, 'ui-toggleswitch-slider')]"));
        toggleSwitch.click();
        
        // Verify that the expected message is displayed
        WebElement toggleMessage = driver.findElement(By.xpath("//span[contains(text(), 'Checked')]"));
        if (toggleMessage.isDisplayed()) {
            System.out.println("Toggle switch message is displayed as expected.");
        } else {
            System.out.println("Toggle switch message is not displayed.");
        }
        
        // Verify if the Checkbox is disabled
        WebElement disabledCheckbox = driver.findElement(By.xpath("//input[@disabled]"));
        if (!disabledCheckbox.isEnabled()) {
            System.out.println("The checkbox is disabled.");
        } else {
            System.out.println("The checkbox is enabled.");
        }
        
        // Locate the div element for the Tri-State Checkbox
        WebElement triStateCheckboxDiv = driver.findElement(By.xpath("//div[@id='j_idt87:ajaxTriState']//div[contains(@class, 'ui-chkbox-box')]"));

        // Click the checkbox
        triStateCheckboxDiv.click();
//
//        // Verify the tri-state checkbox current value
//        WebElement triStateInput = driver.findElement(By.id("j_idt87:ajaxTriState_input"));
//        String triStateValue = triStateInput.getAttribute("value");

//        if (triStateValue.equals("0")) {
//            System.out.println("Tri-State Checkbox is in unchecked state.");
//        } else if (triStateValue.equals("1")) {
//            System.out.println("Tri-State Checkbox is in checked state.");
//        } else if (triStateValue.equals("2")) {
//            System.out.println("Tri-State Checkbox is in indeterminate state.");
//        } else {
//            System.out.println("Unexpected state.");
//        }

        // Close the web browser
         driver.close();
	     }
         }
         

	     
 