import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateForNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Predicate<String> isEqualOrLess = e->e.length()<=n;
       Arrays.stream(scanner.nextLine().split("\\s+")).filter(e->isEqualOrLess.test(e)).forEach(e-> System.out.println(e));
    }
}
