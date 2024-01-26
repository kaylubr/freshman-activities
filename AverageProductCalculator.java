
import java.text.DecimalFormat;
import java.util.Scanner;

public class AverageProductCalculator {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		DecimalFormat format = new DecimalFormat("0.00");
		
		int num;
        char character = 'y';
        long product = 1;
        double sum = 0;
        int amount = 0;
        
        do {
            System.out.print("Please input a number: ");
            num = scanner.nextInt(); 

            sum += num;
            product *= num;
            amount++;

            System.out.print("Y to continue, Q to quit (y/q): ");
            character = scanner.next().charAt(0);

        } while (character == 'y' || character == 'Y'); 
        
        if (amount > 0) {
            double average = sum / amount;
            String formatted = format.format(average);
            System.out.println("===========================================");
            System.out.println("The Average of the numbers is: " + formatted);
            System.out.println("The Product of the numbers is: " + product);
            System.out.println("===========================================");
        } else {
            System.out.println("No input");
        }

	}
}
