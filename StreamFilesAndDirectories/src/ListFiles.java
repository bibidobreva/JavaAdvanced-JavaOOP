import java.io.File;

public class ListFiles {
    public static void main(String[] args) {
        String folderPath = "C:\\Users\\bibid\\OneDrive\\Documents\\Java Advanced\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\Files-and-Streams\\Files-and-Streams";

        File file = new File(folderPath);
        File[] nestledFiles = file.listFiles();

        for(File nestled: nestledFiles){
            if(nestled.isFile()){
                System.out.printf("%s: [%d]%n",nestled.getName(),nestled.length());
            }
        }
    }
}
