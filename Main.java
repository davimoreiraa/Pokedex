import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        // ArrayList<String> pokedex = new ArrayList<>(); 
        Pokedex.addPokemon("Charizard");
        Pokedex.addPokemon("Lucario");
        int option = 0;

        while (option != 3) {
            System.out.println("\nChoose an option:");
            System.out.println("1 - Visualize Pokemons in the Pokedex");
            System.out.println("2 - Insert a Pokemon in the Pokedex");
            // System.out.println("3 - Delete Pokemon");
            // System.out.println("3 - Edit Pokemon");
            System.out.println("3 - Quite");
            
            option = terminal.nextInt(); // collect the digit 
            terminal.nextLine(); // clear terminal

            switch (option) {
                case 1:
                    Pokedex.visualize();
                    break;
                case 2:
                    System.out.println("Pokemon's name:");
                    String name = terminal.nextLine(); //collect the name
                    Pokedex.addPokemon(name);
                    break;
                case 3:
                    System.out.println("Closing program...");
                    break;
            }
        }
    }

    // private static void visualize(ArrayList<String> pokedex) { // creating the function to visualize pokemons
    //     System.out.println(" \nPokemons:");
    //     for (String pokemon: pokedex) {
    //         System.out.println("-> " + pokemon);
    //     }
    // }

    // private static void addPokemon(String pokemonName) {
    //     pokedex.addPokemon(pokemonName);
    // }
}