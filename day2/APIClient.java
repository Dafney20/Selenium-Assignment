package week3.day2;

public class APIClient {

    // Method 1:Overloaded sendRequest method with one argument
    public void sendRequest(String endpoint) {
        System.out.println("Sending request to endpoint: " + endpoint);
    }

    //Method 2:Overloaded sendRequest method with three arguments
    public void sendRequest(String endpoint, String requestBody, boolean requestStatus) {
        System.out.println("Sending request to endpoint: " + endpoint);
        System.out.println("Request body: " + requestBody);
        if (requestStatus) {
            System.out.println("Request was successful.");
        } else {
            System.out.println("Request failed.");
        }
    }

    //Main method to demonstrate the usage of overloaded methods
    public static void main(String[] args) {
        //Create an object of APIClient
        APIClient apiClient = new APIClient();

    //Call the first version of sendRequest
        apiClient.sendRequest("https://example.com/api/data");

     //Call the second version of sendRequest
        apiClient.sendRequest("https://example.com/api/data", "{ \"name\": \"Dafney Jervis\" }", true);
    }
} 

