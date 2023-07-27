import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TreasureHunt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nM = scanner.nextLine().split("\\s+");
        int n = Integer.parseInt(nM[0]);
        int m = Integer.parseInt(nM[1]);

        char[][] matrix = new char[n][m];
        List<String> directions = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            matrix[i] = scanner.nextLine().replaceAll(" ", "").toCharArray();
        }
        int row = 0;
        int col = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(matrix[i][j]=='Y'){
                    row=i;
                    col=j;
                    break;
                }
            }
        }

        String command;
        while(!(command=scanner.nextLine()).equals("Finish")){
            directions.add(command);

            if(command.equals("up")){
                row--;
                if(row<0){
                    row++;
                    directions.remove(directions.size()-1);
                }
                if(matrix[row][col]=='T'){
                    row++;
                    directions.remove(directions.size()-1);
                }
            } else if (command.equals("down")) {
                row++;
                if(row>n-1){
                    row--;
                    directions.remove(directions.size()-1);
                }
                if(matrix[row][col]=='T'){
                    row--;
                    directions.remove(directions.size()-1);
                }
            } else if (command.equals("left")) {
               col--;
               if(col<0){
                   col++;
                   directions.remove(directions.size()-1);
               }
                if(matrix[row][col]=='T'){
                    col++;
                    directions.remove(directions.size()-1);
                }
            } else if (command.equals("right")) {
               col++;
               if(col>m-1){
                   col--;
                   directions.remove(directions.size()-1);
               }
                if(matrix[row][col]=='T'){
                    col--;
                    directions.remove(directions.size()-1);
                }
            }
            if(matrix[row][col]=='X'){
                break;
            }

        }
        if(matrix[row][col]=='X'){
            System.out.println("I've found the treasure!");
            System.out.print("The right path is ");
            System.out.println(directions.toString().replaceAll("[\\[\\]]",""));
        }else {
            System.out.println("The map is fake!");
        }
    }
}
