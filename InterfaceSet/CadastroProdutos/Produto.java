import java.util.Objects;
import java.util.Comparator;

public class Produto implements Comparable<Produto> {

    private String nome;
    private long codigo;
    private double preco;
    private int quantidade;

    public Produto(String nome, long codigo, double preco, int quantidade){
        this.nome = nome;
        this.codigo = codigo;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    //Este método compara os objetos por nome e verifica qual vem antes, em ordem alfabética,
    // do que o próximo objeto
    @Override
    public int compareTo(Produto p) {
        // TODO Auto-generated method stub
        return nome.compareToIgnoreCase(p.getNome());
    }

    

    //Os métodos hashCode e equals fazem com que o programa
    //não salve produtos com o mesmo código
    @Override
    public int hashCode() {

        return Objects.hash(getCodigo());
    }


    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof Produto produto)) return false;
        
        return getCodigo() == produto.getCodigo();
    }


    public String getNome() {
        return nome;
    }

    public long getCodigo() {
        return codigo;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return " Produto { " + " Nome: " + getNome() + 
        " | Código: " + getCodigo() +
        " | Preço: " + getPreco() + 
        " | Quantidade: " + getQuantidade();
    }
}

class ComparatorPorPreco implements Comparator<Produto>{

    @Override
    public int compare(Produto p1, Produto p2){
        return Double.compare(p1.getPreco(), p2.getPreco());
    }

}
