import java.util.Scanner;

public class NumberInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputNumbers = scanner.nextLine().split("\\s+");
        int start = Integer.parseInt(inputNumbers[0]);
        int end = Integer.parseInt(inputNumbers[1]);
        System.out.printf("Range: [%d...%d]%n",start,end);

        boolean isValid = false;
        String input = "";

        while (!isValid) {
            input = scanner.nextLine();

            try {
                int number = Integer.parseInt(input);
                isValid = validation(number, start, end);
            } catch (IllegalArgumentException ignored) {
                System.out.println("Invalid number: " + input);
            }

        }
        System.out.println("Valid number: " + input);

    }

    public static boolean validation(int number, int start, int end) {
        if (number >= start && number <= end) {

            return true;
        } else {
            System.out.println("Invalid number: " + number);
            return false;
        }
    }
}
