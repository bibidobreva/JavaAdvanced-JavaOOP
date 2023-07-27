import java.util.Scanner;

public class MaximumSumOf2x2Submatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] rowCol = scanner.nextLine().split(", ");
        int rows = Integer.parseInt(rowCol[0]);
        int cols = Integer.parseInt(rowCol[1]);

        int[][] data = new int[rows][cols];

        for (int i = 0; i < data.length; i++) {
            String[] column = scanner.nextLine().split(", ");
            for (int j = 0; j < data[i].length; j++) {
                data[i][j] = Integer.parseInt(column[j]);
            }
        }
        int max = Integer.MIN_VALUE;
        int topIndex = -1;
        int topLastIn = -1;
        for (int i = 0; i < data.length-1; i++) {
            for (int j = 0; j < data[i].length-1; j++) {
                int currentSum = data[i][j] + data[i][j + 1] + data[i + 1][j] + data[i + 1][j + 1];
                if(currentSum>max){
                    max=currentSum;
                    topIndex=i;
                    topLastIn = j;
                }
            }
        }
        System.out.println(data[topIndex][topLastIn]+" "+data[topIndex][topLastIn+1]);
        System.out.println(data[topIndex+1][topLastIn]+" "+data[topIndex+1][topLastIn+1]);
        System.out.println(max);
    }
}
