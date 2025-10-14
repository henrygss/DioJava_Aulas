import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;



public class GerenciadorAlunos {
    private Set<Aluno> alunosSet;

    public GerenciadorAlunos(){
        this.alunosSet = new HashSet<>();
    }

    public void adicionarAluno(String nome, long matricula, double media){
        this.alunosSet.add(new Aluno(nome, matricula, media));
    }

    public void removerAluno(long matricula){
        for (Aluno a : alunosSet){
            if (!alunosSet.isEmpty()){
               if (a.getMatricula() == matricula){
                alunosSet.remove(a);
                break;
               } 
            }
        }

        if (alunosSet.isEmpty()){
            System.out.println("Conjunto vazio");
        }
    }

    public void exibirAlunos(){
        System.out.println(alunosSet);
    }

    public int contarAlunos(){
        return alunosSet.size();
    }

    public Set<Aluno> exibirAlunosPorNome(){
        Set<Aluno> alunosPorNome = new TreeSet<>(alunosSet);

        return alunosPorNome;
    }

    public Set<Aluno> exibirAlunosPorMedia(){
        Set<Aluno> alunoPorMedia = new TreeSet<>(new ComparatorPorMedia());

        alunoPorMedia.addAll(alunosSet);

        return alunoPorMedia;
    }

    public static void main(String[] args) {
        GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();

        gerenciadorAlunos.adicionarAluno("Henry", 123, 2.0);
        gerenciadorAlunos.adicionarAluno("Gabriel", 345, 1.5);
        gerenciadorAlunos.adicionarAluno("Silva", 567, 8.0);
        gerenciadorAlunos.adicionarAluno("Marcos", 789, 7);
        gerenciadorAlunos.adicionarAluno("Felipe", 987, 5.0);

        //Este aluno não será salo por conta das regras de negócio que impedem dois alunos ter o mesmo número de matrícula
        gerenciadorAlunos.adicionarAluno("Bruno", 123, 4.4);

        gerenciadorAlunos.exibirAlunos();
        System.out.println(gerenciadorAlunos.contarAlunos());

        gerenciadorAlunos.removerAluno(567);
        System.out.println(gerenciadorAlunos.contarAlunos());

        //System.out.println(gerenciadorAlunos.exibirAlunosPorNome());
        System.out.println(gerenciadorAlunos.exibirAlunosPorMedia());


    }
}
