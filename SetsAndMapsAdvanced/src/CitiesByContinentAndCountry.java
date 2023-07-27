import java.util.*;

public class CitiesByContinentAndCountry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Map<String, List<String>>> world = new LinkedHashMap<>();

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String [] input = scanner.nextLine().split("\\s+");
            String continent = input[0];
            String country = input[1];
            String city = input[2];


            if(!world.containsKey(continent)){
                world.put(continent,new LinkedHashMap<>());
                world.get(continent).put(country,new ArrayList<>());
                world.get(continent).get(country).add(city);
            }else if(!world.get(continent).containsKey(country)) {
                world.get(continent).put(country,new ArrayList<>());
                world.get(continent).get(country).add(city);
            }else {
                world.get(continent).get(country).add(city);
            }
        }
        for (Map.Entry<String, Map<String, List<String>>> entry : world.entrySet()) {
            System.out.println(entry.getKey()+":");

            for (Map.Entry<String, List<String>> listEntry : entry.getValue().entrySet()) {
                System.out.print(listEntry.getKey()+" -> ");
                System.out.println(Arrays.toString(listEntry.getValue().toArray()).replace("[","").replace("]",""));
            }

        }


    }
}
