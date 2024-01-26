
import java.util.Scanner;

public class OddEvenSumCalculator
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int size = scanner.nextInt();

        int integers[] = new int[size];
        System.out.println(" ");

        for (int i = 0; i < size; i++)
        {
            System.out.print("Input value " + (i + 1) + ": ");
            integers[i] = scanner.nextInt();
        }

        int evenSum = 0;
        int oddSum = 0;

        for (int i = 0; i < size; i++)
        {
            if (integers[i] % 2 == 0 && integers[i] > 0)
                evenSum += integers[i];
            else if (!(integers[i] % 2 == 0) && integers[i] > 0)
                oddSum += integers[i];
        }

        System.out.println("\nSummation of Odd numbers: " + oddSum);
        System.out.println("Summation of Even numbers: " + evenSum);
    }
}
