package Day2.Vegetables;

public class Apple implements Fruit {

    int weight;
    int size;
    int price;

    public Apple(int weight, int size, int price) {
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
        return "Apple{" +
                "weight=" + weight +
                ", size=" + size +
                ", price=" + price +
                '}';
    }
}
