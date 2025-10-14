import java.util.Collections;
import java.util.List;
import java.util.ArrayList; 


public class OrdenacaoPessoas {

    private List<Pessoa> listaPessoas;

    public OrdenacaoPessoas(){
        this.listaPessoas = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura){
        listaPessoas.add(new Pessoa(nome, idade, altura));
    }

    //Nesse caso, a ArrayList pessoasPorIdade não será vazia inicialmente, como tem sido nos outros exercícios
    //Ela já irá receber os elementos de listaPessoas
    public List<Pessoa> ordenarPorIdade(){
        //Até aqui, a lista não está ordenada
        List<Pessoa> pessoasPorIdade = new ArrayList<>(listaPessoas);
        
        //O método sort terá que ordenar pessoasPorIdade através do Comparable
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }

    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> pessoasPorAltura = new ArrayList<>(listaPessoas);

        Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
        return pessoasPorAltura;
    }

    public static void main(String[] args) {
        
        OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();

        ordenacaoPessoas.adicionarPessoa("Henry",23, 1.73);
        ordenacaoPessoas.adicionarPessoa("Gabriel",42, 1.80);
        ordenacaoPessoas.adicionarPessoa("Silva",18, 2.0);
        ordenacaoPessoas.adicionarPessoa("Antonio",70, 2.20);

        System.out.println(ordenacaoPessoas.ordenarPorIdade());
        System.out.println(ordenacaoPessoas.ordenarPorAltura());

        
    }

}


