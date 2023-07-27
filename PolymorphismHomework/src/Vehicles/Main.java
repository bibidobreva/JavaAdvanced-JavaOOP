package Vehicles;

import java.text.DecimalFormat;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] carInfo = scanner.nextLine().split("\\s+");
        String[] truckInfo = scanner.nextLine().split("\\s+");
        Vehicle car = new Car(Double.parseDouble(carInfo[1]), Double.parseDouble(carInfo[2]));
        Vehicle truck = new Truck(Double.parseDouble(truckInfo[1]), Double.parseDouble(truckInfo[2]));
        Map<String, Vehicle> vehicleMap = new LinkedHashMap<>();
        vehicleMap.put("Car", car);
        vehicleMap.put("Truck", truck);

        DecimalFormat decimalFormat = new DecimalFormat("###.##");

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            String operation = input[0];
            String vehicleType = input[1];
            Vehicle vehicle = vehicleMap.get(vehicleType);

            if (operation.equals("Drive")) {
                Double drive = vehicle.driving(Double.parseDouble(input[2]));
                if (drive == null) {
                    System.out.println(vehicleType + " needs refueling");
                } else {
                    System.out.println(vehicleType + " travelled " + decimalFormat.format(drive) + " km");
                }
            } else if (operation.equals("Refuel")) {
                vehicle.refueling(Double.parseDouble(input[2]));
            }


        }

        System.out.println(car);
        System.out.println(truck);

    }

}
