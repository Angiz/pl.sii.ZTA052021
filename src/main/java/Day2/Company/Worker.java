package Day2.Company;

public class Worker {

    public String Name;
    public String Surname;
    public int Age;

    public Worker(String n, String s, int a) {
        this.Name = n;
        this.Surname = s;
        this.Age = a;
    }
    public Worker() {}

    public String getName() {
        return Name;
    }

    public String getSurname() {
        return Surname;
    }

    public int getAge() {
        return Age;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public void setSurname(String surname) {
        if (surname.length()>1) {
            this.Surname = surname;
        }

    }

    public void setAge(int age) {
        this.Age = age;
    }

    public void introduceYourself(String n, String s, int a) {
        System.out.println("Hi, my name is "+n+" "+s+". I am "+a+" years old.");
    }

    public void getData() {
        System.out.println(toString());
    }
    @Override
    public String toString() {  //Generate -> toString; method to printing objects
        return "Worker{" +
                "Name='" + Name + '\'' +
                ", Surname='" + Surname + '\'' +
                ", Age=" + Age +
                '}';
    }
}
