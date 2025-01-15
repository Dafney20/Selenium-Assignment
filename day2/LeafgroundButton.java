package week2.day2;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafgroundButton {
    public static void main(String[] args) {
        // Initialize the ChromeDriver
        ChromeDriver driver = new ChromeDriver();
        
        // Load the URL and maximize the browser window
        driver.get("https://leafground.com/button.xhtml");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        //Click the button of the title
        WebElement clickButton = driver.findElement(By.xpath("//span[text()='Click']"));
        clickButton.click();
        
        //Get the title of the current page
        String pageTitle = driver.getTitle();

        // Check if the title is "Dashboard"
        if (pageTitle.equals("Dashboard")) {
            System.out.println("Title is verified: " + pageTitle);
        } else {
            System.out.println("Title verification failed. Actual title is: " + pageTitle);
        }

     // Navigate back to the previous page
        driver.navigate().back();
 
     // Check if the button is disabled
        WebElement disabledButton = driver.findElement(By.id("j_idt88:j_idt92"));
        boolean isDisabled = !disabledButton.isEnabled();
        System.out.println("Is the button disabled? " + isDisabled);
        
      // Find and print the position of the button with the text ‘Submit.’ 
        WebElement submitButton = driver.findElement(By.xpath("//span[text()='Submit']/parent::button"));
        submitButton.click();
        System.out.println("Clicked on the 'Submit' button for the find and print.");

      //Find and print the background color of the button with the text ‘Find the Save button color.’ 
        WebElement saveButton = driver.findElement(By.xpath("//span[text()='Save']/parent::button"));
        saveButton.click();
        System.out.println("Clicked on the 'Save' button for the Find the save button .");
        
      //'Height and width of this button.’ 
        
       WebElement widthButton = driver.findElement(By.xpath("//span[@class='ui-button-text ui-c' and text()='Submit']"));

      //Click the Submit button
        widthButton.click();
        System.out.println("Clicked the submit button for Heighht and width");
    
       driver.quit();
}
}
