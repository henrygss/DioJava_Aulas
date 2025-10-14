import java.util.List;
import java.util.ArrayList;


public class CarrinhoCompras {
    
    private List<Item> listaItens; 

    public CarrinhoCompras(){
    this.listaItens = new ArrayList();
    }

    public void adicionarItens(String nome, double preco, int quantidade){
        listaItens.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome){
        List <Item> itensParaRemover = new ArrayList();

        for(Item i : listaItens){
            if (i.getNome().equalsIgnoreCase(nome)){
                itensParaRemover.add(i);
            }
        }
        listaItens.removeAll(itensParaRemover);
    }

    public void calcularValorTotal(){
        int quantidadeItens = 0;
        double precoItens = 0.0;

        for (Item i : listaItens){

            quantidadeItens += i.getQuantidade();
            precoItens += i.getPreco();        
        }

        System.out.println("Quantidade de itens: " + quantidadeItens);
        System.out.println("Valor total: " + precoItens);

    }

    public void exibirItens(){
        System.out.println(listaItens);
    }

    public int obterNumeroTotalItens(){
        return listaItens.size();
    }


    public static void main(String[] args) {
        
        CarrinhoCompras carrinhoCompras = new CarrinhoCompras();

        System.out.println("Número total de itens: " + carrinhoCompras.obterNumeroTotalItens());

        carrinhoCompras.adicionarItens("Mouse", 21.00, 10);
        carrinhoCompras.adicionarItens("Carregador", 15.00, 15);
        carrinhoCompras.adicionarItens("Carregador", 15.00, 15);
        carrinhoCompras.adicionarItens("Película", 10.00, 20);
        carrinhoCompras.adicionarItens("Fone", 45.00, 5);




        carrinhoCompras.exibirItens();
        System.out.println("Número total de itens: " + carrinhoCompras.obterNumeroTotalItens());

        carrinhoCompras.removerItem("Carregador");
        System.out.println("Número total de itens: " + carrinhoCompras.obterNumeroTotalItens());

        carrinhoCompras.exibirItens();

        carrinhoCompras.calcularValorTotal();






    }
}
