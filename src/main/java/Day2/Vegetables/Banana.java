package Day2.Vegetables;

public class Banana implements Fruit {

    int weight;
    int size;
    int price;

    public Banana(int weight, int size, int price) {
        this.weight = weight;
        this.size = size;
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Banana{" +
                "weight=" + weight +
                ", size=" + size +
                ", price=" + price +
                '}';
    }
}
