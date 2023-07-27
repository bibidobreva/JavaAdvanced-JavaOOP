package Google;

public class PokemonGoogle {

    private String pokemonName;
    private String pokemonType;

    public PokemonGoogle(String pokemonName, String pokemonType) {
        this.pokemonName = pokemonName;
        this.pokemonType = pokemonType;
    }

    @Override
    public String toString() {


        return String.format("%s %s",this.pokemonName,this.pokemonType);
    }
}
