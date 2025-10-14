import java.util.Objects;

public class Contato {

    private String nome;
    private int numeroTelefone;

    public Contato(String nome, int numeroTelefone){
        this.nome = nome;
        this.numeroTelefone = numeroTelefone;
    }

    public String getNome(){
        return nome;
    }

    public int getTelefone(){
        return numeroTelefone;
    }

    public void setNumeroTelefone(int numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }


    //O método hashCode e equals, nesse caso, como o professor fez, verifica se já 
    //existe um nome salvo em agendaContatosSet. Portanto, não salva caso o nome do contato seja o mesmo
    //Ou seja, o contato só sera igual se os nomes forem iguais

    @Override
    public int hashCode() {
        return Objects.hash(getNome());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof Contato contato)) return false;
        return Objects.equals(getNome(), contato.getNome());
    }

    @Override
    public String toString() {
        
        return "Contato { nome: " + getNome() + " | telefone: " + getTelefone() + " }";
    }
}
