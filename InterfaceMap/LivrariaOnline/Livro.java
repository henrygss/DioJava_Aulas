import java.util.Comparator;
import java.util.Map;

public class Livro {
    
    private String titulo;
    private String autor;
    private double preco;

    public Livro(String titulo, String autor, double preco){
        this.titulo = titulo;
        this.autor = autor;
        this.preco = preco;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Livro { " + " Título: " + getTitulo() +
        " | Autor: " + getAutor() +
        " | Preço: " + getPreco() + " }";
    }
}

class ComparatorPorPreco implements Comparator<Map.Entry<String, Livro>> {

    @Override
    public int compare(Map.Entry<String, Livro> l1, Map.Entry<String, Livro> l2){
        return Double.compare(l1.getValue().getPreco(), l2.getValue().getPreco());
    }
}

class ComparatorPorAutor implements Comparator<Map.Entry<String, Livro>> {

    @Override
    public int compare(Map.Entry<String, Livro> l1, Map.Entry<String, Livro> l2){

        return l1.getValue().getAutor().compareTo(l2.getValue().getAutor());
    }
} 