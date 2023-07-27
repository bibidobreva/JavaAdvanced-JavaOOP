package StacksAndQueueExsercise;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
import java.util.Scanner;

public class BasicQueueOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] commands = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int toOffer = commands[0];
        int toPoll = commands[1];
        int presentNum = commands[2];

        int [] numbersInput = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        ArrayDeque<Integer> numbers = new ArrayDeque<>();
        for (int i = 0; i < toOffer; i++) {
            numbers.offer(numbersInput[i]);
        }
        for (int i = 0; i < toPoll; i++) {
            numbers.poll();
        }

        if(numbers.contains(presentNum)){
            System.out.println("true");
        } else if (numbers.isEmpty()) {
            System.out.println(0);
        }else{
            int min = Integer.MAX_VALUE;
            while(!numbers.isEmpty()){
                int current = numbers.poll();
                if(current<min){
                    min=current;
                }
            }
            System.out.println(min);
        }
    }
}
