package week2.day2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;

public class RadioButton {
	public static void main(String[] args) {
        // Set up the WebDriver and initialize ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Launch the browser and load the URL
        driver.get("https://www.leafground.com/radio.xhtml");

        // Maximize the browser window
        driver.manage().window().maximize();

        // Set implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //Favorite browser
        WebElement chromeLabel = driver.findElement(By.xpath("//label[@for='j_idt87:console1:0']"));
        chromeLabel.click();
        System.out.println("Chrome is my favorite browser");
        
        WebElement radioButtonInput = driver.findElement(By.id("j_idt87:console1:0"));
        if (radioButtonInput.isSelected()) {
            System.out.println("Radio button 'Chrome' is selected.");
        }
       
        // Verify if the Safari radio button is selected by default
        WebElement safariRadioButton = driver.findElement(By.xpath("//input[@id='j_idt87:console2:2' and @checked]"));
        if (safariRadioButton.isSelected()) {
            System.out.println("The 'Safari' radio button is selected by default.");
        } else {
            System.out.println("The 'Safari' radio button is NOT selected by default.");
        }

        // Verify if the 21-40 Years radio button is selected by default
        WebElement ageRadioButton = driver.findElement(By.xpath("//input[@id='j_idt87:age:1' and @checked]"));
        if (ageRadioButton.isSelected()) {
            System.out.println("The '21-40 Years' radio button is selected by default.");
        } else {
            System.out.println("The '21-40 Years' radio button is NOT selected by default.");
        }
        
        driver.quit();
        
}
}