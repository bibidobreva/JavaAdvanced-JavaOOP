package StacksAndQueueExsercise;

import java.util.ArrayDeque;
import java.util.Scanner;

public class PolishMath0_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().replace(" ", "");
        char[] characterInput = input.toCharArray();
        ArrayDeque<Character> operatorStack = new ArrayDeque<>();
        ArrayDeque<Character> numQueue = new ArrayDeque<>();

        for (int i = 0; i < characterInput.length; i++) {
            char current = characterInput[i];
            if (current >= '0' && current <= '9') {
                numQueue.offer(current);
            } else if (current == '+' || current == '-' || current == '*' || current == '/' || current == '(' || current == ')') {
                if (current == '+' || current == '-') {
                    if (operatorStack.isEmpty()) {
                        operatorStack.push(current);
                    } else {
                        if (operatorStack.peek() != '(') {
                            char toMove = operatorStack.pop();
                            numQueue.offer(toMove);
                            operatorStack.push(current);

                        } else {
                            operatorStack.push(current);
                        }

                    }


                } else if (current == '*' || current == '/') {
                    if (operatorStack.isEmpty()) {
                        operatorStack.push(current);
                    } else {
                        if (operatorStack.peek() == '*' || operatorStack.peek() == '/') {
                            char toMove = operatorStack.pop();
                            numQueue.offer(toMove);
                            operatorStack.offer(current);
                        } else {
                            operatorStack.offer(current);
                        }
                    }

                } else if (current == '(') {
                    operatorStack.push(current);
                } else if (current == ')') {
                    char toEnd = ')';
                    while (toEnd != '(') {
                        toEnd = operatorStack.peek();
                        char toMove = operatorStack.pop();
                        if (toMove != '(') {
                            numQueue.offer(toMove);
                        }
                    }

                }
            }

        }
        while (!operatorStack.isEmpty()) {
            char toMove = operatorStack.pop();
            numQueue.offer(toMove);
        }
        while (!numQueue.isEmpty()) {
            System.out.print(numQueue.poll() + " ");
        }

    }
}
