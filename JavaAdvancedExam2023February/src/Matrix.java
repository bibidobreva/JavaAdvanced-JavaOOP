import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] nM = scanner.nextLine().split("\\s+");
        int n = Integer.parseInt(nM[0]);
        int m = Integer.parseInt(nM[1]);

        char[][] matrix = new char[n][m];
        for (int i = 0; i < n; i++) {
            matrix[i] = scanner.nextLine().replaceAll(" ", "").toCharArray();
        }

        int row = 0;
        int col = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(matrix[i][j]=='B'){
                    row=i;
                    col=j;
                    matrix[i][j]='-';
                    break;
                }
            }
        }

        int touchedOpponents = 0;
        int moves = 0;
        String command;
        while(!(command=scanner.nextLine()).equals("Finish")){
            if(command.equals("up")){
                row--;
                if(row<0){
                    row++;
                    continue;
                }
                if(matrix[row][col]=='O'){
                    row++;
                    continue;
                }
            } else if (command.equals("down")) {
                row++;
                if(row>n-1){
                    row--;
                    continue;
                }
                if(matrix[row][col]=='O'){
                    row--;
                    continue;
                }
            } else if (command.equals("left")) {
                col--;
                if(col<0){
                    col++;
                    continue;
                }
                if(matrix[row][col]=='O'){
                    col++;
                    continue;
                }
            } else if (command.equals("right")) {
                col++;
                if(col>m-1){
                    col--;
                    continue;
                }
                if(matrix[row][col]=='O'){
                    col--;
                    continue;
                }
            }


            if(matrix[row][col]=='P'){
                touchedOpponents++;
                moves++;
                matrix[row][col]='-';
            } else if (matrix[row][col]=='-') {
                moves++;
            }
            if(touchedOpponents==3){
                break;
            }
        }
        System.out.println("Game over!");
        System.out.printf("Touched opponents: %d Moves made: %d%n",touchedOpponents,moves);
    }
}
