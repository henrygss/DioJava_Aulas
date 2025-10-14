import java.util.Objects;

public class Tarefa{

    private String descricao;
    private boolean tarefaConcluida;

    public Tarefa(String descricao){
        this.descricao = descricao;
        this.tarefaConcluida = false; 
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean tarefaConcluida(){
        return tarefaConcluida;
    }
    @Override
    public int hashCode() {
  
        return Objects.hash(getDescricao());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
            if(!(o instanceof Tarefa tarefa)) return false;
        return Objects.equals(getDescricao(), tarefa.getDescricao());
    }

    public void setTarefaConcluida(boolean tarefaConcluida) {
        this.tarefaConcluida = tarefaConcluida;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return " Descrição: " + getDescricao() + " }";
    }
}