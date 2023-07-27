import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class AppliedArithmetics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        String command;
        while (!(command = scanner.nextLine()).equals("end")) {
            if (command.equals("print")) {
                printNumbers(numbers);
                System.out.println();
            } else if (command.equals("add")) {
               numbers = numbers.stream().map(e -> e + 1).collect(Collectors.toList());

            } else if (command.equals("multiply")) {
              numbers=  numbers.stream().map(e -> e * 2).collect(Collectors.toList());

            } else if (command.equals("subtract")) {
                numbers=numbers.stream().map(e -> e - 1).collect(Collectors.toList());
            }
        }
    }


    public static void printNumbers(List<Integer> num) {
        num.stream().forEach(e -> System.out.print(e + " "));
    }

}
