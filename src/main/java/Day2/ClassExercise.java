package Day2;

import java.awt.*;

public class ClassExercise {
    public static void main(String[] args) {
        Car car = new Car(); //default constructor Car()
        car.riding();
        System.out.println(car.color);
    }

}

class Car {
    public Color color = new Color(255, 255, 255);

    public void riding() {
        System.out.println("Brum Brum");
    }
}