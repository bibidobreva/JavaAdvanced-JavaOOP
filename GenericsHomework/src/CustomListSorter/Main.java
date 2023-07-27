package CustomListSorter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        CustomList<String> customList = new CustomList<String>();
        while (!(input = scanner.nextLine()).equals("END")) {
            String command = input.split("\\s+")[0];
            switch (command) {

                case "Add":
                    String element = input.split("\\s+")[1];
                    customList.add(element);
                    break;
                case "Remove":
                    int index = Integer.parseInt(input.split("\\s+")[1]);
                    customList.remove(index);
                    break;
                case "Contains":
                    String contain = input.split("\\s+")[1];
                    System.out.println(customList.contains(contain));
                    break;
                case "Swap":
                    int indexOne = Integer.parseInt(input.split("\\s+")[1]);
                    int indexTwo = Integer.parseInt(input.split("\\s+")[2]);
                    customList.swap(indexOne, indexTwo);
                    break;
                case "Greater":
                    String elementGreater = input.split("\\s+")[1];
                    System.out.println(customList.countGreaterThan(elementGreater));
                    break;
                case "Min":
                    System.out.println(customList.getMin());
                    break;
                case "Max":
                    System.out.println(customList.getMax());
                    break;
                case "Print":
                    customList.print();
                    break;
                case"Sort":
                    customList.sort();


            }
        }
    }
}
