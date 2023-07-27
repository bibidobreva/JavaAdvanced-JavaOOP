package CarSalesman;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        Map<String, CarEngine> carEngineMap = new HashMap<>();
        List<CarForSale> carForSaleList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            String model = input[0];
            int power = Integer.parseInt(input[1]);
            CarEngine current = new CarEngine();
            if (input.length == 2) {
                current = new CarEngine(model, power);
            } else if (input.length == 3) {
                if (isInputInteger(input[2])) {
                    current = new CarEngine(model, power, Integer.parseInt(input[2]));
                } else {

                    current = new CarEngine(model, power, input[2]);
                }
            } else if (input.length == 4) {
                int displacement = Integer.parseInt(input[2]);
                String efficiency = input[3];
                current = new CarEngine(model, power, displacement, efficiency);
            }
            carEngineMap.put(model, current);
        }

        n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            CarForSale current = new CarForSale();

            String model = input[0];
            String engine = input[1];


            if (input.length == 2) {
                current = new CarForSale(model, engine);


            } else if (input.length == 3) {
                if (isInputInteger(input[2])) {
                    current = new CarForSale(model, engine, Integer.parseInt(input[2]));
                } else {

                    current = new CarForSale(model, engine, input[2]);
                }

            } else if (input.length == 4) {
                int weight = Integer.parseInt(input[2]);
                String color = input[3];
                current = new CarForSale(model, engine, weight, color);
            }
            current.setCarEngine(carEngineMap.get(engine));
            carForSaleList.add(current);

        }

        for (CarForSale car : carForSaleList) {
            System.out.println(car);
        }


    }

    public static boolean isInputInteger(String inputString) {
        boolean integer = true;
        for (char a : inputString.toCharArray()) {
            if (a < 48 || a > 57) {
                integer = false;
                break;
            }
        }
        return integer;
    }
}
