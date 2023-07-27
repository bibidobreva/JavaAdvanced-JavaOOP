import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class SortLines {
    public static void main(String[] args) throws IOException {
        String basePath = "C:\\Users\\bibid\\OneDrive\\Documents\\Java Advanced\\04. Java-Advanced-Files-and-Streams-Lab-Resources";
        String inputPath = basePath + "\\input.txt";
        String outPath = basePath + "\\06.CopyBytesOutput.txt";

        Path path  = Paths.get(inputPath);
       List<String> sortedLines= Files.readAllLines(path).stream().sorted().collect(Collectors.toList());

       Path output = Paths.get(outPath);
       Files.write(output,sortedLines);
    }
}
