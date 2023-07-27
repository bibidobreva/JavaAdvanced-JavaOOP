import java.util.Scanner;

public class RallyRacing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        char[][] matrix = new char[n][n];
        String racingCarNumber = scanner.nextLine();

        for (int i = 0; i < n; i++) {
            matrix[i] = scanner.nextLine().replaceAll(" ","").toCharArray();
        }
        int row = 0;
        int col = 0;
        int km = 0;

        String command;
        while(!(command=scanner.nextLine()).equals("End")){

            if(command.equals("up")){
                row--;
            } else if (command.equals("down")) {
                row++;
            } else if (command.equals("left")) {
                col--;
            } else if (command.equals("right")) {
                col++;
            }

            if(matrix[row][col]=='T'){
                matrix[row][col]='.';
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        if(matrix[i][j]=='T'){
                            row=i;
                            col=j;
                            matrix[i][j]='.';
                        }
                    }
                }
                km+=30;
            }else {
                km+=10;
            }
            if(matrix[row][col]=='F'){
                break;
            }



        }
        if(matrix[row][col]=='F'){
            System.out.printf("Racing car %s finished the stage!%n",racingCarNumber);

        }else {
            System.out.printf("Racing car %s DNF.%n",racingCarNumber);
        }
        matrix[row][col] = 'C';

        System.out.printf("Distance covered %d km.%n",km);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }

    }
}
