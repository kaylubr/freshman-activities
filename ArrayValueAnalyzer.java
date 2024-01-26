import java.util.Scanner;

public class ArrayValueAnalyzer {
        public static void main(String[] args)
        {
            Scanner scanner = new Scanner(System.in);
            int size = 0;
            boolean arraySet = false;
            int[] nums = new int[0];

            // Infinite loop for the menu
            while (true)
            {
                System.out.println("\n=================Menu=================");
                System.out.println("1. Input values to the array");
                System.out.println("2. Find the lowest value");
                System.out.println("3. Find the highest value");
                System.out.println("4. Exit");
                System.out.println("======================================");
                System.out.print("Enter your choice: ");
                int choice = scanner.nextInt();
                scanner.nextLine();  // Consume the newline character

                int lowest;
                int highest;

                switch (choice)
                {
                    case 1:
                        // Input values to the array
                        System.out.print("Enter size of the array: ");
                        size = scanner.nextInt();

                        nums = new int[size];

                        System.out.println("Enter the elements of the array:");
                        for (int i = 0; i < nums.length; i++)
                        {
                            System.out.print("Element " + (i + 1) + ": ");
                            nums[i] = scanner.nextInt();
                        }
                        break;

                    case 2:
                        // Find the lowest value
                        for (int i = 0; i < nums.length; i++)
                        {
                            if (nums[i] != 0)
                            {
                                arraySet = true;
                            }
                        }

                        if (arraySet)
                        {
                            lowest = nums[0];
                            for (int i = 0; i < nums.length; i++)
                            {
                                if (nums[i] < lowest) lowest = nums[i];
                            }
                            System.out.println("The lowest value in the array is: " + lowest);
                        }
                        else
                            System.out.println("Array size is not set. Please select option 1 first.");
                        break;

                    case 3:
                        // Find the highest value
                        for (int i = 0; i < nums.length; i++)
                        {
                            if (nums[i] != 0)
                            {
                                arraySet = true;
                            }
                        }

                        if (arraySet)
                        {
                            highest = nums[0];

                            for (int i = 0; i < nums.length; i++)
                            {
                                if (nums[i] > highest) highest = nums[i];
                            }
                            System.out.println("The highest value in the array is: " + highest);
                        }
                        else
                            System.out.println("Array size is not set. Please select option 1 first.");
                        break;

                    case 4:
                        // Exit the program
                        System.out.println("Exiting the program.");
                        System.exit(0);

                    default:
                        // Invalid choice
                        System.out.println("\nInvalid choice, try again");
                }
            }
        }
}
