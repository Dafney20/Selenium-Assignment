package week5.assg;

//Interface: DatabaseConnection
interface DatabaseConnection {
 void connect();           // Abstract method to connect to a database
 void disconnect();        // Abstract method to disconnect from a database
 void executeUpdate(String query); // Abstract method to execute an update query
}

//Concrete Class: JavaConnection
class JavaConnection implements DatabaseConnection {

 // Concrete implementation of the connect method
 @Override
 public void connect() {
     System.out.println("Connected to the database successfully!");
 }

 // Concrete implementation of the disconnect method
 @Override
 public void disconnect() {
     System.out.println("Disconnected from the database.");
 }

 // Concrete implementation of the executeUpdate method
 @Override
 public void executeUpdate(String query) {
     System.out.println("Executing query: " + query);
     System.out.println("Query executed successfully.");
 }
}

//Main Class: TestDatabaseConnection
public class TestDatabaseConnection {
 public static void main(String[] args) {
     // Create an instance of JavaConnection
     DatabaseConnection dbConnection = new JavaConnection();

     // Use the implemented methods
     dbConnection.connect();
     dbConnection.executeUpdate("UPDATE users SET status = 'active' WHERE user_id = 123");
     dbConnection.disconnect();
 }
}
