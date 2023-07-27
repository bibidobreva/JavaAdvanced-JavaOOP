import java.util.Arrays;
import java.util.Scanner;

public class PrintDiagonalsOfSquareMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = Integer.parseInt(scanner.nextLine());

        int[][] cube = new int[size][size];

        for (int i = 0; i < cube.length; i++) {
            cube[i] = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        }

        for (int i = 0; i < cube.length; i++) {
            System.out.print(cube[i][i]+" ");
        }
        System.out.println();
        for (int i = size-1, j = 0; j < size; i--, j++) {
            System.out.print(cube[i][j]+" ");
        }
    }
}
