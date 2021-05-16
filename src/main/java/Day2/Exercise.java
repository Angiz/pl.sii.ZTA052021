package Day2;

public class Exercise {

    public int sumEven(int number){
        int sum = 0;
        for (int i = 2; i<number; i+=2) {
                sum += i;
        }
        return sum;
    }

    public static boolean isPrime(int number) {
        //Hausaufgabe
        return true;
    }

    public static void main(String[] args) {
        Exercise e = new Exercise(); //It's possible to do static instead
        System.out.println(e.sumEven(6));
    }
}
