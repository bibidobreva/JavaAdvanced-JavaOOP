package PokeminTrainer;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        Map<String, Trainer> trainerMap = new LinkedHashMap<>();
        while (!(input = scanner.nextLine()).equals("Tournament")) {
            String[] command = input.split("\\s+");

            String trainerName = command[0];
            String pokemonName = command[1];
            String pokemonElement = command[2];
            int pokemonHealth = Integer.parseInt(command[3]);
            Trainer currentTrainer = new Trainer(trainerName);
            Pokemon pokemon = new Pokemon(pokemonName, pokemonElement, pokemonHealth);

            if (!trainerMap.containsKey(trainerName)) {
                currentTrainer.addPokemon(pokemon);
                trainerMap.put(trainerName, currentTrainer);
            } else {
                trainerMap.get(trainerName).addPokemon(pokemon);
            }

        }

        while (!(input = scanner.nextLine()).equals("End")) {
            for (Map.Entry<String, Trainer> entry : trainerMap.entrySet()) {
                if (entry.getValue().hasPokemonOfElement(input)) {
                    entry.getValue().addBadge();
                } else {
                    entry.getValue().loseHealth();
                }
            }


        }
        List<Trainer> trainerList = new ArrayList<>();
        for (Map.Entry<String, Trainer> entry : trainerMap.entrySet()) {
            trainerList.add(entry.getValue());
        }
        trainerList.sort(Trainer::compareTo);
        trainerList.forEach(System.out::println);




    }
}
