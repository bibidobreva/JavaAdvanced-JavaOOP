package Box;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double length = Double.parseDouble(scanner.nextLine());
        double width = Double.parseDouble(scanner.nextLine());
        double height = Double.parseDouble(scanner.nextLine());

        Box box = new Box(length,width,height);

        System.out.println("Surface area - "+box.calculateSurfaceArea());
        System.out.println("Literal surface area - "+box.calculateLateralSurfaceArea());
        System.out.println("Volume - "+box.calculateVolume());
    }
}
