import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class CompareMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] parts = scanner.nextLine().split(" ");
        int firstRows = Integer.parseInt(parts[0]);
        int firstCols = Integer.parseInt(parts[1]);

        int[][] dataFirst = new int[firstRows][firstCols];

        for (int i = 0; i < dataFirst.length; i++) {
            String[] rowNum = scanner.nextLine().split(" ");
            for (int j = 0; j < dataFirst[i].length; j++) {
                dataFirst[i][j] = Integer.parseInt(rowNum[j]);
            }
        }

        String[] partsTwo = scanner.nextLine().split(" ");
        int secondRows = Integer.parseInt(partsTwo[0]);
        int secondCols = Integer.parseInt(partsTwo[1]);

        int[][] dataSecond = new int[secondRows][secondCols];


        for (int i = 0; i < dataSecond.length; i++) {
            String[] input = scanner.nextLine().split(" ");
            for (int j = 0; j < dataSecond[i].length; j++) {
                dataSecond[i][j] = Integer.parseInt(input[j]);
            }
        }
        if(firstRows!=secondRows||firstCols!=secondCols){
            System.out.println("not equal");
            return;
        }

        for (int i = 0; i < dataFirst.length; i++) {
            for (int j = 0; j < dataFirst[i].length; j++) {
                if(dataFirst[i][j]!=dataSecond[i][j]){
                    System.out.println("not equal");
                    return;
                }
            }
        }
        System.out.println("equal");
    }
}
