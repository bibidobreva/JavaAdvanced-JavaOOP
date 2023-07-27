import java.util.Scanner;

public class FormulaOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int nCommand = Integer.parseInt(scanner.nextLine());

        char[][] matrix = new char[n][n];
        for (int i = 0; i < n; i++) {
            matrix[i] = scanner.nextLine().toCharArray();
        }

        int rowPosition = 0;
        int colPosition = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 'P') {
                    rowPosition = i;
                    colPosition = j;
                    matrix[i][j] = '.';
                    break;
                }

            }
        }

        for (int i = 0; i < nCommand; i++) {
            String command = scanner.nextLine();
            if (command.equals("up")) {
                rowPosition = PositionMinus(matrix, rowPosition);
                if (matrix[rowPosition][colPosition] == 'B') {
                    rowPosition = PositionMinus(matrix, rowPosition);
                }
                if (matrix[rowPosition][colPosition] == 'T') {
                    rowPosition = positionPlus(matrix, rowPosition);
                }


            } else if (command.equals("down")) {


                rowPosition = positionPlus(matrix, rowPosition);
                if (matrix[rowPosition][colPosition] == 'B') {
                    rowPosition = positionPlus(matrix, rowPosition);
                }
                if (matrix[rowPosition][colPosition] == 'T') {
                    rowPosition = PositionMinus(matrix, rowPosition);
                }


            } else if (command.equals("left")) {
                colPosition = PositionMinus(matrix, colPosition);
                if (matrix[rowPosition][colPosition] == 'B') {
                    colPosition = PositionMinus(matrix, colPosition);
                }
                if (matrix[rowPosition][colPosition] == 'T') {
                    colPosition = positionPlus(matrix, colPosition);
                }

            } else if (command.equals("right")) {
                colPosition = positionPlus(matrix, colPosition);
                if (matrix[rowPosition][colPosition] == 'B') {
                    colPosition = positionPlus(matrix, colPosition);
                }
                if (matrix[rowPosition][colPosition] == 'T') {
                    colPosition = PositionMinus(matrix, colPosition);
                }
            }
            if (matrix[rowPosition][colPosition] == 'F') {
                break;
            }

        }


        if (matrix[rowPosition][colPosition] == 'F') {
            System.out.println("Well done, the player won first place!");

        } else {
            System.out.println("Oh no, the player got lost on the track!");
        }
        matrix[rowPosition][colPosition] = 'P';

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }


    private static int positionPlus(char[][] matrix, int position) {
        if (position + 1 > matrix.length - 1) {
            position = 0;
        } else {
            position++;
        }
        return position;
    }

    private static int PositionMinus(char[][] matrix, int position) {
        if (position - 1 < 0) {
            position = matrix.length - 1;
        } else {
            position--;
        }
        return position;
    }
}
