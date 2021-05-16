package Day2.Patterns;

public class CarFactory {

    public static Car getCar(String name) {
        Car car;

        switch (name) {
            case "Audi":
                car = new Audi();
                break;
            case "BMW":
                car = new BMW();
                break;
            default:
                car = new Mercedes();
                break;
        }
       return car;



    }
}
