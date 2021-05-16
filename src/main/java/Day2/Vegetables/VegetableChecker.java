package Day2.Vegetables;

import java.util.ArrayList;
import java.util.List;

public class VegetableChecker {

    public static void main(String[] args) {
        Banana banana = new Banana(25, 100, 2);
        Apple apple = new Apple(100, 25, 1);

        List<Fruit> listOfFruit = new ArrayList<>();
        listOfFruit.add(banana);
        listOfFruit.add(apple);

        System.out.println(listOfFruit);
    }
}
