package StacksAndQueueExsercise;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class ReverseNumbersWithAStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] numbers = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        ArrayDeque<Integer> number = new ArrayDeque<>();

        for (int i = 0; i < numbers.length; i++) {
            number.push(numbers[i]);
        }
        while(!number.isEmpty()){
            System.out.print(number.pop()+" ");
        }

    }
}
