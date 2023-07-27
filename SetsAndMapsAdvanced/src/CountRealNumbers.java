import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<Double, Integer> occurrences = new LinkedHashMap<>();
        String[] numbers = scanner.nextLine().split("\\s+");

        for (String number : numbers) {
            double num = Double.parseDouble(number);

            occurrences.putIfAbsent(num, 0);
            occurrences.put(num, occurrences.get(num)+1);
        }
        for (Map.Entry<Double, Integer> entry : occurrences.entrySet()) {
            System.out.printf("%.1f -> %d%n",entry.getKey(),entry.getValue());
        }


    }
}
