package Day2.Family;

public class Children extends Parents{

    public String name;
    public String surname;
    public int age;

    public Children(String name, String surname, int age, String profession, int retirementPension) {
        super(profession);
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.profession = profession;
        this.retirementPension = retirementPension;
    }

    public Children(){}

    @Override
    public String toString() {
        return "Children{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", profession='" + profession + '\'' +
                ", retirementPension=" + retirementPension +
                '}';
    }

    public void objectPrinter(){
        System.out.println(toString());
    }
}
