import java.util.Set;
import java.util.TreeSet;
import java.util.HashSet;

public class CadastroProdutos{
    private Set<Produto> produtosSet;

    public CadastroProdutos(){
        this.produtosSet = new HashSet<>();
    }

    public void adicionarProduto(String nome, long codigo, double preco, int quantidade){
        this.produtosSet.add(new Produto(nome, codigo, preco, quantidade));
    }

    public Set<Produto> exibirProdutosPorNome(){

        //Aqui foi usado TreeSet, pois este permite deixar os objetos
        //organizados, no caso, em ordem alfabética.
        //Diferentemente do HashSet, que não permite
        //Aqui não foi usado o Collections.sort, pois este comando recebe um List
        //e aqui está sendo usado Set
        Set<Produto> produtosPorNome = new TreeSet<>(produtosSet);
        
        return produtosPorNome;
    }

    // Aqui esta sendo passado como parâmetro o comparator
    //para deixar o TreeSet organizado, de acordo com o preço
    public Set<Produto> exibirProdutoPorPreco(){
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());

        produtosPorPreco.addAll(produtosSet);
        return produtosPorPreco;
        
    }

    public static void main(String[] args) {
        
        CadastroProdutos cadastroProdutos = new CadastroProdutos();

        cadastroProdutos.adicionarProduto("Estojo", 123, 10.00, 20);
        cadastroProdutos.adicionarProduto("Mochila", 456, 70.00, 10);
        cadastroProdutos.adicionarProduto("Régua", 789, 4.00, 30);
        cadastroProdutos.adicionarProduto("Borracha", 987, 1.00, 40);
        cadastroProdutos.adicionarProduto("Caneta", 123, 1.00, 50);
        cadastroProdutos.adicionarProduto("Marca texto", 876, 0.75, 60);

        System.out.println(cadastroProdutos.produtosSet);

        System.out.println(cadastroProdutos.exibirProdutosPorNome());
        System.out.println(cadastroProdutos.exibirProdutoPorPreco());


    }

    
}