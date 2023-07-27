package FoodShortage;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Buyer> buyers = new HashMap<>();
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] inputInfo = scanner.nextLine().split("\\s+");
            if (inputInfo.length == 3) {
                Rebel rebel = new Rebel(inputInfo[0], Integer.parseInt(inputInfo[1]), inputInfo[2]);
                buyers.put(inputInfo[0], rebel);
            } else {
                Citizen citizen = new Citizen(inputInfo[0], Integer.parseInt(inputInfo[1]), inputInfo[2], inputInfo[3]);
                buyers.put(inputInfo[0], citizen);
            }
        }
        String input;
        while (!(input = scanner.nextLine()).equals("End")) {
            if (buyers.containsKey(input)) {
                buyers.get(input).buyFood();
            }
        }
        int sumOfFood = buyers.values().stream().mapToInt(Buyer::getFood).sum();
        System.out.println(sumOfFood);
    }
}
