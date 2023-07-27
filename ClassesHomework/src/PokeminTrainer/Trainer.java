package PokeminTrainer;


import java.util.ArrayList;
import java.util.List;

public class Trainer implements Comparable {
    private String name;
    private int badges = 0;
    private List<Pokemon> pokemon;

    public Trainer(String name) {
        this.name = name;
        this.pokemon = new ArrayList<>();
    }

    public void setBadges(int badges) {
        this.badges = badges;
    }

    public void setPokemon(List<Pokemon> pokemon) {
        this.pokemon = pokemon;
    }

    public void addPokemon(Pokemon pokemon) {
        this.pokemon.add(pokemon);
    }

    public boolean hasPokemonOfElement(String element) {
        boolean hasElement = false;
        for (Pokemon pokemon1 : pokemon) {
            if (pokemon1.getElement().equals(element)) {
                hasElement = true;
                break;
            }
        }
        return hasElement;
    }

    public void addBadge() {
        badges++;
    }

    public void loseHealth() {
        for (Pokemon pokemons : pokemon) {
            pokemons.declineHealth();
        }
        List<Pokemon> toRemove = new ArrayList<>();
        for (int i = 0; i < pokemon.size(); i++) {
            if (pokemon.get(i).getHealth() <= 0) {
                toRemove.add(pokemon.get(i));
            }
        }
        pokemon.removeAll(toRemove);
    }

    @Override
    public String toString() {
        return String.format("%s %d %d", this.name, this.badges, pokemon.size());
    }

    public int compareTo(Object compareTo) {
        Trainer compareToTr = (Trainer) compareTo;
        if (badges == compareToTr.badges) return 1;
        else if (badges < ((Trainer) compareTo).badges) return 1;
        else return -1;
    }
}
