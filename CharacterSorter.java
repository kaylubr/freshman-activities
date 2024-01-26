import java.util.Scanner;

public class CharacterSorter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=========================MENU=========================");
        System.out.println("1. Sorting number");
        System.out.println("2. Vowel, Consonant, Number and Special Character detetector");
        System.out.println("3. E X I T");
        System.out.println("=========================MENU=========================");

        int choice = 0;

        //loop for continous selection until exited.
        while(choice != 3){
            System.out.print("Enter your choice:... ");
            choice = scanner.nextInt();

            switch(choice){
                case 1:
                    System.out.print("Enter four numbers: ");
                    int num1 = scanner.nextInt();
                    int num2 = scanner.nextInt();
                    int num3 = scanner.nextInt();
                    int num4 = scanner.nextInt();

                    //choice of picking ascending or descending
                    System.out.println("What do you want to do?");
                    System.out.println("\t1. Ascending order: ");
                    System.out.println("\t2. Descending order: ");

                    System.out.print("Choice:... ");
                    int choice2 = scanner.nextInt();

                    System.out.println("\nUnsorted numbers: " + num1 +" "+ num2 +" "+ num3 +" "+ num4);

                    if(!(choice2 == 1)){
                        int temp;
                        //loops for finding arranging descending
                        for (int count = 0; count < 4; count++){
                            if ( num2 < num1)
                            {
                                temp = num1;
                                num1 = num2;
                                num2 = temp;
                            }

                            if ( num3 < num2)
                            {
                                temp = num2;
                                num2 = num3;
                                num3 = temp;
                            }

                            if ( num4 < num3)
                            {
                                temp = num3;
                                num3 = num4;
                                num4 = temp;
                            }

                        }
                        System.out.println("Descending order: " +num4 + " " + num3 + " " + num2 + " " + num1);
                    }
                    else if(choice2 < 2){
                        int temp;
                        //loops for finding arranging ascending
                        for (int count = 0; count < 4; count++){
                            if ( num2 < num1)
                            {
                                temp = num1;
                                num1 = num2;
                                num2 = temp;
                            }

                            if ( num3 < num2)
                            {
                                temp = num2;
                                num2 = num3;
                                num3 = temp;
                            }

                            if ( num4 < num3)
                            {
                                temp = num3;
                                num3 = num4;
                                num4 = temp;
                            }

                        }
                        System.out.println("Ascending order: " + num1 + " " + num2 + " " + num3 + " " + num4);
                    }
                    else{
                        System.out.println("Invalid choice");
                    }
                    break;
                case 2:
                    System.out.print(" \nEnter one character: ");
                    char ch = scanner.next().toLowerCase().charAt(0);

                    if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'  ){
                        System.out.println("\tEntered character " + ch + " is a vowel.");
                    }else if(ch >= 'a' && ch <= 'z'){
                        System.out.println("\tEntered character " + ch + " is a consonant.");
                    }else if(ch >= '0' && ch <= '9'){
                        System.out.println("\tEntered character " + ch + " is a number.");
                    }else{
                        System.out.println("\tEntered character " + ch + " is a special sharacter.");
                    }
                    break;

                case 3:
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        }

    }
}
