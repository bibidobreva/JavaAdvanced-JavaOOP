package StacksAndQueue;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BrowserHistory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> history = new ArrayDeque<>();

        String currentInput;
        while (!(currentInput = scanner.nextLine()).equals("Home")) {

            if (currentInput.equals("back")) {
                if (history.isEmpty()||history.size() == 1) {
                    System.out.println("no previous URLs");
                    continue;
                } else {
                    history.pop();
                }
            } else {
                history.push(currentInput);
            }
            System.out.println(history.peek());

        }

    }
}
