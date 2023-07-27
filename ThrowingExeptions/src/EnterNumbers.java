
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EnterNumbers {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        List<Integer> numbers = new ArrayList<>();
        int start = 1;
        int end = 100;
        while (numbers.size() < 10) {

            try {
                start = readNumber(start, end);
                numbers.add(start);

            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println(numbers.toString().replaceAll("[\\[\\]]", ""));
    }



    private static int readNumber(int start, int end) {
        String input = scanner.nextLine();
        int num;
        try {
            num = Integer.parseInt(input);
        } catch (IllegalArgumentException e) {
            throw  new IllegalArgumentException("Invalid Number!",e);
        }
        if(num<=start||num>=end){
            String message = String.format("Your number is not in range %d - 100!",start);
            throw new IllegalArgumentException(message);
        }


        return num;
    }
}
