import java.util.Scanner;

public class FindTheRealQueen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[][] chessboard = new char[8][8];

        for (int i = 0; i < chessboard.length; i++) {
            chessboard[i] = scanner.nextLine().replace(" ", "").toCharArray();
        }
        for (int i = 0; i < chessboard.length; i++) {
            for (int j = 0; j < chessboard[i].length; j++) {
                char current = chessboard[i][j];
                if (current == 'q') {
                    boolean trueQueen = isTheRealQueen(chessboard,i,j);
                    if(trueQueen){
                        System.out.println(i+" "+j);
                        return;
                    }
                }
            }
        }

    }

    public static boolean isTheRealQueen(char[][] chess, int row, int col) {
        boolean isTrue = true;
        int count = 0;
        for (int i = 0; i < chess.length; i++) {
            if (chess[row][i] == 'q') {
                count++;
            }
        }
        for (int i = 0; i < chess.length; i++) {
            if (chess[i][row] == 'q') {
                count++;
            }
        }
        if (count > 2) {
            isTrue = false;
        }
        return isTrue;
    }
}
