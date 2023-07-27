import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class ProductShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Map<String, Double>> shops = new TreeMap<>();
        String input;
        while (!(input = scanner.nextLine()).equals("Revision")) {
            String shop = input.split(", ")[0];
            String product = input.split(", ")[1];
            double price = Double.parseDouble(input.split(", ")[2]);
            if (!shops.containsKey(shop)){
                shops.put(shop,new LinkedHashMap<>());
                shops.get(shop).put(product,price);
            }else {
                shops.get(shop).put(product,price);
            }

        }

        for (Map.Entry<String, Map<String, Double>> entry : shops.entrySet()) {
            System.out.println(entry.getKey()+"->");
            for (Map.Entry<String, Double> stringDoubleEntry : entry.getValue().entrySet()) {
                System.out.printf("Product: %s, Price: %.1f%n",stringDoubleEntry.getKey(),stringDoubleEntry.getValue());
            }

        }

    }
}
