package Day2.Company;

import java.util.ArrayList;
import java.util.List;

public class Company {

    public static void main(String[] args) {
        Worker worker1 = new Worker();
        Worker worker2 = new Worker();
        Worker worker3 = new Worker();
        Worker worker4 = new Worker();
        Worker contructorWorker =  new Worker("Adam", "Kowalski", 23);
        Director director = new Director("Zdzislaw", "Szefowski", 30, "HR");

        List<Worker> listOfWorkers = new ArrayList<>();

        worker3.Name = "Aneta";
        worker3.Surname = "XYZ";
        worker3.Age = 20;

        worker4.Name = "Adam";
        worker4.Surname = "ZYX";
        worker4.Age = 21;

        listOfWorkers.add(worker3);
        listOfWorkers.add(worker4);
        listOfWorkers.add(contructorWorker);
        listOfWorkers.add(director);

        System.out.println("Test: "+worker3.getName());
        worker4.getData();



        worker1.introduceYourself("Andrzej", "Bobol", 30);
        worker2.introduceYourself("Katarzyna", "Kowalska", 29);

        //System.out.println(worker3); //printing toString method

        listOfWorkers.get(0).setSurname("Nowak");

        for (Worker w: listOfWorkers) {
            System.out.println(w);
        }
    }
}
