import java.util.Comparator;
import java.util.Objects;

public class Aluno implements Comparable<Aluno>{
    private String nome;
    private long matricula;
    private double media;

    public Aluno(String nome, long matricula, double media){
        this.nome = nome;
        this.matricula = matricula;
        this.media = media;
    }

    @Override
    public int compareTo(Aluno o) {
        // TODO Auto-generated method stub
       return nome.compareToIgnoreCase(o.getNome());
    }

    public String getNome() {
        return nome;
    }

    public long getMatricula() {
        return matricula;
    }

    public double getMedia() {
        return media;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Aluno { " + "nome: " + getNome() +
        " | Matrícula: " + getMatricula() + 
        " | Média: " + getMedia() + " }";
    }

    @Override
    public int hashCode() {
        return Objects.hash(getMatricula());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof Aluno aluno)) return false;
        return getMatricula() == aluno.getMatricula();
    }   
}

class ComparatorPorMedia implements Comparator<Aluno>{

    @Override
    public int compare(Aluno a1, Aluno a2){
        return Double.compare(a1.getMedia(), a2.getMedia());
    }
}