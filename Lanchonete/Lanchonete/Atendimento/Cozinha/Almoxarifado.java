package Lanchonete.Atendimento.Cozinha;

public class Almoxarifado {

    private void controlarEntrada(){
        System.out.println("Controlando a entrada dos itens");
    }

    private void controlarSaida(){
        System.out.println("Controlando a saída dos itens");
    }

    //Aqui está default, ou seja, somente classes que estão no mesmo pacote conseguem acessar esse método
    void entregarIngredientes(){
        System.out.println("Entregando ingredientes");
        controlarSaida();
    }

    //Aqui está default,ou seja, somente classes que estão no mesmo pacote conseguem acessar esse método
    void trocarGas(){
        System.out.println("Almoxarife trocando o gás");
    }
}
