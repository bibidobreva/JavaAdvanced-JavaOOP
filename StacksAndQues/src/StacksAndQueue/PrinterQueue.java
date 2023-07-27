package StacksAndQueue;

import java.util.ArrayDeque;
import java.util.Scanner;

public class PrinterQueue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       String currentInput;
        ArrayDeque<String> printer = new ArrayDeque<>();
       while(!(currentInput=scanner.nextLine()).equals("print")){
           if(currentInput.equals("cancel")){
               if(printer.isEmpty()){
                   System.out.println("Printer is on standby");

               }else {
                   System.out.println("Canceled "+ printer.poll());
               }


           }else {
               printer.offer(currentInput);
           }
       }
       while(!printer.isEmpty()){
           System.out.println(printer.poll());
       }
    }
}
