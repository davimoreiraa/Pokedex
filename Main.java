import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        // ArrayList<String> pokedex = new ArrayList<>(); 
        Pokedex.addPokemon("Charizard", "Fire", 100);
        Pokedex.addPokemon("Lucario", "Fight and Steel", 100);
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
                     detail();
                    break;
                case 2:
                    System.out.println("\n Pokemon's name:");
                    String PokemonName = terminal.nextLine(); //collect the name

                    System.out.println("\n Pokemon's type:");
                    String PokemonType = terminal.nextLine(); //collect the type

                    System.out.println("\n Pokemon's level:");
                    int PokemonLevel = terminal.nextInt(); //collect the level

                    Pokedex.addPokemon(PokemonName, PokemonType, PokemonLevel);
                    break;
                case 3:
                    System.out.println("\n Closing program...");
                    break;
                default:
                    System.out.println("Select a valid option");
            }
        }
    }

    private static void detail() { //enter the screen to visualize pokemons details
        Scanner terminal = new Scanner(System.in);
        int option = 0;
        System.out.println(" \nSelect an option:");
        System.out.println("1 - Visualize Pokémon details");
        System.out.println("2 - Return to Menu");
        option = terminal.nextInt();

        while (option != 2) {
            switch(option) {
                case 1:
                    System.out.println("\nWich Pokémon do you want to see details of?");
                    Pokedex.visualize();
                    int indexSelected = terminal.nextInt();
                    Pokedex.detailPokemon(indexSelected - 1);
                case 2:
                    break;
                default:
                    System.out.println("Select a valid option");
            }
        }
    }
}