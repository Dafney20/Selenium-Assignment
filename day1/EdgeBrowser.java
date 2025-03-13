package week2.day1;

public class EdgeBrowser {

    // Main method to create an object of Browser class and call its methods
    public static void main(String[] args) {
        Browser browser = new Browser();  // Creating an object of the Browser class
        String browserName = browser.launchBrowser("Edge");  // Launching Edge browser
        System.out.println("Launched Browser: " + browserName);  // Displaying the browser name
        browser.loadUrl();  // Loading the URL
    }
}

