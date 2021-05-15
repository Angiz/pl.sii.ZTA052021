package Day1.GeneralExercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int userNumber = 0;

        while(true) {
            System.out.println("Enter a number");
            userNumber = sc.nextInt();
            if (list.contains(userNumber)) { //Checking before adding!
                break;
            }
            list.add(userNumber);
        }
        System.out.println(list);
    }


}
