package PointInRectangle;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] pointsCoordinates = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int x1 = pointsCoordinates[0];
        int y1 = pointsCoordinates[1];
        int x2 = pointsCoordinates[2];
        int y2 = pointsCoordinates[3];

        Point first = new Point(x1,y1);
        Point second = new Point(x2,y2);
        Rectangle rectangle = new Rectangle(first,second);

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            int [] points = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
            int x = points[0];
            int y = points[1];
            Point pointToSearch = new Point(x, y);
            System.out.println(rectangle.contains(pointToSearch));
        }
    }
}
