import java.util.*;
import java.util.stream.Collectors;

public class StacksAndQueues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<Integer> textiles = new ArrayDeque<>();
        ArrayDeque<Integer> medicament = new ArrayDeque<>();

        String[] textilesInput = scanner.nextLine().split("\\s+");
        for (int i = 0; i < textilesInput.length; i++) {
            textiles.offer(Integer.parseInt(textilesInput[i]));
        }
        String[] medicamentsInput = scanner.nextLine().split("\\s+");
        for (int i = 0; i < medicamentsInput.length; i++) {
            medicament.push(Integer.parseInt(medicamentsInput[i]));
        }

        Map<String, Integer> itemAndResources = new LinkedHashMap<>();
        itemAndResources.put("Patch", 30);
        itemAndResources.put("Bandage", 40);
        itemAndResources.put("MedKit", 100);

        Map<String, Integer> createdItems = new TreeMap<>();
        createdItems.put("Patch", 0);
        createdItems.put("Bandage", 0);
        createdItems.put("MedKit", 0);




        while (!textiles.isEmpty() && !medicament.isEmpty()) {
            int sumValues = textiles.peek() + medicament.peek();
            if (itemAndResources.containsValue(sumValues)) {
                String itemToAdd = "";
                for (Map.Entry<String, Integer> entry : itemAndResources.entrySet()) {
                    if (entry.getValue() == sumValues) {
                        itemToAdd = entry.getKey();
                        break;
                    }
                }
                createdItems.put(itemToAdd,createdItems.get(itemToAdd)+1);
                textiles.pop();
                medicament.poll();
                
            } else if (sumValues>itemAndResources.get("MedKit")) {
                createdItems.put("MedKit",createdItems.get("MedKit")+1);
                textiles.pop();
                medicament.poll();
                int toAdd = sumValues-100+medicament.poll();
                medicament.addFirst(toAdd);
            }else {
                textiles.pop();
                int medicamentToAdd = medicament.poll()+10;
                medicament.addFirst(medicamentToAdd);
            }

        }
        
        if(textiles.isEmpty()&& medicament.isEmpty()){
            System.out.println("Textiles and medicaments are both empty.");
        } else if (textiles.isEmpty()) {
            System.out.println("Textiles are empty.");
        } else {
            System.out.println("Medicaments are empty.");
        }

        Map<String,Integer> topTen =
                createdItems.entrySet().stream()
                        .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                        .limit(10)
                        .collect(Collectors.toMap(
                                Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));


        for (Map.Entry<String, Integer> entry : topTen.entrySet()) {
            if(entry.getValue()>0){
                System.out.printf("%s - %d%n",entry.getKey(),entry.getValue());
            }
        }

        if(!medicament.isEmpty()){
            System.out.print("Medicaments left: ");
            System.out.println(medicament.toString().replaceAll("[\\[\\]]",""));
        }
        if(!textiles.isEmpty()){
            System.out.print("Textiles left: ");
            System.out.println(textiles.toString().replaceAll("[\\[\\]]",""));
        }



    }
}
