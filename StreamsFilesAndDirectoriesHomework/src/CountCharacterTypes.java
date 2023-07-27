import java.io.*;

public class CountCharacterTypes {
    public static void main(String[] args) {
        String path = "C:\\Users\\bibid\\OneDrive\\Documents\\Java Advanced\\04. Java-Advanced-Streams-Files-and-Directories-ResourcesHomework\\04. Java-Advanced-Files-and-Streams-Exercises-Resources";
        String input = path+"\\input.txt";
        String output = path+"\\04_output.txt";
        
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(input)); PrintStream printWriter = new PrintStream(output)) {
            String line;
            int vowels = 0;
            int other = 0;
            int punctuation = 0;
            while((line = bufferedReader.readLine())!=null){
                for (int i = 0; i < line.length(); i++) {
                    String type = ReturnType(line.charAt(i));
                    if(type.equals("vowel")){
                        vowels++;
                    } else if (type.equals("punctuation")) {
                        punctuation++;
                    } else if (type.equals("other")) {
                        other++;
                    }
                }


            }
            printWriter.println("Vowels: "+vowels);
            printWriter.println("Other symbols: "+other);
            printWriter.println("Punctuation: "+punctuation);
            
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static String ReturnType(char a){
        String returnResult = "";
        if(a=='a'||a=='e'||a=='u'||a=='o'||a=='i'){
            returnResult="vowel";
        } else if (a=='!'||a==','||a=='.'||a=='?') {
            returnResult =  "punctuation";
        } else if (a!=' ') {
            returnResult="other";
        }
return returnResult;
    }
}
