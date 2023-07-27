import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class FindEvensOrOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] numbers = scanner.nextLine().split("\\s+");
        int lowerBound = Integer.parseInt(numbers[0]);
        int upperBound = Integer.parseInt(numbers[1]);

        String oddOrEven = scanner.nextLine();


        Predicate<Integer> filterCondition = oddOrEven.equals("odd") ?  x->x%2!=0 : x->x%2==0;
        IntStream.range(lowerBound,upperBound+1)
                .filter(n->filterCondition.test(n)).forEach(n-> System.out.print(n+" "));
    }
}
