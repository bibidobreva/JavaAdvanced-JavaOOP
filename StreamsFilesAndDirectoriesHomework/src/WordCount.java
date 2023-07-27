import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class WordCount {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\bibid\\OneDrive\\Documents\\Java Advanced\\04. Java-Advanced-Streams-Files-and-Directories-ResourcesHomework\\04. Java-Advanced-Files-and-Streams-Exercises-Resources";
        String inputOne = path + "\\words.txt";
        String inputTwo = path + "\\text.txt";
        String output = path + "\\results02.txt";
        PrintStream printStream = new PrintStream(output);


        List<String> words = Files.readAllLines(Path.of(inputOne));

        List <String> text = Files.readAllLines(Path.of(inputTwo));
        String[] word1 = words.get(0).split("\\s+");
        for (int i = 0; i < word1.length; i++) {
            int sum = 0;
            String currentWord = word1[i];
            for (int j = 0; j < text.size(); j++) {
                String[] currentWordLine = text.get(j).split(" ");
                for(String word: currentWordLine){
                    if(word.equals(currentWord)){
                        sum++;
                    }
                }

            }
            printStream.println(currentWord+" - "+sum);
        }

    }
}
