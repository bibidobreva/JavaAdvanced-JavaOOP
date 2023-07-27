package TrafficLights;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\s+");
        int n = Integer.parseInt(scanner.nextLine());


        for (int i = 0; i < n; i++) {
            int count = 0;
            for (String light : input) {
                Lights lights = Lights.valueOf(light);
                System.out.print(lights.getNextLight()+" ");
                input[count] = lights.getNextLight();
                count++;
            }
            System.out.println();

        }
    }
}
