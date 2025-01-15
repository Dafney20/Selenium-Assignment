package week2.day2;

public class LibraryManagement {
	public static void main(String[] args) {
        // Create an object of Library class
        Library library = new Library();

        // Call both methods from Library
        String bookTitle = library.addBook("Cinderella");
        System.out.println("Added Book Title in LibraryManagement: " + bookTitle);
        
        library.issueBook();
}
}