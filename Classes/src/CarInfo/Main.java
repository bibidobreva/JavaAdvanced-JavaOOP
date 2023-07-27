package CarInfo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            Car thisCar = new Car();
            thisCar.setBrand(input[0]);
            thisCar.setModel(input[1]);
            thisCar.setHorsepower(Integer.parseInt(input[2]));
            System.out.println(thisCar);
        }
    }
}
