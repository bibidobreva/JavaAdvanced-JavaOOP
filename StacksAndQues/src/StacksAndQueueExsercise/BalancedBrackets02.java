package StacksAndQueueExsercise;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BalancedBrackets02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("");

        ArrayDeque<String> opening = new ArrayDeque<>();
        boolean areBalanced = false;

        for (int i = 0; i < input.length; i++) {
            String current = input[i];
            if (current.equals("(") || current.equals("{") || current.equals("[")) {
                opening.push(current);
            } else if (current.equals(")") || current.equals("}") || current.equals("]")) {
                if(opening.isEmpty()){
                    areBalanced=false;
                    break;
                }
                String open = opening.pop();

                if (current.equals(")") && open.equals("(")) {
                    areBalanced = true;

                } else if (open.equals("{") && current.equals("}")) {
                    areBalanced = true;

                } else if (open.equals("[") && current.equals("]")) {
                    areBalanced = true;
                } else {
                    areBalanced = false;
                    break;
                }


            }

        }
        if (areBalanced) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
