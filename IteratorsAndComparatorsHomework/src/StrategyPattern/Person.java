package StrategyPattern;

public class Person {
    String name;
    int age;
    public Person(String input) {
        String[] items = input.split("\\s+");
        this.name = items[0];
        this.age = Integer.parseInt(items[1]);
    }

    @Override
    public String toString(){
        return String.format("%s %d", this.name, this.age);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
