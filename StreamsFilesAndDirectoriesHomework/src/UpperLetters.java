import java.io.*;

public class UpperLetters {
    public static void main(String[] args) {

        String path = "C:\\Users\\bibid\\OneDrive\\Documents\\Java Advanced\\04. Java-Advanced-Streams-Files-and-Directories-ResourcesHomework\\04. Java-Advanced-Files-and-Streams-Exercises-Resources";
        String input = path+"\\input.txt";
        String output = path+"\\output.txt";

        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(input));
            PrintStream printWriter = new PrintStream(output)) {
            String line;
            while((line=bufferedReader.readLine())!=null){
                String upperCase = line.toUpperCase();
                printWriter.println(upperCase);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
