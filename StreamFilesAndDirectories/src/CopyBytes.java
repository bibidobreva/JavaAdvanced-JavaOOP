import java.io.*;
import java.util.Scanner;

public class CopyBytes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String basePath = "C:\\Users\\bibid\\OneDrive\\Documents\\Java Advanced\\04. Java-Advanced-Files-and-Streams-Lab-Resources";
        String inputPath = basePath + "\\input.txt";
        String outPath = basePath + "\\03.CopyBytesOutput.txt";

        try(InputStream inputStream = new FileInputStream(inputPath);
            OutputStream outputStream = new FileOutputStream(outPath)){
            int readByte = inputStream.read();

            while (readByte>=0){
                if(readByte==10|| readByte==32){
                    outputStream.write(readByte);
                }else{
                    String number = String.valueOf(readByte);
                    for (int i = 0; i < number.length(); i++) {
                        outputStream.write(number.charAt(i));
                    }

                }
                readByte = inputStream.read();
            }

        } catch (IOException e) {

            throw new RuntimeException(e);
        }


    }
}
