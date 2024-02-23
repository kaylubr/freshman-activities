import java.util.ArrayList;
import java.util.Scanner;

/**MADE BY:

 REYES, KYLE BENEDICT L.
 PUNZALAN, BREN CARL L.

 **/
public class EmployeeSystem {
    private static ArrayList<String> employees = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            System.out.println("======== WELCOME TO EMPLOYEE SYSTEM ========");
            System.out.println("1. INSERT EMPLOYEE");
            System.out.println("2. MODIFY EMPLOYEE");
            System.out.println("3. DELETE EMPLOYEE");
            System.out.println("4. DISPLAY EMPLOYEES OR SEARCH AND DISPLAY EMPLOYEE");
            System.out.println("5. EXIT");
            System.out.println("============================================");

            System.out.print("Enter your command: ");
            int command = Integer.valueOf(scanner.nextLine());

            switch (command) {
                case 1:
                    insertEmployee();
                    break;

                case 2:
                    modify();
                    break;

                case 3:
                    remove();
                    break;

                case 4:
                    displayOrSearch();
                    break;

                case 5:
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice, Try again.");
            }
        }
    }

    // Method to insert an employee at a specified position
    static void insertEmployee() {
        System.out.print("Enter an employee name to add: ");
        String name = scanner.nextLine();

        System.out.println("\n1. Add at the beginning");
        System.out.println("2. Add at the end");
        System.out.println("3. Add at a specific index\n");

        System.out.print("Enter your choice: ");
        int choice = Integer.valueOf(scanner.nextLine());

        switch (choice) {
            case 1:
                add(name, 0); // Add at the beginning
                break;
            case 2:
                add(name, employees.size()); // Add at the end
                break;
            case 3:
                System.out.print("Enter the index to insert: ");
                int index = Integer.valueOf(scanner.nextLine());
                add(name, index); // Add at a specific index
                break;
            default:
                System.out.println("Invalid choice for insertion.");
        }
    }

    // Method to add an employee at a specific index
    static void add(String name, int index) {
        employees.add(index, name);
        System.out.println("Successfully added!");
    }

    // Method to modify an existing employee name
    static void modify() {
        boolean found = false;
        System.out.print("Enter a name to change: ");
        String nameToBeSearched = scanner.nextLine();

        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).equals(nameToBeSearched)) {
                System.out.println("\n"+ nameToBeSearched + " is found!");
                System.out.print("Enter a new name: ");
                String replacedName = scanner.nextLine();

                employees.set(i, replacedName);
                System.out.println("Successfully modified!");
                found = true;
            }
        }

        if (!found) {
            System.out.println("Name not found!");
        }
    }

    // Method to remove an employee from the list
    static void remove() {
        boolean found = false;
        System.out.print("Enter a name to delete: ");
        String nameToRemove = scanner.nextLine();

        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).equals(nameToRemove)) {
                employees.remove(nameToRemove);
                System.out.println("\n" + nameToRemove + " is successfully deleted from the list!");
                found = true;
            }
        }

        if (!found) {
            System.out.println("Name not found!");
        }
    }

    // Method to print all employees
    static void printAll() {
        System.out.println("\n" + employees + "\n");
    }

    // Method to search for and display a specific employee
    static void searchAndDisplay() {
        System.out.print("Enter a name to search and display: ");
        String nameToSearch = scanner.nextLine();

        boolean found = false;
        for (String employee : employees) {
            if (employee.equals(nameToSearch)) {
                System.out.println("\n" + nameToSearch + " is found in the list!");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Name not found in the list!");
        }
    }

    // Method to either display all employees or search and display a specific employee
    static void displayOrSearch() {
        System.out.println("\n1. Display all employees");
        System.out.println("2. Search and display employee\n");

        System.out.print("Enter your choice: ");
        int displayChoice = Integer.valueOf(scanner.nextLine());

        switch (displayChoice) {
            case 1:
                printAll();
                break;
            case 2:
                searchAndDisplay();
                break;
            default:
                System.out.println("Invalid choice for display.");
        }
    }
}
