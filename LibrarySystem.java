package puzalanreyesfinals;// Import necessary Java libraries

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Made by:
 * Reyes, Kyle Benedict L.
 * Punzalan, Bren Carl L.
 */

// Define the main class for our Library Management System
public class LibrarySystem{
    // ArrayLists to keep track of book details
    private static ArrayList<String> bookTitles = new ArrayList<>();
    private static ArrayList<String> bookAuthors = new ArrayList<>();
    private static ArrayList<Integer> publicationYears = new ArrayList<>();
    private static ArrayList<String> genres = new ArrayList<>();
    private static ArrayList<Boolean> isAvailable = new ArrayList<>();

    // Scanner to get input from users
    private static Scanner scanner = new Scanner(System.in);

    // The main method where our program starts
    public static void main(String[] args) {
        int choice;

        // Display the user menu and keep interacting until they choose to exit
        do {
            System.out.println("\nWelcome to the Library Management System:");
            System.out.println("1. Add a New Book");
            System.out.println("2. Display All Books");
            System.out.println("3. Search for a Book");
            System.out.println("4. Exit");
            System.out.print("\nEnter your choice: ");

            // Get the user's choice
            choice = scanner.nextInt();
            scanner.nextLine();  // Consume the newline character

            // Perform actions based on the user's choice
            switch (choice) {
                case 1:
                    addBook();
                    break;
                case 2:
                    displayAllBooks();
                    break;
                case 3:
                    searchForBook();
                    break;
                case 4:
                    System.out.println("Exiting the Library Management System. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 4);
    }

    // Method to add a new book to the library
    private static void addBook() {
        System.out.println("===============================");
        System.out.print("Enter the Book Title: ");
        String title = scanner.nextLine();

        System.out.print("Enter the Author's Name: ");
        String author = scanner.nextLine();

        System.out.print("Enter the Publication Year: ");
        int year = scanner.nextInt();

        scanner.nextLine();  // Consume the newline character

        System.out.print("Enter the Genre: ");
        String genre = scanner.nextLine();

        // Add book details to our lists
        bookTitles.add(title);
        bookAuthors.add(author);
        publicationYears.add(year);
        genres.add(genre);
        isAvailable.add(true);

        System.out.println("Book added successfully!");
        System.out.println("===============================");
    }

    // Method to display all books in the library
    private static void displayAllBooks() {
        System.out.println("===============================");
        System.out.println("<<<< List of All Books >>>>");

        // Iterate through the lists and display book details
        for (int i = 0; i < bookTitles.size(); i++) {
            System.out.println("Title: " + bookTitles.get(i));
            System.out.println("Author: " + bookAuthors.get(i));
            System.out.println("Publication Year: " + publicationYears.get(i));
            System.out.println("Genre: " + genres.get(i));
            System.out.println("Availability: " + (isAvailable.get(i) ? "Available" : "Not Available"));
            System.out.println();
            System.out.println("===============================");
        }
    }

    // Method to search for a book in the library
    private static void searchForBook() {
        System.out.println("===============================");
        System.out.print("Enter the Book Title to search: ");
        String searchTitle = scanner.nextLine();

        boolean found = false;

        // Iterate through the lists to search for the specified book title
        for (int i = 0; i < bookTitles.size(); i++) {
            System.out.println("===============================");
            if (searchTitle.equalsIgnoreCase(bookTitles.get(i))) {
                System.out.println("<<<< Book found >>>>");
                System.out.println("Title: " + bookTitles.get(i));
                System.out.println("Author: " + bookAuthors.get(i));
                System.out.println("Publication Year: " + publicationYears.get(i));
                System.out.println("Genre: " + genres.get(i));
                System.out.println("Availability: " + (isAvailable.get(i) ? "Available" : "Not Available"));
                found = true;
                break;
            }
            System.out.println("===============================");
        }

        // Display a message if the book is not found
        if (!found) {
            System.out.println("Book not found.");
        }
    }
}
