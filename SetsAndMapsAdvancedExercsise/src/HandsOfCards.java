import java.util.*;

public class HandsOfCards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, HashSet<String>> cardGame = new LinkedHashMap<>();
        String input;
        while (!(input = scanner.nextLine()).equals("JOKER")) {
            String name = input.split(": ")[0];
            String card = input.split(": ")[1];
            String [] cards = card.split(", ");
            if (!cardGame.containsKey(name)) {
                cardGame.put(name, new LinkedHashSet<>());
            }
            for (int i = 0; i < cards.length; i++) {
                cardGame.get(name).add(cards[i]);
            }
        }
        for (Map.Entry<String, HashSet<String>> entry : cardGame.entrySet()) {
            getResult(entry.getKey(), entry.getValue());
        }

    }

    public static void getResult(String name, Set<String> card) {
        int sum = 0;
        for (String currentCard : card) {
            String multiplyLetter = currentCard.substring(currentCard.length() - 1);
            String cardValue = currentCard.substring(0, currentCard.length() - 1);
            sum += GetCard(multiplyLetter, cardValue);

        }
        System.out.printf("%s: %d%n",name,sum);
    }

    public static int GetCard(String multiply, String value) {
        int multiplyCard = 0;
        int valueCard = 0;
        if (multiply.equals("S")) {
            multiplyCard = 4;
        } else if (multiply.equals("H")) {
            multiplyCard = 3;
        } else if (multiply.equals("D")) {
            multiplyCard = 2;
        } else if (multiply.equals("C")) {
            multiplyCard = 1;
        }

        if (value.equals("J")) {
            valueCard = 11;
        } else if (value.equals("Q")) {
            valueCard = 12;
        } else if (value.equals("K")) {
            valueCard = 13;
        } else if (value.equals("A")) {
            valueCard = 14;
        }else {
            valueCard = Integer.parseInt(value);
        }

        return valueCard * multiplyCard;
    }
}
