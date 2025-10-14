import java.util.Set;
import java.util.HashSet;


public class ListaTarefas {
    private Set<Tarefa> tarefaSet;

    public ListaTarefas(){
        this.tarefaSet = new HashSet<>();
    }

    public void adicionarTarefa(String descricao){
        this.tarefaSet.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        Tarefa tarefaParaRemover = null;
        for (Tarefa t : tarefaSet){
            if (!tarefaSet.isEmpty()){
                if (t.getDescricao().equalsIgnoreCase(descricao)){
                    tarefaParaRemover = t;
                    break;
                }
            }
        }

        if (tarefaSet.isEmpty()){
            System.out.println("Conjunto vazio");
        }

        if (tarefaParaRemover != null){
            tarefaSet.remove(tarefaParaRemover);
        }else{
            System.out.println("Tarefa não encontrada.");
        }
    }

    public void exibirTarefas(){
        if (!tarefaSet.isEmpty()){
            System.out.println(tarefaSet);
        }else {
            System.out.println("Não existem tarefas no conjunto.");
        }
    }

    public int contarTarefas(){
        return tarefaSet.size();
    }

    public Set<Tarefa> obterTarefasConcluidas(){
        Set<Tarefa> tarefasConcluidasSet = new HashSet<>();

        for (Tarefa t : tarefaSet){
            if (!tarefaSet.isEmpty()){
                if (t.tarefaConcluida()){
                    tarefasConcluidasSet.add(t);
                }
            }
        }

        if (tarefaSet.isEmpty()){
            System.out.println("Conjunto vazio");
        }
        if (tarefasConcluidasSet.isEmpty()){
            System.out.println("Não existem tarefas concluídas.");
        }

        return tarefasConcluidasSet;
    }

    public Set<Tarefa> obterTarefasPendentes(){
        Set<Tarefa> tarefasNaoConcluidas = new HashSet<>();

        for (Tarefa t : tarefaSet){
            if (!t.tarefaConcluida()){
                tarefasNaoConcluidas.add(t);
            }
        }

        return tarefasNaoConcluidas;
    }
    

    public void marcarTarefaConcluida(String descricao){
        for (Tarefa t : tarefaSet){
            if (!tarefaSet.isEmpty()){
                if (t.getDescricao().equalsIgnoreCase(descricao)){
                    t.setTarefaConcluida(true);                                
                }
            }
        }

        if (tarefaSet.isEmpty()){
            System.out.println("Conjunto vazio");
        }


    }

    public void marcarTarefaPendente(String descricao){
        Tarefa  tarefaPendente = null;

        for (Tarefa t : tarefaSet){
            if (!tarefaSet.isEmpty()){
                if (t.getDescricao().equalsIgnoreCase(descricao)){
                    tarefaPendente = t;
                    break;
                }
            }
        }

        if (tarefaSet.isEmpty()){
            System.out.println("Conjunto vazio");
        }

        if (tarefaPendente != null){
            if (tarefaPendente.tarefaConcluida()){
                tarefaPendente.setTarefaConcluida(false);
            }
        }else{
            System.out.println("Tarefa não encontrada.");
        }

    }

    public void limparListaTarefa(){
        if (!tarefaSet.isEmpty()){
        tarefaSet.clear();
        }else{
            System.out.println("Conjunto vazio");
        }
    }

    public static void main(String[] args) {

        ListaTarefas listaTarefas = new ListaTarefas();

        listaTarefas.adicionarTarefa("Tarefa 1");
        listaTarefas.adicionarTarefa("Tarefa 2");
        listaTarefas.adicionarTarefa("Tarefa 3");
        listaTarefas.adicionarTarefa("Tarefa 4");

        // "Tarefa 4 não será salva por conta dos métodos implantados"
        listaTarefas.adicionarTarefa("Tarefa 4");
        listaTarefas.adicionarTarefa("Tarefa 5");

        listaTarefas.exibirTarefas();

        System.out.println(listaTarefas.contarTarefas());

        listaTarefas.removerTarefa("Tarefa 1");
        System.out.println(listaTarefas.contarTarefas());

        listaTarefas.marcarTarefaConcluida("Tarefa 2");
        listaTarefas.marcarTarefaConcluida("Tarefa 3");
        System.out.println(listaTarefas.obterTarefasConcluidas());

        listaTarefas.marcarTarefaPendente("Tarefa 4");
        listaTarefas.marcarTarefaPendente("Tarefa 5");
        System.out.println(listaTarefas.obterTarefasPendentes());

        listaTarefas.limparListaTarefa();
        listaTarefas.exibirTarefas();
        

    }

}
