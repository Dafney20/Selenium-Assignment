package week2.day1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Launch {
	public static void main(String[] args) {
	       ChromeDriver driver = new ChromeDriver();
	       driver.get("https://www.facebook.com/");
	       driver.manage().window().maximize();
	       driver.close();
	    }
	}


