public class Autodromo {
    public static void main(String[] args) {
        Carro jeep = new Carro();

        jeep.setChassi("123456");

        //O método ligar() em Carro e Moto envolvem o polimorfismo, pois agora
        //existem duas formas de se ligar
        //Isso é possível pelo fato da classe Veiculo ter o método abstrato Ligar(),
        //e nas classes Moto e Carro, a declaração do método descrevendo seus respectivos comportamentos
        jeep.ligar();

        Moto z400 = new Moto();

        z400.setChassi("654321");
        z400.ligar();
        
        //Se um objeto for criado baseado em um outro, e chamar o método ligar
        //o comportamento do objeto A vai se basear no comportamento de B, por exemplo

        Veiculo objetoQualquer = jeep;
        
        //Note que objetoQualquer vai se basear no objeto jeep
        objetoQualquer.ligar();
    }
}
