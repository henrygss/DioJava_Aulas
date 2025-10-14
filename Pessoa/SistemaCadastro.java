public class SistemaCadastro {
    public static void main(String[] args) {
        
        Pessoa marcos = new Pessoa("Henry", "229458");

        //Definindo o endereço de marcos
        marcos.setEndereco("Rua das Marias");

        //Como definir o nome e cpf do marcos?

        //Imprimindo marcos sem o nome e cpf
        System.out.println(marcos.getNome() + " - " + marcos.getCpf());


    }
}
