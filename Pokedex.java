import java.util.ArrayList;

public class Pokedex {
    public static ArrayList<Pokemon> pokedex = new ArrayList<>();

    protected static void visualize() { // creating the function to visualize pokemons
        System.out.println(" \nPokemons:");
        int pokemonID = 1;
        for (Pokemon pokemon: pokedex) {
            System.out.println("[" + pokemonID + "] "+ pokemon.name);
            pokemonID++;
        }
    }

    protected static void addPokemon(String name, String element, int level) {
        Pokemon pokemon = new Pokemon(name, element, level);
        pokedex.add(pokemon);
    }

    protected static void detailPokemon(int indexSelected) {
        Pokemon pokemonSelected = pokedex.get(indexSelected);
        System.out.println("Name: " + pokemonSelected.name);
        System.out.println("Element: " + pokemonSelected.element);
        System.out.println("Level: " + pokemonSelected.level);
    }

}
