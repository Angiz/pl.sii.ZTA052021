package Day2.Patterns;

public class Audi implements Car{
    int price;
    int velocity;
    String color;


    @Override
    public int maxVelocity() {
        return 1000;
    }
}
