import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class SoftUniParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<String> quests = new TreeSet<>();
        String party;
        while (!(party = scanner.nextLine()).equals("PARTY")) {
            quests.add(party);
        }

        String end;
        while (!(end = scanner.nextLine()).equals("END")) {
            quests.remove(end);
        }
        int notShow = quests.size();
        System.out.println(notShow);
        if (!quests.isEmpty()) {
            for (String quest : quests) {
                System.out.println(quest);
            }


        }
    }
}
