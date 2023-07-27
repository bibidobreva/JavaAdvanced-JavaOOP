package StacksAndQueueExsercise;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class BalancedParentheses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] input = scanner.nextLine().split("");
        int n =(input.length)/2;

        ArrayDeque<String> openingBrackets = new ArrayDeque<>();
        ArrayDeque<String> closingBrackets = new ArrayDeque<>();

        String opposite = "";
        for (int i = 0; i < n; i++) {
            String current = input[i];
            if(current.equals("(")){
                opposite=")";
            } else if (current.equals("[")) {
                opposite="]";
            } else if (current.equals("{")) {
                opposite="}";
            }
            openingBrackets.push(opposite);

        }
        for (int i = n; i <input.length ; i++) {
            String current = input[i];
            closingBrackets.offer(current);
        }

        boolean isBalanced = true;
        while(!openingBrackets.isEmpty()){
            String opening = openingBrackets.pop();
            String closing = closingBrackets.poll();

            if(!opening.equals(closing)){
                isBalanced = false;
            }

        }
        if(input.length%2!=0){
            isBalanced=false;
        }
        if(isBalanced){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }

    }
}
