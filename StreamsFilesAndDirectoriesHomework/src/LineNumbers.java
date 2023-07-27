import java.io.*;

public class LineNumbers {
    public static void main(String[] args) {
        String path = "C:\\Users\\bibid\\OneDrive\\Documents\\Java Advanced\\04. Java-Advanced-Streams-Files-and-Directories-ResourcesHomework\\04. Java-Advanced-Files-and-Streams-Exercises-Resources";
        String input = path+"\\inputLineNumbers.txt";
        String output = path+"\\05_output.txt";

        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(input)); PrintStream printWrite = new PrintStream(output)) {
            String line;
            int count = 1;
            while((line = bufferedReader.readLine())!=null){
                printWrite.println(count+". "+line);
                count++;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
