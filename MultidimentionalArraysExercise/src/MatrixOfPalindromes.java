import java.util.Scanner;

public class MatrixOfPalindromes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();
        String[][] matrix = new String[rows][cols];
        char zero = 'a';

        for (int i = 0; i <matrix.length ; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                int indexFirst = zero+i;
                int indexMiddle = zero+i+j;
                char oneAndThree = (char)indexFirst;
                char middle = (char)indexMiddle;
                String toMatrix = Character.toString(oneAndThree)+Character.toString(middle)+Character.toString(oneAndThree);
                matrix[i][j] = toMatrix;
                System.out.print(toMatrix+" ");

            }
            System.out.println();
        }


    }
}
