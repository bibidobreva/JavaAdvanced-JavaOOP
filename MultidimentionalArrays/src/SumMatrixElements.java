import java.util.Scanner;

public class SumMatrixElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] rowCol = scanner.nextLine().split(", ");
        int rows = Integer.parseInt(rowCol[0]);
        int cols = Integer.parseInt(rowCol[1]);

        int [][] data = new int[rows][cols];

        for (int i = 0; i < data.length; i++) {
            String [] column = scanner.nextLine().split(", ");
            for (int j = 0; j < data[i].length; j++) {
                data[i][j] = Integer.parseInt(column[j]);
            }
        }
        int sum = 0;
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                sum+=data[i][j];
            }
        }
        System.out.println(rows);
        System.out.println(cols);
        System.out.println(sum);

    }
}
