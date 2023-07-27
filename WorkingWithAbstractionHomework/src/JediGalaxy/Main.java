package JediGalaxy;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dimestions = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int x = dimestions[0];
        int y = dimestions[1];

        int[][] matrix = new int[x][y];

        fillMatrix(x, y, matrix);

        String command = scanner.nextLine();
        long sum = 0;
        while (!command.equals("Let the Force be with you")) {
            int[] IvoPath = Arrays.stream(command.split(" ")).mapToInt(Integer::parseInt).toArray();
            int[] evilPath = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int xEvil = evilPath[0];
            int yEvil = evilPath[1];

            while (xEvil >= 0 && yEvil >= 0) {
                if (xEvil < matrix.length && yEvil < matrix[0].length) {
                    matrix[xEvil][yEvil] = 0;
                }
                xEvil--;
                yEvil--;
            }

            int xIvo = IvoPath[0];
            int yIvo = IvoPath[1];

            while (xIvo >= 0 && yIvo < matrix[1].length) {
                if (xIvo < matrix.length && yIvo >= 0 && yIvo < matrix[0].length) {
                    sum += matrix[xIvo][yIvo];
                }

                yIvo++;
                xIvo--;
            }

            command = scanner.nextLine();
        }

        System.out.println(sum);


    }

    private static void fillMatrix(int x, int y, int[][] matrix) {
        int value = 0;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                matrix[i][j] = value++;
            }
        }
    }
}
