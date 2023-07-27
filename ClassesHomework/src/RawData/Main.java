package RawData;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, CarCourier> carCourierMap = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            String model = input[0];
            int engineSpeed = Integer.parseInt(input[1]);
            int enginePower = Integer.parseInt(input[2]);
            int cargoWeight = Integer.parseInt(input[3]);
            String cargoType = input[4];
            double tire1Pressure = Double.parseDouble(input[5]);
            int tire1Age = Integer.parseInt(input[6]);
            double tire2Pressure = Double.parseDouble(input[7]);
            int tire2Age = Integer.parseInt(input[8]);
            double tire3Pressure = Double.parseDouble(input[9]);
            int tire3Age = Integer.parseInt(input[10]);
            double tire4Pressure = Double.parseDouble(input[11]);
            int tire4Age = Integer.parseInt(input[12]);
            CarCourier current = new CarCourier(model, new Engine(engineSpeed, enginePower), new Cargo(cargoType, cargoWeight), new Tire(tire1Pressure, tire1Age, tire2Pressure, tire2Age, tire3Pressure, tire3Age, tire4Pressure, tire4Age));
            carCourierMap.put(model, current);
        }

        String command = scanner.nextLine();

        if (command.equals("fragile")) {
            for (Map.Entry<String, CarCourier> entry : carCourierMap.entrySet()) {
                if (entry.getValue().isFragile()) {
                    System.out.println(entry.getKey());
                }
            }


        } else if (command.equals("flamable")) {
            for (Map.Entry<String, CarCourier> entry : carCourierMap.entrySet()) {
                if(entry.getValue().isFlamable()){
                    System.out.println(entry.getKey());
                }
            }

        }
    }
}

