package Day1;

import java.util.Scanner;

public class NamesInTable {

    public static void main(String[] args) {
        int length = 5;
        String[] names = new String[length];
        Scanner sc = new Scanner(System.in);

        for (int i=0; i<length; i++) {
            System.out.print("Enter a name: ");
            names[i] = sc.nextLine();
        }

        System.out.println("\n");
        for (int i=0; i<length; i++) {
            System.out.print("Welcome "+names[i]+"\n");

        }
    }
}
