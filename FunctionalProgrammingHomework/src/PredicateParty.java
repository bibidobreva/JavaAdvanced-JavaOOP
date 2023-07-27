import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> names = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());

        String input;
        while (!(input = scanner.nextLine()).equals("Party!")) {
            String command = input.split("\\s+")[0];
            Predicate<String> predicate = null;
            String condition = input.split("\\s+")[1];
            String numOrString = input.split("\\s+")[2];
            if (condition.equals("Length")) {
                predicate = e -> e.length() == Integer.parseInt(numOrString);
            } else if (condition.equals("StartsWith")) {
                predicate = e -> e.startsWith(numOrString);
            } else if (condition.equals("EndsWith")) {
                predicate = e -> e.endsWith(numOrString);
            }

            if (command.equals("Remove")) {
                List<String> toRemove = new ArrayList<>();
                for(String name: names){
                    if(predicate.test(name)){
                        toRemove.add(name);
                    }

                }
                names.removeAll(toRemove);
            } else if (command.equals("Double")) {
                List<String> toAdd = new ArrayList<>();
                for(String name: names){
                    if(predicate.test(name)){
                        toAdd.add(name);
                    }
                }
                names.addAll(toAdd);
            }


        }
        if(names.isEmpty()){
            System.out.println("Nobody is going to the party!");
        }else {
            System.out.println(names.stream().sorted().collect(Collectors.toCollection(ArrayList::new)).toString().replaceAll("([\\[\\]])", "") + " are going to the party!");
        }
    }
}
