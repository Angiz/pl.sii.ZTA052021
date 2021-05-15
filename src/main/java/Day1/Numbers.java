package Day1;

import java.util.Scanner;

public class Numbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1st number: ");
        int number1 = sc.nextInt();
        System.out.println("2nd number: ");
        int number2 = sc.nextInt();

        if (number1>number2) {
            System.out.println("1st number is greater than 2nd number");
        }
        else if (number1<number2) {
            System.out.println("1st number is lower than 2nd number");
        }
        else{
            System.out.println("Both numbers are equal");
        }

    }
}
