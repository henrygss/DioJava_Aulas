package Lanchonete.Atendimento;
public class Atendente {

    public void servindoMesa(){
        pegarLancheNaCozinha();
        System.out.println("Servindo a mesa");
    }

    private void pegarLancheNaCozinha(){
        System.out.println("Pegando o lanche na cozinha");
    }

    public void receberPagamento(){
        System.out.println("Recebendo o pagamento");
    }

    //Aqui está default,ou seja, somente classes que estão no mesmo pacote conseguem acessar esse método
    void trocarGas(){
        System.out.println("Atendente trocando o gás");
    }

    //Aqui está default,ou seja, somente classes que estão no mesmo pacote conseguem acessar esse método
    private void pegarPedidoBalcao(){
        System.out.println("Pegando o pedido no balcão");
    }
}
