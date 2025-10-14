public class Pessoa{
    private String nome;
    private String cpf;
    private String endereco; 

    //Nesse exemplo de aula, será usado construtores para o nome e cpf

    //método construtor
    public Pessoa(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
}