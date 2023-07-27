package StacksAndQueue;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BrowserHistoryUpgrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> history = new ArrayDeque<>();
        ArrayDeque<String> forward = new ArrayDeque<>();

        String input;
        while (!(input = scanner.nextLine()).equals("Home")){

            if(input.equals("back")){
                if(history.size()>1){
                    forward.push(history.peek());
                    history.pop();
                    System.out.println(history.peek());
                }else {
                    System.out.println("no previous URLs");
                }

            } else if (input.equals("forward")) {
                if(!forward.isEmpty()){
                    history.push(forward.peek());
                    System.out.println(forward.pop());
                }else {
                    System.out.println("no next URLs");
                }


            }else {
                System.out.println(input);
                history.push(input);
                if(!forward.isEmpty()){
                    forward.clear();
                }
            }


        }

    }
}
