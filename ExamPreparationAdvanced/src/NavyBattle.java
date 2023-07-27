import java.util.Scanner;

public class NavyBattle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        char [][] battleField = new char[n][n];
        for (int i = 0; i < n; i++) {
            battleField[i] = scanner.nextLine().toCharArray();
        }
        int rowPosition=0;
        int colPosition = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(battleField[i][j]=='S'){
                    rowPosition = i;
                    colPosition = j;
                    break;
                }
            }
        }
        battleField[rowPosition][colPosition]='-';
        String command;
        int mineCount = 0;
        int cruiser = 0;
        while(true){
            command = scanner.nextLine();
            if(command.equals("up")){
                rowPosition--;
            } else if (command.equals("down")) {
                rowPosition++;
            } else if (command.equals("left")) {
                colPosition--;
            } else if (command.equals("right")) {
                colPosition++;
            }

            if(battleField[rowPosition][colPosition]=='*'){
                mineCount++;
                battleField[rowPosition][colPosition]='-';
                if(mineCount>=3){
                    System.out.printf("Mission failed, U-9 disappeared! Last known coordinates [%d, %d]!%n",rowPosition,colPosition);
                    battleField[rowPosition][colPosition]='S';
                    break;
                }
            } else if (battleField[rowPosition][colPosition]=='C') {
                battleField[rowPosition][colPosition]='-';
                cruiser++;
                if(cruiser>=3){
                    System.out.println("Mission accomplished, U-9 has destroyed all battle cruisers of the enemy!");
                    battleField[rowPosition][colPosition]='S';
                    break;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(battleField[i][j]);
            }
            System.out.println();
        }
    }
}
