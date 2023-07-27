package Froggy;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        Integer[] collection = Arrays.stream(line.split(", ")).map(Integer::parseInt).toArray(Integer[]::new);
        Lake lake = new Lake(collection);
        Iterator<Integer> iterator = lake.iterator();
        String input = scanner.nextLine();

        while (true) {
            if (input.equals("END")) {
                while (iterator.hasNext()) {
                    list.add(iterator.next());
                }
                System.out.println(list.toString().replaceAll("[\\[\\]]", ""));
                break;
            }
        }
    }
}
