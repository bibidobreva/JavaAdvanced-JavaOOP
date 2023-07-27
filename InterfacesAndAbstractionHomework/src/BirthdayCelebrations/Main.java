package BirthdayCelebrations;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Birthable> listOfBirthable = new ArrayList<>();
        String input;
        while (!(input = scanner.nextLine()).equals("End")) {
            String[] information = input.split("\\s+");
            String classType = information[0];
            switch (classType) {
                case "Citizen":
                    Birthable citizen = new Citizen(information[1], Integer.parseInt(information[2]), information[3], information[4]);
                    listOfBirthable.add(citizen);
                    break;
                case "Pet":
                    Birthable pet = new Pet(information[1], information[2]);
                    listOfBirthable.add(pet);
                    break;
            }
        }

        String year = scanner.nextLine();
       List<String> bornInYear = listOfBirthable.stream().map(Birthable::getBirthDate).filter(e -> e.endsWith(year)).toList();
        if (bornInYear.isEmpty()) {
           System.out.println("<no output>");
        } else {
           bornInYear.forEach(System.out::println);
        }




    }
}
