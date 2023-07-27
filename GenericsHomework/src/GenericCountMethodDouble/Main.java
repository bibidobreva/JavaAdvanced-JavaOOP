package GenericCountMethodDouble;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Double> stringList = new ArrayList<>();
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            double input = Double.parseDouble(scanner.nextLine());
            stringList.add(input);
        }
        double comparison = Double.parseDouble(scanner.nextLine());
        Comparing comparing = new Comparing<>(stringList);
        comparing.getCount(comparison);

    }
}
