package Day1.GeneralExercises;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        try{
            System.out.print("Provide size of an array: ");
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int [] table = new int[n];

            for (int i=0; i<n; i++) {
                table[i]=i+1;
            }
            for (int i: table) {
                System.out.print(i+", ");
            }
        } catch(InputMismatchException e) {
            System.out.println("Expected int and different type provided");
        } catch (NegativeArraySizeException e) {
            System.out.println("Array cannot have negative size!");
        }

    }
}
