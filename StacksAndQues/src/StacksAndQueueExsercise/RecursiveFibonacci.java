package StacksAndQueueExsercise;

import java.util.ArrayDeque;
import java.util.Scanner;

public class RecursiveFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        ArrayDeque<Long> fibonacci = new ArrayDeque<>();
        fibonacci.push(0L);
        long previousFibonacci = 1;

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i <= n; i++) {
            long nextFibonacci = fibonacci.peek() + previousFibonacci;
            previousFibonacci = fibonacci.peek();
            fibonacci.push(nextFibonacci);
        }

        if (n < 2) {
            System.out.println(1);
        } else {
            System.out.println(fibonacci.peek());
        }

    }
}
