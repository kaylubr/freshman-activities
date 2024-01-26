
import java.util.Scanner;

public class NumberAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nums[] = new int[3];
        System.out.println("Input 3 values: ");
        for (int i = 0; i < 3; i++) {
            System.out.print("Value " + (i + 1) + ": ");
            nums[i] = scanner.nextInt();
        }

        int lowestResult = getLowest(nums[0], nums[1], nums[2]);
        int highestResult = getHighest(nums[0], nums[1], nums[2]);

        System.out.println("The highest value among " + nums[0] +" "+ nums[1] + " " + nums[2] + " is " + highestResult);
        System.out.println("The lowest value among " + + nums[0] +" "+ nums[1] + " " + nums[2] + " is " + lowestResult);
    }
    static int getLowest(int num1, int num2, int num3) {
        if (num1 < num2 && num1 < num3) {
            return num1;
        }

        if (num2 < num1 && num2 < num3) {
            return num2;
        }
        return num3;
    }

    static int getHighest(int num1, int num2, int num3) {
        if (num1 > num2 && num1 > num3) {
            return num1;
        }

        if (num2 > num1 && num2 > num3) {
            return num2;
        }
        return num3;
    }
}
