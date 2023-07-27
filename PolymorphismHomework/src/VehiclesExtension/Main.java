package VehiclesExtension;

import java.text.DecimalFormat;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] carInfo = readArray(scanner);
        String[] truckInfo = readArray(scanner);
        String[] busInfo = readArray(scanner);
        Vehicle car = new Car(Double.parseDouble(carInfo[1]), Double.parseDouble(carInfo[2]), Double.parseDouble(carInfo[3]));
        Vehicle truck = new Truck(Double.parseDouble(truckInfo[1]), Double.parseDouble(truckInfo[2]), Double.parseDouble(truckInfo[3]));
        Vehicle bus = new Bus(Double.parseDouble(busInfo[1]), Double.parseDouble(busInfo[2]), Double.parseDouble(busInfo[3]));
        Map<String, Vehicle> vehicleMap = new LinkedHashMap<>();
        vehicleMap.put("Car", car);
        vehicleMap.put("Truck", truck);
        vehicleMap.put("Bus", bus);

        DecimalFormat decimalFormat = new DecimalFormat("###.##");

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] input = readArray(scanner);
            String operation = input[0];
            String vehicleType = input[1];
            Vehicle vehicle = vehicleMap.get(vehicleType);
            try {
                if (operation.equals("Drive")) {
                    Double drive = vehicle.driving(Double.parseDouble(input[2]));
                    drivingVehacle(decimalFormat, vehicleType, drive);
                } else if (operation.equals("Refuel")) {
                    if (!vehicle.refueling(Double.parseDouble(input[2]))) {
                        System.out.println("Cannot fit fuel in tank");
                    }
                } else if (operation.equals("DriveEmpty")) {
                    Double drive = vehicle.drivingEmpty(Double.parseDouble(input[2]));
                    drivingVehacle(decimalFormat, vehicleType, drive);
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }


        }

        System.out.println(car);
        System.out.println(truck);
        System.out.println(bus);

    }

    private static void drivingVehacle(DecimalFormat decimalFormat, String vehicleType, Double drive) {
        if (drive == null) {
            System.out.println(vehicleType + " needs refueling");
        } else {
            System.out.println(vehicleType + " travelled " + decimalFormat.format(drive) + " km");
        }
    }

    private static String[] readArray(Scanner scanner) {
        return scanner.nextLine().split("\\s+");
    }

}
