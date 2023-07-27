import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Phonebook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> phoneBook = new HashMap<>();

        String input;
        while(!(input = scanner.nextLine()).equals("search")){
            String name = input.split("-")[0];
            String phone = input.split("-")[1];

            phoneBook.put(name,phone);

        }

        while(!(input=scanner.nextLine()).equals("stop")){
            if(phoneBook.containsKey(input)){
                System.out.printf("%s -> %s%n",input,phoneBook.get(input));
            }else {
                System.out.printf("Contact %s does not exist.%n",input);
            }
        }
    }
}
