package application.pkginterface;
import java.util.*;
import LivroPackage.Livro;
public class ApplicationInterface {

    public static void main(String[] args) {
     
   
       
       List<Personagem> personagens = new ArrayList<>();
       personagens.add(new Personagem ("RYU", 78, 15, 180));
       personagens.add(new Personagem ("Shiryu", 80, 18, 120));
       
       
       Collections.sort(personagens);
       
//        for (Personagem p : personagens) {
//            System.out.println(p.nome); 
//        }
        
        List<Livro> livros = new ArrayList<>();
        livros.add(new Livro("Caio", 1985));
        livros.add(new Livro("Fernanda", 1991));
        livros.add(new Livro("Gabriel", 2001));
        
        Collections.sort(livros);
        
        for (Livro l : livros) {
            System.out.println(l.titulo);
        }
    }
    
}
