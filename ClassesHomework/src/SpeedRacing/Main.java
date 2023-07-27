package SpeedRacing;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        Map<String, Car> carMap = new TreeMap<>();

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            String model = input[0];
            double fuelAmount = Double.parseDouble(input[1]);
            double priceFuelPerKM = Double.parseDouble(input[2]);
            Car current = new Car(model, fuelAmount, priceFuelPerKM);
            carMap.put(model,current);


        }

        String input;
        while(!(input = scanner.nextLine()).equals("End")){
            String modelToDrive = input.split("\\s+")[1];
            int distance = Integer.parseInt(input.split("\\s+")[2]);
            carMap.get(modelToDrive).carDrive(distance);


        }

        for (Map.Entry<String, Car> entry : carMap.entrySet()) {
            System.out.println(entry.getValue());
        }

    }
}
