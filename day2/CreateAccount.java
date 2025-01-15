package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class CreateAccount {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		 // Enter username using XPath
        WebElement username = driver.findElement(By.xpath("//input[@id='username']"));
        username.sendKeys("demosalesmanager");

        // Enter password using XPath
        WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
        password.sendKeys("crmsfa");

        // Click the "Login" button using XPath
        WebElement loginButton = driver.findElement(By.xpath("//input[@class='decorativeSubmit']"));
        loginButton.click();
        
        // Click on the "CRM/SFA" link using XPath
        WebElement crmSfaLink = driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]"));
        crmSfaLink.click();

        // Click on the "Accounts" tab using XPath
        WebElement accountsTab = driver.findElement(By.xpath("//a[text()='Accounts']"));
        accountsTab.click();
        
        // Click on the "Create Account" button using XPath
        WebElement createAccountButton = driver.findElement(By.xpath("//a[text()='Create Account']"));
        createAccountButton.click();

        // Enter an account name using XPath
        WebElement accountName = driver.findElement(By.xpath("//input[@id='accountName']"));
        accountName.sendKeys("Dafney Jervis");

        // Enter a description using XPath
        WebElement description = driver.findElement(By.xpath("//textarea[@name='description']"));
        description.sendKeys("Selenium Automation Tester.");

        // Enter the number of employees using XPath
        WebElement numberOfEmployees = driver.findElement(By.xpath("//input[@id='groupNameLocal']"));
        numberOfEmployees.sendKeys("20");

        // Enter the site name using XPath
        WebElement siteName = driver.findElement(By.xpath("//input[@id='officeSiteName']"));
        siteName.sendKeys("LeafTaps");

        //Create Account
        WebElement createAccountSubmit = driver.findElement(By.xpath("//input[@class='smallSubmit']"));
        createAccountSubmit.click();
       
        //Close the browser
        driver.quit();
        
     }
}