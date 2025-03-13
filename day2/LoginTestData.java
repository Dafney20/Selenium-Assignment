package week3.day2;

//Subclass inheriting from TestData
public class LoginTestData extends TestData {
 // Method to enter username
 public void enterUsername() {
     System.out.println("Username entered.");
 }

 // Method to enter password
 public void enterPassword() {
     System.out.println("Password entered.");
 }

// Main method to demonstrate functionality
 public static void main(String[] args) {
     // Create an object of the superclass TestData
     TestData testData = new TestData();
     testData.enterCredentials();
     testData.navigateToHomePage();

     // Create an object of the subclass LoginTestData
     LoginTestData loginTestData = new LoginTestData();
     loginTestData.enterUsername();
     loginTestData.enterPassword();

     // Access superclass methods from subclass object
     loginTestData.enterCredentials();
     loginTestData.navigateToHomePage();
 }
}
