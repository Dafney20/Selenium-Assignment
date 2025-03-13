package week6.assg;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.*;
import org.openqa.selenium.io.FileHandler;
import java.io.File;
import java.io.IOException;
public class BigBasket {

	public static void main(String[] args) throws IOException{
		
	        WebDriver driver = new ChromeDriver();

	        // Maximize browser and add implicit wait
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        
	        //Go to bigbasket page
	        driver.get("https://www.bigbasket.com/");
	        
	       //Click on shop by category 
	       WebElement category= driver.findElement(By.id("headlessui-menu-button-:R5bab6:"));
	       category.click();
	       
	       //Mouse hover the food grains ,oils
	       WebElement food = driver.findElement(By.linkText("Foodgrains, Oil & Masala")); 
	       
	       // Perform the hover action
	        Actions actions = new Actions(driver);
	        actions.moveToElement(food).perform();
	        
	       //Mouse hover on the Rice & Rice Products,
	        WebElement Rice=driver.findElement(By.linkText("Rice & Rice Products"));
	        
	        Actions actions1= new Actions(driver);
	        actions1.moveToElement(Rice).perform();
	        
	        // Click on "Boiled & Steam Rice"
	        WebElement Boiled = driver.findElement(By.linkText("Boiled & Steam Rice"));
	        Boiled.click();
	        
	        //Filter the bb royal
	        WebElement royal=driver.findElement(By.id("i-BBRoyal"));
	        royal.click();
	}

}
