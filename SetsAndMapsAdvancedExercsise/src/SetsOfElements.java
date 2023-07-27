import java.util.*;

public class SetsOfElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String []input = scanner.nextLine().split("\\s+");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);

        Set<Integer> first = new LinkedHashSet<>();
        Set<Integer> second = new LinkedHashSet<>();

        for (int i = 0; i < n; i++) {
            int toAdd = Integer.parseInt(scanner.nextLine());
            first.add(toAdd);
        }


        for (int i = 0; i < m; i++) {
            int toAdd = Integer.parseInt(scanner.nextLine());
            second.add(toAdd);
        }

        for(int numberFirst: first){
            for(int numberSecond: second){
                if(numberFirst==numberSecond){
                    System.out.print(numberFirst+" ");
                }
            }


        }


    }
}
