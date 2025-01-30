package week5.assg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class AlertInteractionAutomation {
    public static void main(String[] args) {
        
        // Initialize the ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Maximize the browser window
        driver.manage().window().maximize();

        // Load the URL
        driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");

        
        // Switch to the iframe where the "Try It" button is located
        driver.switchTo().frame("iframeResult");

        //Find the "Try it" button by its text and click it
        WebElement tryItButton = driver.findElement(By.xpath("//button[text()='Try it']"));
        tryItButton.click();
        System.out.println("Try it Button has been clicked");

       
     // Switch to the alert and accept it (click "OK")
        Alert alert = driver.switchTo().alert();  // Switch to the alert box
        alert.accept(); // Click "OK" on the alert box

        // After clicking OK, verify the result
        WebElement resultText = driver.findElement(By.id("demo"));
        String result = resultText.getText();

        // Print confirmation if the result is as expected
        if (result.equals("Hello Harry Potter! How are you today?")) {
            System.out.println("Alert accepted. The action was verified as OK.");
        } else {
            System.out.println("Action failed: Unexpected message.");
        }

        // Close the browser
        driver.quit();
    }
}
    
        
    

