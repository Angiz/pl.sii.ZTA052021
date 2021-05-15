package Day1.Exceptions;

public class Exceptions {

    public static void main(String[] args) {
        int [] numbers = new int[3];
        try {
            numbers[4] = 2/0;
        }
        catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("I execute everytime!");
        }
    }
}
