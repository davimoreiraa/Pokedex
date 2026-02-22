import java.util.ArrayList;

public class Pokedex {
    public static ArrayList<Pokemon> pokedex = new ArrayList<>();

    protected static void visualize() { // creating the function to visualize pokemons
        System.out.println(" \nPokemons:");
        for (Pokemon pokemon: pokedex) {
            System.out.println("-> " + pokemon.name);
        }
    }

    protected static void addPokemon(String name, String element, int level) {
        Pokemon pokemon = new Pokemon(name, element, level);
        pokedex.add(pokemon);
    }
}
