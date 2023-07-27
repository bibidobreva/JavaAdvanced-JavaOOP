import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class SumLines {
    public static void main(String[] args) {

        String path = "C:\\Users\\bibid\\OneDrive\\Documents\\Java Advanced\\04. Java-Advanced-Streams-Files-and-Directories-ResourcesHomework\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
            String line;
            while((line= bufferedReader.readLine())!=null){
                int num = 0;
                for (int i = 0; i < line.length(); i++) {
                    num+=line.charAt(i);
                }
                System.out.println(num);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
