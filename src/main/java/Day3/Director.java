package Day3;

public class Director extends Person {

    public Director(String name, String surname, double salary) {
        super(name, surname, salary);
        setSalary(salary);
    }

    @Override
    public void setSalary(double salary) {
        this.salary = salary *3;

    }
}
