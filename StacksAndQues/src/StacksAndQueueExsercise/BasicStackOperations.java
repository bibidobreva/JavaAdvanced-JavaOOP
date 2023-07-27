package StacksAndQueueExsercise;

import java.util.*;
import java.util.stream.Collectors;

public class BasicStackOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] command = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        int toPush = command[0];
        int toPop = command[1];
        int presentNumber = command[2];

        List<Integer> numbersInput = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());


        Deque<Integer> numbers = new ArrayDeque<>();


        for (int i = 0; i < toPush; i++) {
            numbers.push(numbersInput.get(i));
        }
        for (int i = 0; i < toPop; i++) {
            if (!numbers.isEmpty()) {
                numbers.pop();
            }
        }

        if (numbers.contains(presentNumber)) {
            System.out.println("true");
        } else if (numbers.isEmpty()) {
            System.out.println(0);
        } else {
//            int min = Integer.MAX_VALUE;
//            while (!numbers.isEmpty()) {
//                int current = numbers.pop();
//                if (current < min) {
//                    min = current;
//                }
//            }
            System.out.println(Collections.min(numbers));
        }

    }
}
