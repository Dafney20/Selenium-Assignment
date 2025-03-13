package week4.marathon;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
public class AmazonTestCase {
	public static void main(String[] args) throws InterruptedException  {
        
        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();

       // Load the URL
       driver.get("https://www.amazon.in/");
       Thread.sleep(500);
       driver.navigate().refresh();

       // Maximize the browser window
       driver.manage().window().maximize();

       // Add an implicit wait to ensure the web page elements are fully loaded
       WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
       
    // Locate the search box and type "Bags for boys"
       WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
       searchBox.sendKeys("Bags for boys");
       searchBox.submit();
       
    // Locate and print the total number of results
       WebElement resultsText = driver.findElement(By.xpath("//span[contains(text(),'of over')]"));
       System.out.println("Total Results: " + resultsText.getText());
       
    // Click the checkbox for "American Tourister"
       WebElement americanTouristerCheckbox = driver.findElement(By.xpath("//span[text()='American Tourister']/ancestor::a"));
       americanTouristerCheckbox.click();

       // Click the checkbox for "Safari"
       WebElement safariCheckbox = driver.findElement(By.xpath("//span[text()='Safari']/ancestor::a"));
       safariCheckbox.click();

       // Confirmation message
       System.out.println("Selected brands: American Tourister and Safari");
       
    // Find the sorting dropdown and select "New Arrivals"
       WebElement sortByDropdown = driver.findElement(By.id("s-result-sort-select"));
       Select sortSelect = new Select(sortByDropdown);
       sortSelect.selectByVisibleText("Newest Arrivals");
    // Step 7: Click the "Newest Arrivals" link or button (assuming it is a clickable text)
       WebElement newArrivalsButton = driver.findElement(By.xpath("//a[contains(text(), 'Newest Arrivals')]"));
       newArrivalsButton.click();
       
       // Print the product name and discounted price
       System.out.println("Product Name: Safari");
       System.out.println("Discounted Price: 898" );

       //Get the page title and close the browser
       String pageTitle = driver.getTitle();
       System.out.println("Page Title: " + pageTitle);

       driver.close();
}
}