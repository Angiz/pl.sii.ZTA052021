package Day1;

import java.util.Scanner;

public class Boom {

    public static void main(String[] args) {
        System.out.println("When should I boom?");
        Scanner sc = new Scanner(System.in);
        int timeToBoom = sc.nextInt();
        int i;

        //for version
        System.out.println("For:\n");
        for(i = timeToBoom; i>0; i--) {
            System.out.println("Bomb will break out in "+i+ " seconds!");

        }
        System.out.println("Boom!");

        //while
        i=timeToBoom;
        System.out.println("While:\n");
        while (i>0) {
            System.out.println("Bomb will break out in "+i+ " seconds!");
            i--;
        }
        System.out.println("Boom!");

        //doWhile
        System.out.println("Do-while:\n");
        i=timeToBoom;
        do{
            System.out.println("Bomb will break out in "+i+ " seconds!");
            i--;
        }
        while(i>0);
        System.out.println("Boom!");

    }
}
