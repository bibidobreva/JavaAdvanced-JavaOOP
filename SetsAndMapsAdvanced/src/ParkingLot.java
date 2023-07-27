import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class ParkingLot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String carInput;
        LinkedHashSet<String> cars = new LinkedHashSet<>();

        while(!(carInput=scanner.nextLine()).equals("END")){
            String command = carInput.split(", ")[0];
            String carNumber = carInput.split(", ")[1];
            if(command.equals("IN")){

                cars.add(carNumber);
            } else if (command.equals("OUT")) {
                cars.remove(carNumber);
            }



        }
        if(cars.isEmpty()){
            System.out.println("Parking Lot is Empty");
        }else {
            for(String car: cars){
                System.out.println(car);
            }
        }
    }
}
