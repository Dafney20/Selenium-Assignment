package week2.day2;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class CreateLead {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/.");
		driver.manage().window().maximize();

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
       
       //Click on leads tab
       driver.findElement(By.linkText("Leads")).click();

       // Click on Create Lead button
       driver.findElement(By.linkText("Create Lead")).click();

       // Enter FirstName, LastName, and CompanyName
       driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Dafney");
       driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Jervis");
       driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
       
       driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
       driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Openai");

       // Click on Create Lead button
       driver.findElement(By.className("smallSubmit")).click();

       // Verify the title on the resulting page
       WebElement leadTitle = driver.findElement(By.id("viewLead_generalProfTitle_sp"));
       String displayedTitle = leadTitle.getText();
       
       if (displayedTitle.equals("Openai")) {
           System.out.println("Lead created with the correct title: " + displayedTitle);
       } else {
           System.out.println("Lead creation failed. Title displayed: " + displayedTitle);
       }

       // Close the browser
       driver.close();
}
}
