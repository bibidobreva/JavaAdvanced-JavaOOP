import java.util.*;

public class ClimbThePeaks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> counteredPicks = new ArrayList<>();
        ArrayDeque<Integer> food = new ArrayDeque<>();
        ArrayDeque<Integer> stamina = new ArrayDeque<>();

        String[] foodPortions = scanner.nextLine().split(", ");
        for (int i = 0; i < foodPortions.length; i++) {
            food.push(Integer.parseInt(foodPortions[i]));
        }
        String[] staminaEnergy = scanner.nextLine().split(", ");
        for (int i = 0; i < staminaEnergy.length; i++) {
            stamina.offer(Integer.parseInt(staminaEnergy[i]));
        }


        Map<String, Integer> peaks = new LinkedHashMap<>();
        peaks.put("Vihren", 80);
        peaks.put("Kutelo", 90);
        peaks.put("Banski Suhodol", 100);
        peaks.put("Polezhan", 60);
        peaks.put("Kamenitza", 70);

        for (int i = 0; i < 7; i++) {
            if (peaks.isEmpty()) {

                break;
            }
            int dailyStamina = food.pop() + stamina.poll();

            if (dailyStamina >= peaks.entrySet().iterator().next().getValue()) {
                String peak = peaks.entrySet().iterator().next().getKey();
                counteredPicks.add(peak);
                peaks.remove(peak);
            }

        }
        if (!peaks.isEmpty()) {
            System.out.println("Alex failed! He has to organize his journey better next time -> @PIRINWINS");
        }else {
            System.out.println("Alex did it! He climbed all top five Pirin peaks in one week -> @FIVEinAWEEK");
        }

        if (peaks.size() != 5) {
            System.out.println("Conquered peaks:");
        }

        for (String peak : counteredPicks) {
            System.out.println(peak);
        }


    }
}
