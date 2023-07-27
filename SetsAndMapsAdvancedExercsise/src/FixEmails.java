import javax.security.sasl.SaslClient;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FixEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name;
        Map<String, String> nameEmail = new LinkedHashMap<>();
        while(!(name=scanner.nextLine()).equals("stop")){
            String email = scanner.nextLine();
            nameEmail.put(name,email);
        }
        for (Map.Entry<String, String> entry : nameEmail.entrySet()) {
            if(entry.getValue().endsWith(".uk")||entry.getValue().endsWith(".us")||entry.getValue().endsWith(".com")){

            }else {
                System.out.printf("%s -> %s%n",entry.getKey(),entry.getValue());
            }
        }

    }
}
