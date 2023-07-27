import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CustomComparator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        Comparator<Integer> comparator = ((a, b)->{
            if(a%2==0&&b%2!=0){
                return -1;
            } else if (a%2!=0&&b%2==0) {
                return 1;
            }else return a.compareTo(b);
        });

        numbers.stream().sorted(comparator).forEach(e-> System.out.print(e+" "));

    }
}
