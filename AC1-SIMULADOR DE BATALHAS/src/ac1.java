

public class ac1 {

    public static void main(String[] args) {
            /*
            Pokemon pokemon = new Pokemon();// -- dá erro pq obriga a qualquer pessoa que iniciar um pokemon a passar os atributos dele
            pokemon.vida = 1000;  //-- isso não pode ocorrer, temos em encapsular para não ser mudado
            double defesa;
            
            Pokemon onyx = new Pokemon ("Pedrinha","Terra",50);//aqui só passou os atributos obrigatórios que estão no construtor
            defesa = onyx.getDefesa();
            */
        Pokemon meuPokemon = new Pokemon("Charmander","Fogo",30);
        
        Pokemon outroPokemon = new Pokemon("Blatoise","Agua",30);
            
        Batalhas batalha1 = new Batalhas();
               
        System.out.println("Seu Pokémon: ");
        meuPokemon.imprimiPokemon();
        System.out.println("Pokémon Inimigo: ");
        outroPokemon.imprimiPokemon();
        
        batalha1.meuPokemon(meuPokemon.getNome(), (int) meuPokemon.getVida());
        batalha1.outroPokemon(outroPokemon.getNome(), (int) outroPokemon.getVida());
        
        batalha1.startBattle(meuPokemon, outroPokemon);               
    }

}
    
