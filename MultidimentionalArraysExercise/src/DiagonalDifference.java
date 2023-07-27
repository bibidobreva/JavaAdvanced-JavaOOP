import java.util.Arrays;
import java.util.Scanner;

public class DiagonalDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = Integer.parseInt(scanner.nextLine());
        int[][] cube = new int[size][size];

        for (int i = 0; i < cube.length; i++) {
            cube[i] = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        }
        int sum1 = 0;
        for (int i = 0; i < cube.length; i++) {
            sum1 += cube[i][i];
        }
        int sum2 = 0;

        for (int i = size - 1, j = 0; j < size; i--, j++) {
            sum2 += cube[i][j];
        }

        int diff = Math.abs(sum1 - sum2);
        System.out.println(diff);
    }
}
