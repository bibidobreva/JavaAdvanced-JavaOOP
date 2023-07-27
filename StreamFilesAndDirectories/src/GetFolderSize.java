import java.io.File;

public class GetFolderSize {
    public static void main(String[] args) {
        String folderPath = "C:\\Users\\bibid\\OneDrive\\Documents\\Java Advanced\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\Files-and-Streams\\Files-and-Streams";

        File file = new File(folderPath);
        File[] files = file.listFiles();

        System.out.println(file.length());
    }
}
