
//Usando o princípio de herança para herdar o atributo chassi e os métodos get e set
public class Moto extends Veiculo  {
    
    /*private String chassi;

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }*/

    //Mesmo a classe Moto herdando o método abstrato ligar() de Veiculo,
    //é necessário implantar e especificar o comportamento dele na classe Moto
    public void ligar(){
        System.out.println("Moto ligada");
    }
}
