package Day1.Vegetables;

import java.util.Scanner;

public class Vegetables {

    public static void main(String[] args) {
        VegetablesHelper veg = new VegetablesHelper();
        int maxWeight =  100;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of fruit: ");
        String fruit = sc.nextLine();

        System.out.println("Enter the weight of fruit: ");
        int weight = sc.nextInt();
        int difference = maxWeight - weight;


        switch (fruit) {
            case "apple":
                veg.weightChecker(weight, "apple", difference);
                break;
            case "banana":
                    veg.weightChecker(weight, "banana", difference);
                break;
            default:
                System.out.println("We do not recognize this fruit :(");
        }
    }
}


