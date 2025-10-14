package ConjuntoConvidados;

import java.util.Objects;

public class Convidado{

    private String nome;
    private int codigoConvite;

    public Convidado(String nome, int codigoConvite){
        this.nome = nome;
        this.codigoConvite = codigoConvite;
    }

    public String getNome() {
        return nome;
    }

    public int getCodigoConvite() {
        return codigoConvite;
    }



    //Este método compara elementos(atributos) da classe para saber se são iguais ou não
    //No caso do exercício, para verificar se já existe um código de convidado e não salvar  caso tente criar um objeto com o mesmo código

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Convidado convidado)) return false;
        return getCodigoConvite() == convidado.getCodigoConvite();
    }

    @Override
    public int hashCode() {

        return Objects.hash(getCodigoConvite());
    }

    @Override
    public String toString() {
        return "Convidado{ " + " nome: " + getNome() + " | Código convite: " + getCodigoConvite() + " }";
    }


}