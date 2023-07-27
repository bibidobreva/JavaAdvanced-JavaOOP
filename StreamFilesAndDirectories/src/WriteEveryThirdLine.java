import java.io.*;

public class WriteEveryThirdLine {
    public static void main(String[] args) {
        String basePath = "C:\\Users\\bibid\\OneDrive\\Documents\\Java Advanced\\04. Java-Advanced-Files-and-Streams-Lab-Resources";
        String inputPath = basePath + "\\input.txt";
        String outPath = basePath + "\\04.CopyBytesOutput.txt";

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(inputPath)); PrintStream printWriter = new PrintStream(outPath)) {
            int lineCount = 1;
            String line = bufferedReader.readLine();
            while (line != null) {
                if (lineCount % 3 == 0) {
                    printWriter.println(line);
                }
                lineCount++;
                line = bufferedReader.readLine();
            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
