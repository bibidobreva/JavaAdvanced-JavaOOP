package StacksAndQueueExsercise;

import java.util.ArrayDeque;
import java.util.Scanner;

public class SimpleTextEditor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        StringBuilder currentText = new StringBuilder();
        ArrayDeque<String> textArchive = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            String commandInput = scanner.nextLine();
            String command = commandInput.split("\\s+")[0];

            if (command.equals("1")) {
                textArchive.push(currentText.toString());
                String textToAppend = commandInput.split("\\s+")[1];
                currentText.append(textToAppend);


            } else if (command.equals("2")) {
                textArchive.push(currentText.toString());
                int count = Integer.parseInt(commandInput.split("\\s+")[1]);
                int firstIndex = currentText.length()-count;
                currentText.delete(firstIndex, currentText.length());


            } else if (command.equals("3")) {
                int index = Integer.parseInt(commandInput.split("\\s+")[1]);
                System.out.println(currentText.charAt(index - 1));
            } else if (command.equals("4")) {
                if (!textArchive.isEmpty()) {
                    String lastText = textArchive.pop().toString();

                    currentText = new StringBuilder(lastText);
                }
            }
        }
    }
}
