package OpinionPoll;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Person> people = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            String name = input[0];
            int age = Integer.parseInt(input[1]);
            Person person = new Person(name,age);
            people.add(person);
        }
        people.sort(Comparator.comparing(Person::getName));
        people.stream().filter(e->e.getAge()>30).forEach(System.out::println);
    }
}
