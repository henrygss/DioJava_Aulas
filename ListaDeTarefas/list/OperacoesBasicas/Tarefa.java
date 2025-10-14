package list.OperacoesBasicas;

public class Tarefa{

    private String descricao;

    //Construtor
    public Tarefa(String descricao){
        this.descricao = descricao;
    }

    public String getDescricao(){
        return descricao;
    }

    @Override
    public String toString() {
      
        return "Tarefa{" + " Descrição: '" + descricao + "'}";
    }

    
}