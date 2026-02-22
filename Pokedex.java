import java.util.ArrayList;

public class Pokedex {
    public static ArrayList<String> pokedex = new ArrayList<>();

    protected static void visualize() { // creating the function to visualize pokemons
        System.out.println(" \nPokemons:");
        for (String pokemon: pokedex) {
            System.out.println("-> " + pokemon);
        }
    }

    protected static void addPokemon(String pokemonName) {
        pokedex.add(pokemonName);
    }
}
