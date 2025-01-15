package week2.day2;

public class Library {
	// Method to add a book
     public String addBook(String bookTitle) {
        System.out.println("Book added successfully");
        return bookTitle;
    }

    // Method to issue a book
     public void issueBook() {
        System.out.println("Book issued successfully");
    }

    // Main method to create an object and call the methods
     public static void main(String[] args) {
        Library library = new Library();
        
        // Add a book and display its title
        String addedBook = library.addBook("Fairy Tales");
        System.out.println("Added Book Title: " + addedBook);

        // Issue a book
        library.issueBook();
}
}