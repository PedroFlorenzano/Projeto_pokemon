import java.util.Random;

public class Batalhas {
    
    private int meuPokemonVida;
    private int outroPokemonVida;
    private String meuPokemonNome;
    private String outroPokemonNome;
    
    Random random = new Random();
    
    
    
    public void meuPokemon(String nome, int vida){        
        this.meuPokemonVida = vida;
        this.meuPokemonNome = nome;        
    }
    
    public void outroPokemon(String nome, int vida){        
        this.outroPokemonVida = vida;
        this.outroPokemonNome = nome;        
    }
    
    public String startBattle(Pokemon meuPokemon, Pokemon outroPokemon){
        String vitoria;
        System.out.println("A batalha vai começar!...");
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("\n");
        
       int valor = random.nextInt(10) + 1;
       System.out.println("Número gerado: " + valor);
       
       meuPokemon.setVida(meuPokemon.getVida() - outroPokemon.getAtaque());
        
        if(meuPokemon.getAtaque() < outroPokemon.getVida()){
            vitoria = "Você venceu";
            System.out.println("Você venceu! Parabéns " + meuPokemonNome);
            
        }else{
            vitoria = "Você perdeu";
            System.out.println("Você perdeu! Vencedor: " + outroPokemonNome);
            
        }
        
        return vitoria;
    
    }
    
}
