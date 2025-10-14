
//Usando o princípio de herança para herdar o atributo chassi e os métodos get e set
public class Carro extends Veiculo{

    /*private String chassi;

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }*/

    //Sabe-se que a forma de ligar um carro é diferente de ligar uma moto
    public void ligar(){
        confereCambio();
        conferirCombustivel();
        System.out.println("Carro ligado");
    }

    //Encapsulando os métodos
    private void conferirCombustivel(){
        System.out.println("Conferindo combustível");
    }

    private void confereCambio(){
        System.out.println("Conferindo o câmbio");
    }


}