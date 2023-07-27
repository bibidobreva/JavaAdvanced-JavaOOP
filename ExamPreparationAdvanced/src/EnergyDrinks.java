import java.util.ArrayDeque;
import java.util.Scanner;

public class EnergyDrinks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] milligramsOfCaffeine = scanner.nextLine().split(", ");
        String[] energyDrinks = scanner.nextLine().split(", ");

        ArrayDeque<Integer> caffeine = new ArrayDeque<>();
        ArrayDeque<Integer> drinks = new ArrayDeque<>();

        for (int i = 0; i < milligramsOfCaffeine.length; i++) {
            caffeine.push(Integer.parseInt(milligramsOfCaffeine[i]));
        }
        for (int i = 0; i < energyDrinks.length; i++) {
            drinks.offer(Integer.parseInt(energyDrinks[i]));
        }

        int totalCaffeine = 0;

        while (!caffeine.isEmpty() && !drinks.isEmpty()) {

            int caffeineIntake = caffeine.peek() * drinks.peek();
            if(caffeineIntake+totalCaffeine<=300){
                totalCaffeine+=caffeineIntake;
                caffeine.pop();
                drinks.poll();
            }else {
                caffeine.pop();
                int drinkToLast = drinks.poll();
                drinks.offer(drinkToLast);
                if(totalCaffeine-30>=0){
                    totalCaffeine-=30;
                }else {
                    totalCaffeine=0;
                }
            }

        }


        if(!drinks.isEmpty()){
            System.out.print("Drinks left: ");
            System.out.println(drinks.toString().replaceAll("[\\[\\]]",""));
        }else {
            System.out.println("At least Stamat wasn't exceeding the maximum caffeine.");
        }

        System.out.printf("Stamat is going to sleep with %d mg caffeine.",totalCaffeine);
    }
}
