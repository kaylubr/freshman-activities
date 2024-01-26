
import java.util.Scanner;

public class LoanCalculator {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Amount to be borrowed: ");
		int borrowed = scan.nextInt();
		System.out.print("Number of Months: ");
		int months = scan.nextInt();

		double monthly = 0.00;

		if(months >= 1 && months <= 4) {
			monthly = (borrowed + (borrowed * 0.025 * months)) / months;
		}else if(months >= 5 && months <= 8) {
			monthly = (borrowed + (borrowed * 0.03 * months)) / months;
		}else if (months >= 9 && months <= 12) {
			monthly = (borrowed + (borrowed * 0.035 * months)) / months;
		}else {
			System.out.println("Invalid number of months.");
		}

		double profit = monthly * months - borrowed;

		System.out.println("Your monthly payment is: " + monthly);
		System.out.println("Profit: " + profit);

	}
}
