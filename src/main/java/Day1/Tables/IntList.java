package Day1.Tables;

import java.util.ArrayList;
import java.util.List;

public class IntList {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        for (int i = 1; i<=20; i++) {
            if (i%2==1) {
                list.add(i*3);
            }
            else {
                list.add(i);
            }

        }
        System.out.println(list);

        //ForEach - nie możemy wykonywać metod na liście tutaj
        for (Integer i: list) {
            if (i%2 == 0) {
                System.out.print(i+", ");
            }
        }
    }
}
