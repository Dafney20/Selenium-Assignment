package week2.day2;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount2 {
	public static void main(String[] args) {
        // Initialize WebDriver
        ChromeDriver driver = new ChromeDriver();
        
        // Load the URL and maximize window
        driver.get("http://leaftaps.com/opentaps/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        
        // Enter username and password, and click login
        driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
        driver.findElement(By.id("password")).sendKeys("crmsfa");
        driver.findElement(By.className("decorativeSubmit")).click();
        
        // Click on CRM/SFA link
        driver.findElement(By.linkText("CRM/SFA")).click();
        
        // Click on Accounts tab
        driver.findElement(By.linkText("Accounts")).click();
        
        // Click on Create Account
        driver.findElement(By.linkText("Create Account")).click();
        
        // Enter account name
        driver.findElement(By.id("accountName")).sendKeys("Dafney Jervis");
        
        // Enter description
        driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester.");
        
        // Select industry as "ComputerSoftware"
        WebElement industryDropdown = driver.findElement(By.name("industryEnumId"));
        Select selectIndustry = new Select(industryDropdown);
        selectIndustry.selectByVisibleText("Computer Software");
        
        // Select ownership as "S-Corporation"
        WebElement ownershipDropdown = driver.findElement(By.name("ownershipEnumId"));
        Select selectOwnership = new Select(ownershipDropdown);
        selectOwnership.selectByVisibleText("S-Corporation");
        
       
        // Select "Employee" as the source using SelectByValue
        WebElement sourceDropdown = driver.findElement(By.name("dataSourceId"));
        Select selectSource = new Select(sourceDropdown);
        selectSource.selectByValue("LEAD_EMPLOYEE");
        
       // Select "eCommerce Site Internal Campaign" as the marketing campaign using SelectByIndex
        WebElement marketingCampaignDropdown = driver.findElement(By.name("marketingCampaignId"));
        Select selectMarketingCampaign = new Select(marketingCampaignDropdown);
        selectMarketingCampaign.selectByIndex(6); 
        
       // Select "Texas" as the state/province using SelectByValue
        WebElement stateProvinceDropdown = driver.findElement(By.name("generalStateProvinceGeoId"));
        Select selectStateProvince = new Select(stateProvinceDropdown);
        selectStateProvince.selectByValue("TX"); 

       // Click the "Create Account" button
        WebElement createButton = driver.findElement(By.className("smallSubmit"));
        createButton.click();
        
       // Verify that the account name partially matches "Dafney Jervis"
        WebElement accountNameText = driver.findElement(By.id("ext-gen1190"));
        String displayedAccountName = accountNameText.getText();

        //Quit the browser
        driver.close();
        
        
       
}
	
}
