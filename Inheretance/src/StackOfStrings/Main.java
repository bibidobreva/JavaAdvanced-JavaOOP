package StackOfStrings;

public class Main {
    public static void main(String[] args) {
        StackOfStrings stack = new StackOfStrings();
        stack.push("hahah");
        stack.push("sass");
        stack.push("2333");
        stack.push("hahasd");
        System.out.println( stack.peek());
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        System.out.println(stack.isEmpty());
    }
}
