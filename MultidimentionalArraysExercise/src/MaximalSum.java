import java.util.Arrays;
import java.util.Scanner;

public class MaximalSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\s+");
        int rows = Integer.parseInt(input[0]);
        int cols = Integer.parseInt(input[1]);
        int[][] data = new int[rows][cols];

        for (int i = 0; i < data.length; i++) {
            data[i] = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        }

        int max = Integer.MIN_VALUE;
        int indexRows = 0;
        int indexCols = 0;
        for (int i = 0; i < data.length - 2; i++) {
            for (int j = 0; j < data[i].length - 2; j++) {
                int current = data[i][j] + data[i][j + 1] + data[i][j + 2] + data[i + 1][j] + data[i + 2][j] + data[i + 1][j + 1] + data[i + 2][j + 2] + data[i + 1][j + 2] + data[i + 2][j + 1];
                if (current > max) {
                    max = current;
                    indexRows=i;
                    indexCols=j;
                }
            }
        }
        System.out.println("Sum = "+max);
        for (int i = indexRows; i < indexRows+3; i++) {
            for (int j = indexCols; j <indexCols+3 ; j++) {
                System.out.print(data[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
