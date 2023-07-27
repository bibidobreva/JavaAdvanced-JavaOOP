package Google;

import java.util.ArrayList;
import java.util.List;

public class PersonGoogle {
    private Company company;
    private List<PokemonGoogle> pokemonGoogle;
    private List<Parents> parents;
    private List<Children> children;
    private CarGoogle carGoogle;
    private String name;

    public PersonGoogle(String name) {
        this.name = name;
        this.pokemonGoogle = new ArrayList<>();
        this.parents = new ArrayList<>();
        this.children = new ArrayList<>();
    }

    public void setCarGoogle(CarGoogle carGoogle) {
        this.carGoogle = carGoogle;
    }

    public void addChildren(Children children) {
        this.children.add(children);
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public void addParents(Parents parents) {
        this.parents.add(parents);
    }

    public void addPokemonGoogle(PokemonGoogle pokemonGoogle) {
        this.pokemonGoogle.add(pokemonGoogle);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.name).append(System.lineSeparator());
        stringBuilder.append("Company:").append(System.lineSeparator());
        if(this.company!=null){
            stringBuilder.append(this.company).append(System.lineSeparator());
        }
        stringBuilder.append("Car:").append(System.lineSeparator());
        if(this.carGoogle!=null){
            stringBuilder.append(this.carGoogle).append(System.lineSeparator());
        }
        stringBuilder.append("Pokemon:").append(System.lineSeparator());
        for(PokemonGoogle pokemon: pokemonGoogle){
            stringBuilder.append(pokemon).append(System.lineSeparator());
        }
        stringBuilder.append("Parents:").append(System.lineSeparator());
        for(Parents parent: parents){
            stringBuilder.append(parent).append(System.lineSeparator());
        }
        stringBuilder.append("Children:").append(System.lineSeparator());
        for(Children child: children){
            stringBuilder.append(child).append(System.lineSeparator());
        }


        return stringBuilder.toString();
    }
}
