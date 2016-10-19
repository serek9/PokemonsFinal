import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        PokemonFuego charmander = new PokemonFuego("Charmander", 25, 30, 35);
        PokemonAgua squirtle = new PokemonAgua("Squirtle", 30, 25, 30);
        PokemonPlanta bulbasaur = new PokemonPlanta("Bulbasaur", 35, 30, 25);
        PokemonFuego charizard = new PokemonFuego("Charizar", 35, 40, 45);
        PokemonAgua wartortle = new PokemonAgua("Wartortle", 40, 35, 40);
        PokemonPlanta ivysaur = new PokemonPlanta("Ivysaur", 45, 40, 35);

        System.out.println(charmander);
        System.out.println(squirtle);
        System.out.println(bulbasaur);
        System.out.println(charizard);
        System.out.println(wartortle);
        System.out.println(ivysaur);

        Resfriado resfriado = new Resfriado();

        ArrayList<Capturable> pokedex = new ArrayList();

        pokedex.add(charmander);
        pokedex.add(squirtle);
        pokedex.add(bulbasaur);
        pokedex.add(charizard);
        pokedex.add(wartortle);
        pokedex.add(ivysaur);
        pokedex.add(resfriado);

        for (Capturable pokemon: pokedex){
            System.out.println(pokemon);
            pokemon.capturar();
        }
    }
}
