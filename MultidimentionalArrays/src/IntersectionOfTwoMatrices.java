import java.util.Arrays;
import java.util.Scanner;

public class IntersectionOfTwoMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = Integer.parseInt(scanner.nextLine());
        int cols = Integer.parseInt(scanner.nextLine());

        char[][] matrixOne = new char[rows][cols];
        char[][] matrixTwo = new char[rows][cols];

        for (int i = 0; i < matrixOne.length; i++) {
            String read = scanner.nextLine().replace(" ", "");
            matrixOne[i] = read.toCharArray();
        }

        for (int i = 0; i < matrixTwo.length; i++) {
            String read = scanner.nextLine().replace(" ", "");
            matrixTwo[i] = read.toCharArray();
        }

        char[][] thirstMatrix = new char[rows][cols];

        for (int i = 0; i < thirstMatrix.length; i++) {
            for (int j = 0; j < thirstMatrix[i].length; j++) {
                char one = matrixOne[i][j];
                char two = matrixTwo[i][j];
                if (one == two) {
                    thirstMatrix[i][j] = one;
                } else {
                    thirstMatrix[i][j] = '*';
                }
                System.out.print(thirstMatrix[i][j]+" ");
            }
            System.out.println("");
        }

    }
}
