import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SortEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(", ")).map(elem -> Integer.parseInt(elem)).collect(Collectors.toList());

        numbers.removeIf(num -> num % 2 != 0);
        printSeparator(numbers);
        System.out.println();
        numbers.sort((a,b)->a.compareTo(b));
        printSeparator(numbers);
    }
    private static void printSeparator(List<Integer> list){
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
            if(i<list.size()-1){
                System.out.print(", ");
            }
        }
    }

}
