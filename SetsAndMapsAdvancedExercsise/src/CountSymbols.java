import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountSymbols {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Character, Integer> characters = new TreeMap<>();
        char[] charArray = scanner.nextLine().replace("\\s+","").toCharArray();

        for  (char symbol:charArray){
            characters.putIfAbsent(symbol,0);
            characters.put(symbol,characters.get(symbol)+1);
        }

        for (Map.Entry<Character, Integer> entry : characters.entrySet()) {
            System.out.printf("%s: %d time/s%n",entry.getKey(),entry.getValue());
        }

    }
}
