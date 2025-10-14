package Lanchonete.Atendimento.Cozinha;

//Importando a classe Atendente, pois o método pedirParaTrocarGas() chama a classe Atendente

public class Cozinheiro{
    public void adicionarLancheNoBalcao () {
        System.out.println("Adicionando lanche natural hamburguer no balcão");
    }

    public void adicionarSucoNoBalcao () {
        System.out.println("Adicionando suco no balcão");
    }

    public void adicionarComboNoBalcao () {
        adicionarLancheNoBalcao();
        adicionarSucoNoBalcao();
    }

    private void prepararLanche() {
        System.out.println("Preparando lanche tipo hambúrguer");
    }

    private void prepararVitamina() {
        System.out.println("Preparando suco");
    }

    private void prepararCombo() {
        prepararVitamina();
        prepararLanche();
    }

    private void selecionarIngredientesLanche() {
        System.out.println("Pão, salada, ovo e carne selecionados");
    }

    private void selecionarIngredientesVitamina() {
        System.out.println("Fruta, leite e suco selecionados");
    }

    private void lavarIngredientes() {
        System.out.println("Lavando ingredientes");
    }

    private void baterVitaminaLiquidificador() {
        System.out.println("Batendo vitamina no liquidifcador");
    }

    private void fritarIngredientesLanche() {
        System.out.println("Fritando a carne e o ovo para o hambúrguer");
    }

    /*public void pedirParaTrocarGas(Atendente meuAmigo) {
        meuAmigo.trocarGas();
    }*/

    //O método acima deve ser desconsiderado, pois o método trocarGas() na classe atendente é default
    //Dessa forma, não é possível chamar esse método no método pedirParaTrocarGas()
    //pois não está visível para Cozinheiro, a nível hierárquico, esse método
     
 
    //Nesse caso, ninguém precisa saber que Cozinheiro pede para o almoxarife trocar o gás
    //Mas vai de você se questionar se é private ou não
    private void pedirParaTrocarGas(Almoxarifado meuAmigo) {
        meuAmigo.trocarGas();
    }

    private void pedirIngredientes(Almoxarifado almoxarife) {
        almoxarife.entregarIngredientes();
    }
}