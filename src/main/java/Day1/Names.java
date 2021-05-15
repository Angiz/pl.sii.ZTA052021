package Day1;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Names {
    public static void main(String[] args) {
        System.out.println("What's your name?");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        switch(name) {
            case "Aneta":
                System.out.println("Hi Aneta ");
                break;
            case "Kasia":
                System.out.println("Hi Kasia");
                break;
            default:
                System.out.println("Sorry, I don't know you :(");
        }
    }


}
