import java.util.Scanner;

public class Snake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        char[][] matrix = new char[n][n];
        for (int i = 0; i < n; i++) {
            matrix[i] = scanner.nextLine().toCharArray();
        }
        int rowPosition = 0;
        int colPosition = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 'S') {
                    rowPosition = i;
                    colPosition = j;
                    matrix[i][j] = '.';
                    break;
                }
            }
        }

        int foodEaten = 0;
        boolean isOut = false;
        while (foodEaten < 10) {
            String command = scanner.nextLine();
            if (command.equals("up")) {
                rowPosition --;
                if (rowPosition >= matrix.length || rowPosition < 0) {
                    isOut = true;
                    break;
                }


            } else if (command.equals("down")) {
                rowPosition ++;
                if (rowPosition >= matrix.length || rowPosition < 0) {
                    isOut = true;
                    break;
                }

            } else if (command.equals("left")) {
                colPosition --;
                if (colPosition >= matrix.length || colPosition < 0) {
                    isOut = true;
                    break;
                }


            } else if (command.equals("right")) {
                colPosition ++;
                if (colPosition >= matrix.length || colPosition < 0) {
                    isOut = true;
                    break;
                }

            }

            if (matrix[rowPosition][colPosition] == 'B') {
                matrix[rowPosition][colPosition] = '.';
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        if (matrix[i][j] == 'B') {
                            rowPosition = i;
                            colPosition = j;
                            matrix[rowPosition][colPosition] = '.';
                        }
                    }
                }
            } else if (matrix[rowPosition][colPosition]=='*') {
                foodEaten++;
                matrix[rowPosition][colPosition] = '.';
            }
            matrix[rowPosition][colPosition] = '.';

        }
        if(isOut){
            System.out.println("Game over!");
        }else {
            System.out.println("You won! You fed the snake.");
            matrix[rowPosition][colPosition] = 'S';
        }

        System.out.println("Food eaten: "+foodEaten);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }

    }




}
