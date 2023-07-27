package StacksAndQueueExsercise;

import java.util.ArrayDeque;
import java.util.Scanner;

public class MaximumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        ArrayDeque<Integer> numbers = new ArrayDeque<>();
        ArrayDeque<Integer> maxNumber = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            String [] commandInput = scanner.nextLine().split("\\s+");
            String command = commandInput[0];
            
            if(command.equals("1")){
                int element = Integer.parseInt(commandInput[1]);
                numbers.push(element);
                if(maxNumber.isEmpty()){
                    maxNumber.push(element);
                }else if(element>maxNumber.peek()){
                    maxNumber.push(element);
                }

            } else if (command.equals("2")) {
                if(numbers.peek()==maxNumber.peek()){
                    maxNumber.pop();
                }
                numbers.pop();
                
            } else if (command.equals("3")) {
                System.out.println(maxNumber.peek());
            }


        }
        
        



    }
}
