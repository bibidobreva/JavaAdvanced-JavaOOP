package ExerciseOne;

 class Person {


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
        this(firstName, lastName, age);
        this.salary = salary;
    }


    public void increaseSalary(double bonus) {
        double trueBonus = bonus;
        if (age < 30) {
            trueBonus = trueBonus / 2;
        }
        salary = salary*(1+bonus/100);
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
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("%s %s is %d years old.", firstName, lastName, age);
    }
}
