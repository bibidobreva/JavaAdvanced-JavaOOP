import java.util.*;

public class Bombs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<Integer> bombEffect = new ArrayDeque<>();
        ArrayDeque<Integer> bombCasing = new ArrayDeque<>();
        String[] effect = scanner.nextLine().split(", ");
        for (int i = 0; i < effect.length; i++) {
            bombEffect.offer(Integer.parseInt(effect[i]));
        }
        String[] casing = scanner.nextLine().split(", ");
        for (int i = 0; i < casing.length; i++) {
            bombCasing.push(Integer.parseInt(casing[i]));
        }

        Map<String, Integer> bombs = new LinkedHashMap<>();
        //Datura Bombs: 40
        //Cherry Bombs: 60
        //Smoke Decoy Bombs: 120
        bombs.put("Datura Bombs", 40);
        bombs.put("Cherry Bombs",60);
        bombs.put("Smoke Decoy Bombs",120);

        Map<String, Integer> createdBombs = new TreeMap<>();
        createdBombs.put("Datura Bombs",0);
        createdBombs.put("Cherry Bombs",0);
        createdBombs.put("Smoke Decoy Bombs",0);


        boolean isFull = true;

        while(!bombCasing.isEmpty()&&!bombEffect.isEmpty()){
            isFull=true;
            int bombEnergy = bombCasing.peek()+bombEffect.peek();

            if(bombs.containsValue(bombEnergy)){
                for (Map.Entry<String, Integer> entry : bombs.entrySet()) {
                    if(entry.getValue()==bombEnergy){
                        createdBombs.put(entry.getKey(), createdBombs.get(entry.getKey())+1);
                        bombEffect.poll();
                        bombCasing.pop();
                        break;
                    }
                }

            }else {
                int newBombCasing = bombCasing.pop()-5;
                bombCasing.push(newBombCasing);
            }


            for (Map.Entry<String, Integer> entry : createdBombs.entrySet()) {
                if(entry.getValue()<3){
                    isFull=false;
                    break;
                }
            }
            if(isFull){
                break;
            }
        }

        if(isFull){
            System.out.println("Bene! You have successfully filled the bomb pouch!");
        }else {
            System.out.println("You don't have enough materials to fill the bomb pouch.");
        }

        if(bombEffect.isEmpty()){
            System.out.println("Bomb Effects: empty");
        }else {
            System.out.print("Bomb Effects: ");
            System.out.println(bombEffect.toString().replaceAll("[\\[\\]]",""));
        }

        if(bombCasing.isEmpty()){
            System.out.println("Bomb Casings: empty");
        }else {
            System.out.print("Bomb Casings: ");
            System.out.println(bombCasing.toString().replaceAll("[\\[\\]]",""));
        }

        for (Map.Entry<String, Integer> entry : createdBombs.entrySet()) {
            System.out.printf("%s: %d%n",entry.getKey(), entry.getValue());
        }


    }
}
