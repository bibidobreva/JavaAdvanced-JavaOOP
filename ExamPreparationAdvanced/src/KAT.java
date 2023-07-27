import java.util.ArrayDeque;
import java.util.Scanner;

public class KAT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Long> licencePlates = new ArrayDeque<>();
        ArrayDeque<Long> cars = new ArrayDeque<>();

        String[] licenceInput = scanner.nextLine().split(", ");
        for (int i = 0; i < licenceInput.length; i++) {
            licencePlates.offer(Long.parseLong(licenceInput[i]));
        }
        String[] carInput = scanner.nextLine().split(", ");
        for (int i = 0; i < carInput.length; i++) {
            cars.push(Long.parseLong(carInput[i]));
        }
        long registeredCars = 0;
        long days = 0;

        while (!licencePlates.isEmpty() && !cars.isEmpty()) {
            days++;
            long car = cars.pop();
            long plates = licencePlates.poll();
            long neededPlates = car * 2;

            if (neededPlates < plates) {
                long extraPlates = plates - neededPlates;
                licencePlates.addLast(extraPlates);
                registeredCars += car;
            } else if (plates < neededPlates) {
                long carWithoutPlates = car- (plates/2);
                cars.addLast(carWithoutPlates);
                registeredCars += plates / 2;
            } else {
                registeredCars += car;
            }


        }

        System.out.printf("%d cars were registered for %d days!%n", registeredCars, days);


        if (!licencePlates.isEmpty()) {
            int plateNum = 0;
            for (long plates : licencePlates) {
                plateNum += plates;
            }
            System.out.printf("%d license plates remain!%n", plateNum);
        } else if (!cars.isEmpty()) {
            int carsLeft = 0;
            for (long car : cars) {
                carsLeft += car;
            }
            System.out.printf("%d cars remain without license plates!%n", carsLeft);
        } else {
            System.out.println("Good job! There is no queue in front of the KAT!");
        }


    }
}
