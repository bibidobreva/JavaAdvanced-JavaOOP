package ComparingObjects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Person> personList = new ArrayList<>();

        String input;
        while (!(input=scanner.nextLine()).equals("END")) {
            personList.add(new Person(input));
        }

        int index = Integer.parseInt(scanner.nextLine()) - 1;

        matchAndPrint(personList, index);
    }
    public static void matchAndPrint (List<Person> personList, int index) {
        Person search = personList.get(index);

        int[] match = {0,0, personList.size()};

        for (Person person : personList) {
            if (person.compareTo(search) == 0) {
                match[0]++;
            } else {
                match[1]++;
            }
        }

        if (match[0] == 1) {
            System.out.println("No matches");
        } else {
            System.out.println(Arrays.toString(match).replaceAll("[\\[\\],]", ""));
        }
    }
}
