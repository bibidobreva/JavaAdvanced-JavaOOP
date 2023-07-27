import java.util.Scanner;

public class MatrixShuffling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputV = scanner.nextLine().split("\\s+");

        int rows = Integer.parseInt(inputV[0]);
        int cols = Integer.parseInt(inputV[1]);

        String[][] matrix = new String[rows][cols];
        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = scanner.nextLine().split("\\s+");
        }

        String input;
        while (!(input = scanner.nextLine()).equals("END")) {
            if (input.contains("swap")) {
                String[] inputValues = input.split("\\s+");
                if (inputValues.length != 5) {
                    System.out.println("Invalid input!");
                    continue;
                } else {
                    int firstRow = Integer.parseInt(inputValues[1]);
                    int firstCol = Integer.parseInt(inputValues[2]);
                    int secondRow = Integer.parseInt(inputValues[3]);
                    int secondCol = Integer.parseInt(inputValues[4]);
                    if(firstRow>=rows||firstRow<0||secondRow>=rows||secondRow<0||firstCol>=cols||firstCol<0||secondCol>=cols||secondCol<0){
                        System.out.println("Invalid input!");
                        continue;
                    }


                    String first = matrix[firstRow][firstCol];
                    String second = matrix[secondRow][secondCol];
                    matrix[firstRow][firstCol] = second;
                    matrix[secondRow][secondCol] = first;


                }


            } else {
                System.out.println("Invalid input!");
            }
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    System.out.print(matrix[i][j]+" ");
                }
                System.out.println("");
            }


        }
    }
}

