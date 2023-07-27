package StackIterator;


import javax.naming.OperationNotSupportedException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StackIterator stack = new StackIterator();
        String command;
        while (!(command = scanner.nextLine()).equals("END")) {
            if (command.contains("Push")) {
                String[] parameters = command.replaceAll(",", "").split("\\s+");
                for (int i = 1; i < parameters.length; i++) {
                    stack.push(Integer.parseInt(parameters[i]));
                }

            } else if (command.equals("Pop")) {
                try {
                    stack.pop();
                } catch (OperationNotSupportedException ex) {
                    System.out.println("No elements");
                }
            }
        }
        stack.forEach(System.out::println);
        stack.forEach(System.out::println);

    }
}
