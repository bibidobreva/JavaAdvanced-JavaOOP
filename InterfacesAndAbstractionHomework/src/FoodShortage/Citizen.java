package FoodShortage;

public class Citizen implements Identifiable, Buyer, Person {
    private String name;
    private int age;
    private String id;
    private String birthDate;
    private int food;

    public Citizen(String name, int age, String id, String birthDate) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.birthDate = birthDate;
        this.food = 0;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getId() {
        return id;
    }

    @Override
    public void buyFood() {
        food+=10;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public int getFood() {
        return food;
    }

}
