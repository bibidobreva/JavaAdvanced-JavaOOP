import java.util.Scanner;

public class FillTheMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(", ");
        int size = Integer.parseInt(input[0]);
        String method = input[1];
        int[][] cube = new int[size][size];

        if (method.equals("A")) {
            cube = MethodA(size);
        } else if (method.equals("B")) {
            cube = MethodB(size);
        }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(cube[i][j]+" ");
            }
            System.out.println("");
        }


    }

    public static int[][] MethodA(int size) {
        int[][] cube = new int[size][size];
        int num = 1;
        for (int i = 0; i < cube.length; i++) {
            for (int j = 0; j < cube.length; j++) {
                cube[j][i] = num;
                num++;
            }
        }
        return cube;
    }

    public static int[][] MethodB(int size) {
        int[][] cube = new int[size][size];
        int num = 1;

            for (int i = 0; i < size; i++) {
                if (i % 2 == 0) {
                    for (int j = 0; j < size; j++) {
                        cube[j][i] = num;
                        num++;
                    }
                } else {
                    for (int j = size - 1; j >= 0; j--) {
                        cube[j][i] = num;
                        num++;
                    }
                }

            }


        return cube;
    }
}
