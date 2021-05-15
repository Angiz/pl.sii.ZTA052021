package Day1.GeneralExercises;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise2 {

    public static void main(String[] args) {
        //System.out.print("Try to guess my number: ");
        Scanner sc = new Scanner(System.in);
        int desiredNumber = 0;
        int userNumber = 0;
        int sum = 0;

        do {
            System.out.print("Enter a number!");
            userNumber = sc.nextInt();
            sum +=userNumber;
        }
        while(userNumber !=desiredNumber);

        System.out.println(sum);
    }

}
