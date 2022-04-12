public class Pokemon {
    //Atributos
    private String nome;
    private String tipo;
    private double vida = 200;
    private double defesa;
    private double ataque;
    private int level;
    
    
    //Construtor
    public Pokemon(String nome, String tipo, int level) {
     //método com o mesmo nome da classe, ele obriga a quando vc instaciar um pokemon
     //vc tem que passar essas informações. Nem todos são obrigatórios.
        this.nome = nome;
        this.tipo = tipo;
        this.level = level;
        
        //A ordem aqui importa
        calculaAtributos();
        calculaLevel();
        imprimeAtributos();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVida() {
        return vida;
    }

    public void setVida(double vida) {
        this.vida = vida;
    }

    public double getDefesa() {
        return defesa;
    }

    public void setDefesa(double defesa) {
        this.defesa = defesa;
    }

    public double getAtaque() {
        return ataque;
    }

    public void setAtaque(double ataque) {
        this.ataque = ataque;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
    
    
    
    //Métodos
    
    private void calculaLevel(){
        
        this.vida = this.vida + (this.level/2);
        this.ataque = this.ataque + (level/3);
        this.defesa = defesa + (level/4);
        

    }
    
    
    
    private void imprimeAtributos(){
        System.out.println("Nome: " + this.nome + " // "+
                           "Tipo: " + this.tipo + " // "+
                           "Vida: " + this.vida + " // "+
                           "Level: " + this.level + " // "+
                           "Defesa: " + this.defesa + " // "+
                           "Ataque: " + this.ataque);
        
        
    }
    private void calculaAtributos(){
       
        switch(this.tipo){ //this = vc está referenciando diretamente um atributo e não uma variável local
            
            case "Fogo":
                this.ataque = 100;
                this.defesa = 50;
                this.vida -= 20; //a vida base é 200 e estou apenas reduzindo 20
                break;
                
            case "Agua":
                this.ataque = 80;
                this.defesa = 70;
                this.vida += 30;
                break;
                
            case "Terra":
                this.ataque = 70;
                this.defesa = 70;
                this.vida += 50;
                break;
                
            case "Planta":
                this.ataque = 50;
                this.defesa = 80;
                this.vida += 50;
                break; 
            
        }
    }
    
    public void imprimiPokemon(){
        
        System.out.println(
                "Nome: " + nome + " | " + 
                    "Tipo: " + tipo + " | " + 
                        "Level: " + level + " | " + 
                            "Vida: " + vida + " | " +
                                "Ataque: " + ataque + " | " +
                                    "Defesa: " + defesa + "\n");
        
    }   
    
}
