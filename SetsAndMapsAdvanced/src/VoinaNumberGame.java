import java.util.*;
import java.util.stream.Collectors;

public class VoinaNumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> inputOne = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> inputTwo = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        Set<Integer> deckOne = new LinkedHashSet<>();
        Set<Integer> deckTwo = new LinkedHashSet<>();

        for (int i = 0; i < inputOne.size(); i++) {
            deckOne.add(inputOne.get(i));
            deckTwo.add(inputTwo.get(i));
        }

        for (int i = 0; i <= 50; i++) {
            if(deckOne.isEmpty()){
                break;
            } else if (deckTwo.isEmpty()) {
                break;
            }

            Integer playerOne = deckOne.iterator().next();
            Integer playerTwo = deckTwo.iterator().next();
            deckOne.remove(playerOne);
            deckTwo.remove(playerTwo);

            if (playerOne > playerTwo) {
                deckOne.add(playerOne);
                deckOne.add(playerTwo);
            } else if (playerOne < playerTwo) {
                deckTwo.add(playerOne);
                deckTwo.add(playerTwo);
            } else {
                deckOne.add(playerOne);
                deckOne.add(playerTwo);
            }


        }

        if (deckTwo.size()<deckOne.size()) {
            System.out.println("First player win!");
        } else if (deckOne.size()<deckTwo.size()) {
            System.out.println("Second player win!");
        } else {
            System.out.println("Draw!");
        }
    }
}
