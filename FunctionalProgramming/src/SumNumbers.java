import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Function<String, Integer> pharse = n-> Integer.parseInt(n);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(", ")).map(e->pharse.apply(e)).collect(Collectors.toList());
        int sum = numbers.stream().mapToInt(a->a).sum();
        System.out.println("Count = "+numbers.size());
        System.out.println("Sum = "+sum);
    }
}
