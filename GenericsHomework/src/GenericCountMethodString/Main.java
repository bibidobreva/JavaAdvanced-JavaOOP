package GenericCountMethodString;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> stringList = new ArrayList<>();
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            stringList.add(input);
        }
        String comparison = scanner.nextLine();
       Comparing comparing = new Comparing<>(stringList);
       comparing.getCount(comparison);


    }
}
