package Day2.Company;

public class Director extends Worker {

    public String department;

    public Director(){} //empty constructor in Worker is enough

    public Director(String n, String s, int a, String department) {
        super(n, s, a);
        this.department = department;
    }

    @Override
    public String toString() {
        return "Director{" +
                "department='" + department + '\'' +
                ", Name='" + Name + '\'' +
                ", Surname='" + Surname + '\'' +
                ", Age=" + Age +
                '}';
    }
}
