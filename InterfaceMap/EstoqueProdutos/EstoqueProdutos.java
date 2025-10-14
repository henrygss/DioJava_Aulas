package EstoqueProdutos;

import java.util.Map;
import java.util.HashMap;


public class EstoqueProdutos {
    private Map<Long, Produto> estoqueProdutosMap;

    public EstoqueProdutos(){
        this.estoqueProdutosMap = new HashMap<>();
    }

    //A key, neste caso, será o código
    public void adicionarProduto(long codigo, String nome, int quantidade, double preco){
        estoqueProdutosMap.put(codigo, new Produto(nome, preco, quantidade));
    }

    public void exibirProdutos(){
        if (!estoqueProdutosMap.isEmpty()){
            System.out.println(estoqueProdutosMap);
        }
    }

    public int contarProdutos(){
        return estoqueProdutosMap.size();
    }

    public double calcularValorTotalEstoque(){
        double valorTotalEstoque = 0;
        if (!estoqueProdutosMap.isEmpty()){
            for (Produto p : estoqueProdutosMap.values()){
                valorTotalEstoque += p.getPreco() * p.getQuantidade();
            }
        }else{
            System.out.println("Conjunto vazio");
        }

        return valorTotalEstoque;
    }

    //Neste caso, está sendo considerado que todos os produtos
    //dentro de do HashMap possuem preços diferentes.
    //pois 
    public Produto obterProdutoMaisCaro(){
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;

        if(!estoqueProdutosMap.isEmpty()){
            for (Produto p : estoqueProdutosMap.values()){
                if (p.getPreco() > maiorPreco){
                    maiorPreco = p.getPreco();
                    produtoMaisCaro = p;
                }
            }
        }else{
            System.out.println("Conjunto vazio.");
        }
        return produtoMaisCaro;     
    }

    //Neste caso, está sendo considerado que todos os produtos
    //dentro de do HashMap possuem preços diferentes.
    //pois 
    public Produto obterProdutoMaisBarato(){
        Produto produtoMaisBarato = null;
        double menorPreco = Double.MAX_VALUE;

        if(!estoqueProdutosMap.isEmpty()){
            for (Produto p : estoqueProdutosMap.values()){
                if (p.getPreco() < menorPreco){
                    menorPreco = p.getPreco();
                    produtoMaisBarato = p;
                }
            }
        }else{
            System.out.println("Conjunto vazio.");
        }
        return produtoMaisBarato;     
    }

    //Esse método deve retornar o produto com maior valor baseado em seu custo e quantidade
    //Por exemplo, um produto x custar R$10 e ter apenas uma unidade
    //é maior que um produto y que custa R$3 e possui três unidades no estoque
    public Produto obterProdutoMaiorQuantidadeValorNoEstoque(){
        Produto produtoComMaiorValor = null;
        double maiorValor = Double.MIN_VALUE;
       

        if (!estoqueProdutosMap.isEmpty()){
            for (Produto p : estoqueProdutosMap.values()){
                double valorProduto = p.getPreco() * p.getQuantidade();
                if (valorProduto > maiorValor){
                    maiorValor = valorProduto;
                    produtoComMaiorValor = p;
                }
            }
        }else{
            System.out.println("Conjunto vazio");
        }

        return produtoComMaiorValor;
    }

    public static void main(String[] args) {
        EstoqueProdutos estoqueProdutos = new EstoqueProdutos();

        estoqueProdutos.adicionarProduto(111, "Mochila", 20, 100);
        estoqueProdutos.adicionarProduto(222, "Estojo", 30, 5.0);
        estoqueProdutos.adicionarProduto(333, "Caneta", 70, 2.00);
        estoqueProdutos.adicionarProduto(444, "Borracha", 50, 1.25);
        estoqueProdutos.adicionarProduto(555, "Lápis", 100, 1.75);

        //estoqueProdutos.exibirProdutos();
        //System.out.println(estoqueProdutos.contarProdutos());

        //System.out.println(estoqueProdutos.calcularValorTotalEstoque());

        //System.out.println(estoqueProdutos.obterProdutoMaisCaro());
        //System.out.println(estoqueProdutos.obterProdutoMaisBarato());

        System.out.println(estoqueProdutos.obterProdutoMaiorQuantidadeValorNoEstoque());
    }
}
