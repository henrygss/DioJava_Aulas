
//A classe será abstrata, pois não sabe como os métodos(ou alguns dos métodos) funcionam
//Mas todos os objetos que serão veiculos certamente precisarão ter o método ligar
//O método ligar, aqui, também será abstrato, pois não sabe o comportamento dele em outras classes
public abstract class Veiculo {

    private String chassi;

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    
    public abstract void ligar();
    
}
