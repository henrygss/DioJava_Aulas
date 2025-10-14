public enum EstadoBrasileiro{

    SAO_PAULO ("SP", "São Paulo", 10),
    RIO_JANEIRO ("RJ", "Rio de Janeiro", 11),
    PIAUI ("PI", "Piauí", 12),
    MARANHAO ("MA", "Maranhão", 13);

    private String nome;
    private String sigla;
    private int numeroIbge;

    private EstadoBrasileiro(String sigla, String nome, int ibge){
        this.sigla = sigla;
        this.nome = nome;
        numeroIbge = ibge;
    }

    public String getSigla() {
        return sigla;
    }

    public String getNome() {
        return nome;
    }

    public int getNumeroIbge() {
        return numeroIbge;
    }

    public String getNomeMaiusculo(){
        return nome.toUpperCase();
    }

}