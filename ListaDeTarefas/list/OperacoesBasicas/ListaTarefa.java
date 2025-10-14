package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    
    private List<Tarefa> tarefaList;


    //Construtor que, ao instanciar um objeto do tipo ListaTarefa, já ter uma lista vazia
    public ListaTarefa(){
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao));
    }

    //Cria uma lista chamada tarefasParaRemover
    //a variável auxiliar t varre tarefaList e, se a descrição de t for igual a que foi passada,
    //essa tarefa onde t está é adicionada à tarefasParaRemover
    //Não seria possível remover diretamente com .remove(descricao), pois se houvesse tarefas com a mesma descrição,
    //essa função só removeria a primeira.

    public void removerTarefa(String descricao){
        List<Tarefa> tarefasParaRemover = new ArrayList();
        for (Tarefa t : tarefaList) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasParaRemover.add(t);
            }
        }

        //Comando que remove todas as tarefas baseadas na descrição passada
        //a partir da List tarefasParaRemover criada
        tarefaList.removeAll(tarefasParaRemover);
    }


    public int obterNumeroTotalTarefas(){
        
        //retorna um número inteiro que representa o tamanho de tarefaList
        //que é o número de tarefas total
        return tarefaList.size();
    }

    public void obterDescricoesTarefas(){
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {

        
        ListaTarefa listaTarefa = new ListaTarefa();

        System.out.println("O número total de tarefas é: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.adicionarTarefa("tarefa 1");
        listaTarefa.adicionarTarefa("tarefa 2");
        listaTarefa.adicionarTarefa("tarefa 3");
        listaTarefa.adicionarTarefa("tarefa 3");
        listaTarefa.adicionarTarefa("tarefa 4");

        System.out.println("O número total de tarefas é: " + listaTarefa.obterNumeroTotalTarefas());

        //Perceba que será removido as duas 'tarefa 3'.
        listaTarefa.removerTarefa("tarefa 3");

        System.out.println("O número total de tarefas é: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.obterDescricoesTarefas();



    

    }
}

