package Day1.Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Odd {

    public static void main(String[] args) {

        System.out.print("Enter a number to get more information: ");
        Scanner sc = new Scanner(System.in);
        try {
            int number = sc.nextInt();

            if (number%2==0) {
                System.out.println("Even number");
            }
            else {
                System.out.println("Odd number");
            }
        }
        catch (InputMismatchException e) {
            System.out.println("Expected number and different type provided");
        }

    }
}
