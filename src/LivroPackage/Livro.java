package LivroPackage;

public class Livro implements Comparable {
    public String titulo;
    
    public int anodelancamento;

    public Livro(String titulo, int anodelancamento) {
        this.titulo = titulo;
        
        this.anodelancamento = anodelancamento;
    }
    
    @Override
    public int compareTo(Object o){
        Livro other = (Livro) o;
        return this.titulo.compareTo(other.titulo);
    }
}
