import javax.security.sasl.SaslClient;
import javax.sound.midi.Soundbank;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String filePath = "C:\\Users\\bibid\\OneDrive\\Documents\\Java Advanced\\04. Java-Advanced-Streams-Files-and-Directories-Resources\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt\\";
        try(InputStream inputStream = new FileInputStream(filePath)){
            int readByte = inputStream.read();
            while(readByte>=0){
                System.out.print(Integer.toBinaryString(readByte)+" ");

                readByte=inputStream.read();
            }
        }catch (IOException e){
            throw new RuntimeException(e);
        }

//
    }
}
