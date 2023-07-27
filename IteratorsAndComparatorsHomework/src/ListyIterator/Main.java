package ListyIterator;


import java.util.Arrays;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ListyIterator listyIterator = new ListyIterator();
        String command;
        while (!(command = scanner.nextLine()).equals("END")) {
            if (command.equals("Move")) {
                System.out.println(listyIterator.Move());
            } else if (command.equals("Print")){
                try{
                    listyIterator.Print();
                }catch (IllegalStateException ex){
                    System.out.println(ex.getMessage());
                }
            } else if (command.equals("HasNext")) {
                System.out.println(listyIterator.hasNext());
            } else if (command.contains("Create")) {
                String[] create = command.split("\\s+");
                if (create.length > 1) {
                    listyIterator = new ListyIterator(Arrays.copyOfRange(create, 1, create.length));
                }
            } else if (command.equals("PrintAll")) {
                listyIterator.forEach(e-> System.out.print(e+" "));
                System.out.println();
            }
        }
    }
}
