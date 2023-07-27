package ValidationData;

public class Person {


    private String firstName;
    private String lastName;
    private int age;

    private double salary;


    Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public Person(String firstName, String lastName, int age, double salary) {
        setFirstName(firstName);
        setLastName(lastName);
        setAge(age);
        setSalary(salary);
    }


    public void increaseSalary(double bonus) {
        double trueBonus = bonus;
        if (age < 30) {
            trueBonus = trueBonus / 2;
        }
        salary = salary+salary*(trueBonus/100);
    }

    public int getAge() {
        return age;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        if(lastName.length()<3){
            throw new IllegalArgumentException("Last name cannot be less than 3 symbols");
        }
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        if(firstName.length()<3){
            throw new IllegalArgumentException("First name cannot be less than 3 symbols");
        }
        this.firstName = firstName;
    }

    public void setAge(int age) {
        if(age<=0){
            throw new IllegalArgumentException("Age cannot be zero or negative integer");
        }
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return String.format("%s %s gets %f leva", firstName, lastName, salary);
    }
}
