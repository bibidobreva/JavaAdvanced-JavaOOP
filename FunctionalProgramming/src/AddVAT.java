import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class AddVAT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UnaryOperator<Double> addVat= d->d*1.2;
        Consumer<Double> print= num-> System.out.printf("%.2f%n",num);
        Function<String, Double> parse = e->Double.parseDouble(e);
        System.out.println("Prices with VAT:");
        Arrays.stream(scanner.nextLine().split(", ")).map(e->parse.apply(e))
                .map(e->addVat.apply(e)).forEach(e->print.accept(e));
    }
}
