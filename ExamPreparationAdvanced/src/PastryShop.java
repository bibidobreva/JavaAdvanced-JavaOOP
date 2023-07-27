import java.util.ArrayDeque;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class PastryShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> liquid = new ArrayDeque<>();
        ArrayDeque<Integer> ingredient = new ArrayDeque<>();
        Map<String, Integer> foodValue = new LinkedHashMap<>();
        Map<String, Integer> cookedFood = new LinkedHashMap<>();

        cookedFood.put("Biscuit", 0);
        cookedFood.put("Cake", 0);
        cookedFood.put("Pie", 0);
        cookedFood.put("Pastry", 0);


        String[] liquidAmounts = scanner.nextLine().split("\\s+");
        for (int i = 0; i < liquidAmounts.length; i++) {
            liquid.offer(Integer.parseInt(liquidAmounts[i]));
        }
        String[] ingredientAmounts = scanner.nextLine().split("\\s+");
        for (int i = 0; i < ingredientAmounts.length; i++) {
            ingredient.push(Integer.parseInt(ingredientAmounts[i]));
        }


        foodValue.put("Biscuit", 25);
        foodValue.put("Cake", 50);
        foodValue.put("Pie", 100);
        foodValue.put("Pastry", 75);


        while (!liquid.isEmpty() && !ingredient.isEmpty()) {
            int food = liquid.peek() + ingredient.peek();
            if (foodValue.containsValue(food)) {
                String foodToCook = "";
                for (Map.Entry<String, Integer> entry : foodValue.entrySet()) {
                    if (entry.getValue() == food) {
                        foodToCook = entry.getKey();
                        break;
                    }
                }
                cookedFood.put(foodToCook, cookedFood.get(foodToCook) + 1);
                liquid.poll();
                ingredient.pop();

            } else {
                liquid.pop();
                int newIngredient = ingredient.poll() + 3;
                ingredient.push(newIngredient);
            }


        }
        boolean moreThanOne = true;
        for (Map.Entry<String, Integer> entry : cookedFood.entrySet()) {
            if(entry.getValue()<1){
                moreThanOne=false;
                break;
            }
        }
        if(moreThanOne){
            System.out.println("Great! You succeeded in cooking all the food!");
        }else {
            System.out.println("What a pity! You didn't have enough materials to cook everything.");
        }

        if(liquid.isEmpty()){
            System.out.println("Liquids left: none");
        }else {
            System.out.print("Liquids left: ");
            System.out.println(liquid.toString().replaceAll("[\\[\\]]",""));
        }

        if(ingredient.isEmpty()){
            System.out.println("Ingredients left: none");
        }else {
            System.out.print("Ingredients left: ");
            System.out.println(ingredient.toString().replaceAll("[\\[\\]]",""));
        }


        for (Map.Entry<String, Integer> entry : cookedFood.entrySet()) {
            System.out.printf("%s: %d%n",entry.getKey(),entry.getValue());
        }
    }
}
