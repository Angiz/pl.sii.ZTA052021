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
        if (number==0 || number==1) {
            return false;
        }
        else if(number==2 || number==3 || number==5){
            return true;
        }
        else if (number%2==0 || number%3==0 || number%5==0) {
            return false;
        }
        else {
            return true;
        }
    }

    public static void main(String[] args) {
        Exercise e = new Exercise(); //It's possible to do static instead
        System.out.println(isPrime(31));
        //System.out.println(e.sumEven(6));
    }
}
