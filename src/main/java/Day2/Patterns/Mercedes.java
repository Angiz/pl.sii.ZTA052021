package Day2.Patterns;

public class Mercedes implements Car {

    int price;
    int velocity;
    String color;

    @Override
    public int maxVelocity() {
        return 103;
    }
}
