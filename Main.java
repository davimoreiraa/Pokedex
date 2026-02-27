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
            System.out.println("[1] Visualize Pokemons in the Pokedex");
            System.out.println("[2] Insert a Pokemon in the Pokedex");
            // System.out.println("3 - Delete Pokemon");
            System.out.println("[3] Quite");
            
            option = terminal.nextInt(); // collect the digit 
            terminal.nextLine(); //cleans buffer

            switch (option) {
                case 1:
                    System.out.println("");
                    Pokedex.visualize();
                    detail();
                    break;
                case 2:
                    String PokemonName = colletString("\nPokemon's name:", "Pokémon name can't be empty or have a number."); //collect the name

                    System.out.println("\nPokemon's type:");
                    String PokemonType = terminal.nextLine(); //collect the type

                    int PokemonLevel = collectDigit(); //collect the level

                    Pokedex.addPokemon(PokemonName, PokemonType, PokemonLevel);
                    System.out.println("Pokémon added!");
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
        
        while (option != 2) {
            System.out.println(" \nSelect an option:");
            System.out.println("1 - Visualize Pokémon details");
            System.out.println("2 - Return to Menu");
            option = terminal.nextInt();
            switch(option) {
                case 1:
                    System.out.println("\nWich Pokémon do you want to see details of?");
                    Pokedex.visualize();
                    int indexSelected = terminal.nextInt();
                    Pokedex.detailPokemon(indexSelected - 1);
                    break;
                case 2:
                    break;
                default:
                    System.out.println("Select a valid option");
            }
        }
    }

    private static String colletString(String question, String errorMsg) {
        Scanner terminal = new Scanner(System.in);
        boolean validInput = false;
        String pokemonName = "";
        while(!validInput) {
            System.out.println(question);
            pokemonName = terminal.nextLine();
            if (pokemonName.matches("[a-zA-Z ]+") && !pokemonName.isBlank()) {
                validInput = true;
            } else {
                System.out.println(errorMsg);
            }
        }
        return pokemonName;
    }

    private static int collectDigit() {
        Scanner terminal = new Scanner(System.in);
        int digit = 0;
        boolean validInput = false;
        while(validInput == false) {
            try {
                System.out.println("\nPokemon's level:");
                digit = terminal.nextInt();
                validInput = true;
            } catch (Exception InputMismatchException) {
                System.out.println("Type a valid option.");
                terminal.nextLine();
            }
        }
        return digit;
    }
}

