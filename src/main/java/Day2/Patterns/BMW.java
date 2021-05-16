package Day2.Patterns;

public class BMW implements Car{

    int price;
    int velocity;
    String color;

    @Override
    public int maxVelocity() {
        return 203;
    }
}
