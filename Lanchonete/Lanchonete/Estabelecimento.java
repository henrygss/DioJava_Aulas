package Lanchonete;

import Lanchonete.Atendimento.Atendente;
import Lanchonete.Atendimento.Cozinha.Almoxarifado;
import Lanchonete.Atendimento.Cozinha.Cozinheiro;
import Lanchonete.AreaCliente.Cliente;

public class Estabelecimento {
    public static void main(String[] args) {
        
        Cozinheiro cozinheiro = new Cozinheiro();
        
        //Ações que não necessitam estar disponíveis para toda a aplicação
        //Não é mais possível nem necessário chamar os métodos abaixo, pois agora são protegidos

    /*  cozinheiro.lavarIngredientes();
        cozinheiro.baterVitaminaLiquidificador();
        cozinheiro.selecionarIngredientesLanche();
        cozinheiro.selecionarIngredientesVitamina();
        cozinheiro.prepararLanche();
        cozinheiro.prepararVitamina();
        cozinheiro.prepararCombo();
        cozinheiro.fritarIngredientesLanche(); */

        //Ações que o estabelecimento precisa estar ciente
        cozinheiro.adicionarSucoNoBalcao();
        cozinheiro.adicionarLancheNoBalcao();
        cozinheiro.adicionarComboNoBalcao();

        //Os clientes não precisam ouvir o cozinheiro pedindo para trocar o gás!!
        //cozinheiro.pedirParaTrocarGas(atendente);
        //cozinheiro.pedirParaTrocarGas(almoxarife);


        //A classe Estabelecimento não tem ciência do que a classe Almoxarifado faz(métodos)
        //pois todos os métodos lá são private ou default
        //Logo, não se faz necessário a criação do objeto almoxarife
        //Ainda que essa classe interaja com alguma outra

        //Almoxarifado almoxarife = new Almoxarifado();

        //Ações que não necessitam estar disponíveis para toda a aplicação
        //almoxarife.controlarEntrada();
        //almoxarife.controlarSaida();

        //Ações que somente o package cozinheiro precisa conhecer (default)
        //A classe Estabelecimento não reconhece a chamada dos métodos abaixo
        //por conta da hierarquia de pacotes e por onta desses métodos serem default

        //almoxarife.entregarIngredientes();
        //almoxarife.trocarGas();
        
        Atendente atendente = new Atendente();

        //atendente.pegarPedidoBalcao(); este é private
        //atendente.pegarLancheNaCozinha(); este é private
        atendente.receberPagamento();
        atendente.servindoMesa();

        //Ação que somente o pacote cozinha precisa conhecer (default)
        //Não é possível chamar o método abaixo, veja o porquê na classe Cozinheiro e Atendente
        /*atendente.trocarGas();*/


        Cliente cliente = new Cliente();

        cliente.escolherLanche();
        cliente.fazerPedido();
        cliente.pagarConta();

        //O cliente não devia, na prática, pegar o pedido no balcão, logo o método não deveria existir
        //cliente.pegarPedidoBalcao();

        //Esta ação é muito sigilosa, deve ser privada
        //cliente.consultarSaldoAplicativo();

    
        







    }
}
