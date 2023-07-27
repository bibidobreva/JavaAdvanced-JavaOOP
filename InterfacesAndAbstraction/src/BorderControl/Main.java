package BorderControl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Identifiable> robotsAndCitizens = new ArrayList<>();
        String input;
        while(!(input = scanner.nextLine()).equals("End")){
            String[]information = input.split("\\s+");
            if(information.length==2){
                Identifiable robot = new Robot(information[1],information[0]);
                robotsAndCitizens.add(robot);
            } else if (information.length==3) {
                Identifiable citizen = new Citizen(information[0],Integer.parseInt(information[1]),information[2]);
                robotsAndCitizens.add(citizen);
            }
        }
        String fakeID = scanner.nextLine();

        robotsAndCitizens.stream().map(Identifiable::getId).filter(e->e.endsWith(fakeID)).forEach(System.out::println);
    }
}
