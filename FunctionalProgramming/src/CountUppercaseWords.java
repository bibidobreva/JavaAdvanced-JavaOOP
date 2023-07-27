import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CountUppercaseWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Predicate<String> startUpperCase = word->Character.isUpperCase(word.charAt(0));
        Consumer<String> print = word -> System.out.println(word);
        List<String> words = Arrays.stream(scanner.nextLine().split(" ")).filter(e->startUpperCase.test(e)).collect(Collectors.toList());
        System.out.println(words.size());
        words.forEach(e->print.accept(e));

    }
}
