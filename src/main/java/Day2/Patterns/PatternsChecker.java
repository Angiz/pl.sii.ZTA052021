package Day2.Patterns;

public class PatternsChecker {

    public static void main(String[] args) {
        Car first = CarFactory.getCar("BMW");
        System.out.println(first.getClass().toString());
    }
}
