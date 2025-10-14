public class SistemaIbge {
    public static void main(String[] args) {
        for(EstadoBrasileiro e: EstadoBrasileiro.values()){
            System.out.println(e.getSigla() + " - " + e.getNome());
        }

        //Selecionando um Estado em específico
        
        EstadoBrasileiro eb = EstadoBrasileiro.SAO_PAULO; // Nesse momento, eb representa o estado brasileiro
        //de São Paulo
        //Note que, quando colocou um ponto, apareceram justamente os objetos criados previamente no enum
        
        System.out.println(eb.getSigla());
        System.out.println(eb.getNome());
        System.out.println(eb.getNomeMaiusculo());
        System.out.println(eb.getNumeroIbge());




    }
}
