import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class ExtractIntegers {
    public static void main(String[] args) throws FileNotFoundException {
        String basePath = "C:\\Users\\bibid\\OneDrive\\Documents\\Java Advanced\\04. Java-Advanced-Files-and-Streams-Lab-Resources";
        String inputPath = basePath + "\\input.txt";
        String outPath = basePath + "\\04.CopyBytesOutput.txt";
        Scanner reader = new Scanner(new FileInputStream(inputPath));

        PrintStream writer = new PrintStream(new FileOutputStream(outPath));

        while (reader.hasNext()){
            if(reader.hasNextInt()){
               writer.println(reader.nextInt());
            }
            reader.next();
        }
    }
}
