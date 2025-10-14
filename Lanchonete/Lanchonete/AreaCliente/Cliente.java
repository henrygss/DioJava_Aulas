package Lanchonete.AreaCliente;
public class Cliente {
    
    public void escolherLanche(){
        System.out.println("Escolhendo o lanche");
    }

    public void fazerPedido(){
        System.out.println("Fazendo o pedido");
    }

    public void pagarConta(){
        consultarSaldoAplicativo();
        System.out.println("Pagando a conta");
    }

    private void consultarSaldoAplicativo(){
        System.out.println("Consultando o saldo no aplicativo");
    }

    //O cliente, na prática, não deveria pegar o pedido no balcão, logo o método não deve existir
    /*public void pegarPedidoBalcao(){
        System.out.println("Pegando o pedido no balcão");
    } */
}
