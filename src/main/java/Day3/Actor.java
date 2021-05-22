package Day3;

public class Actor extends Person {

    public Actor(String name, String surname, double salary) {
        super(name, surname, salary);
        setSalary(salary);
    }

    @Override
    public void setSalary(double salary) {
        this.salary = salary*2;
    }
}
