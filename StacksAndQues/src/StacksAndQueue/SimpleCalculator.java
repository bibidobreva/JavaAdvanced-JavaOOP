package StacksAndQueue;

import java.util.*;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String expression = scanner.nextLine();
        String[] expressionParts = expression.split(" ");
        ArrayDeque<String> stack = new ArrayDeque<>();

        List<String> partList = Arrays.asList(expressionParts);
        Collections.reverse(partList);

        for(String s:partList){
            stack.push(s);
        }

        while(stack.size()>1){
            int first = Integer.parseInt(stack.pop());
            String op = stack.pop();
            int last = Integer.parseInt(stack.pop());
            int result =0;

            switch (op){
                case "+": result = first+last; break;
                case "-": result = first-last; break;
                default:
                    System.out.println("Unknown");
                    return;

            }
            stack.push(""+result);
        }
        System.out.println(stack.peek());
    }
}
