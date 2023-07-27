package Google;



import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        Map<String, PersonGoogle> personGoogleMap = new LinkedHashMap<>();
        while (!(input=scanner.nextLine()).equals("End")){
            String name = input.split("\\s+")[0];
            String command = input.split("\\s+")[1];
            String [] inputArray = input.split("\\s+");
            if(command.equals("company")){
                String companyName = inputArray[2];
                String department = inputArray[3];
                double salary = Double.parseDouble(inputArray[4]);
                Company currentCompany = new Company(companyName,department,salary);
                if(!personGoogleMap.containsKey(name)){
                    PersonGoogle personGoogle = new PersonGoogle(name);
                    personGoogle.setCompany(currentCompany);
                    personGoogleMap.put(name,personGoogle);
                }else {
                    personGoogleMap.get(name).setCompany(currentCompany);
                }

            } else if (command.equals("pokemon")) {
                String pokemonName = inputArray[2];
                String pokemonType = inputArray[3];
                PokemonGoogle pokemonGoogle = new PokemonGoogle(pokemonName,pokemonType);
                if(!personGoogleMap.containsKey(name)){
                    PersonGoogle personGoogle = new PersonGoogle(name);
                    personGoogle.addPokemonGoogle(pokemonGoogle);
                    personGoogleMap.put(name,personGoogle);

                }else {
                    personGoogleMap.get(name).addPokemonGoogle(pokemonGoogle);
                }



            } else if (command.equals("parents")) {
                String parentName = inputArray[2];
                String parentBirthday = inputArray[3];
                Parents parents = new Parents(parentName,parentBirthday);
               if(!personGoogleMap.containsKey(name)){
                   PersonGoogle personGoogle = new PersonGoogle(name);
                   personGoogle.addParents(parents);
                   personGoogleMap.put(name,personGoogle);

               }else {
                   personGoogleMap.get(name).addParents(parents);
               }



            } else if (command.equals("children")) {
                String childName = inputArray[2];
                String childBirthday = inputArray[3];
                Children children = new Children(childName,childBirthday);
                if(!personGoogleMap.containsKey(name)){
                    PersonGoogle personGoogle = new PersonGoogle(name);
                    personGoogle.addChildren(children);
                    personGoogleMap.put(name,personGoogle);

                }else {
                    personGoogleMap.get(name).addChildren(children);
                }



            } else if (command.equals("car")) {
                String carModel = inputArray[2];
                String carSpeed = inputArray[3];
                CarGoogle carGoogle = new CarGoogle(carModel,carSpeed);
                if(!personGoogleMap.containsKey(name)){
                    PersonGoogle personGoogle = new PersonGoogle(name);
                    personGoogle.setCarGoogle(carGoogle);
                    personGoogleMap.put(name,personGoogle);
                }else {
                    personGoogleMap.get(name).setCarGoogle(carGoogle);
                }

            }
        }

        String nameToPrint = scanner.nextLine();
        System.out.println( personGoogleMap.get(nameToPrint).toString());
    }
}
