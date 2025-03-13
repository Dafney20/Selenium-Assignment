package week2.day1;


	public class Browser {

	    // Method to launch the browser with a name as an argument
	    public String launchBrowser(String browserName) {
	        System.out.println("Browser launched successfully");
	        return browserName;  // Returning the browser name
	    }

	    // Method to load the URL
	    public void loadUrl() {
	        System.out.println("Application url loaded successfully");
	    }

	    // Main method to create an object and call the methods
	    public static void main(String[] args) {
	        Browser browser = new Browser();  // Creating an object of the Browser class
	        String browserName = browser.launchBrowser("Chrome");  // Launching the browser
	        System.out.println("Launched Browser: " + browserName);  // Displaying the browser name
	        browser.loadUrl();  // Loading the URL
	    }
	}
