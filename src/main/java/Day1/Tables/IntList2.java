package Day1.Tables;


public class IntList2 {

    public static void main(String[] args) {
        int size = 100;
        int[] numbers =  new int[size];

        for (int i=0; i<numbers.length; i++) {
            numbers[i] = i;
        }

        System.out.println("Table size: "+numbers.length);
        for (int i: numbers) {
            System.out.println("Value of element is: "+i);
        }

    }
}
