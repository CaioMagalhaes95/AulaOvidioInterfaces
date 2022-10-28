package application.pkginterface;

public class Personagem implements Comparable {
    public int forca;
    public String nome;
    public int velocidade;
    public int vida;
    

    public Personagem(String nome, int forca, int velocidade, int vida) {
        this.nome = nome;
        this.forca = forca;
        this.velocidade = velocidade;
        this.vida = vida;
    }
    
   
    @Override
    public int compareTo(Object o){
        int poder = forca + velocidade + vida;
        
        Personagem other = (Personagem) o; 
        int poder2 = other.forca + other.velocidade + other.vida;
        
        return poder2 - poder;
    }
    
    
}
