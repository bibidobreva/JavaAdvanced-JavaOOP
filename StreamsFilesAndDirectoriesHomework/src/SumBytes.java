import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class SumBytes {
    public static void main(String[] args) {
        String path = "C:\\Users\\bibid\\OneDrive\\Documents\\Java Advanced\\04. Java-Advanced-Streams-Files-and-Directories-ResourcesHomework\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
            int sum = 0;
            String line;
            while((line = bufferedReader.readLine())!=null){
                for (int i = 0; i < line.length(); i++) {
                    sum+=line.charAt(i);
                }
            }
            System.out.println(sum);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
