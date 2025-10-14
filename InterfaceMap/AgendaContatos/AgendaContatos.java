package AgendaContatos;

import java.util.Map;
import java.util.HashMap;


public class AgendaContatos {

    //A interface Map recebe uma key(String) que seria o nome, e um value(Integer) que seria o número de telefone, nesse caso
    private Map<String, Integer> agendaContatosMap;
    
    public AgendaContatos(){
        this.agendaContatosMap = new HashMap<>();
    }


    /*O método put em Map serve tanto para adicionar um elemento
    quanto para atualizar o value de um elemento, pois quando se insere a mesma chave,
    ele substitui o valor antigo dessa chave para um novo valor que for inserido. Ou seja,
    ele atualiza de acordo com o último value inserido, diferentemente do Set, onde
    apenas o primeiro elemento era salvo. */
    public void adicionarContato(String nome, Integer telefone){
        //Diferentemente do List e do Set, para adicionar um elemento utilizando Map,
        //insere-se 'put'. que recebe uma key e um value
        agendaContatosMap.put(nome, telefone);
    }

    public void removerContato(String nome){
        if (!agendaContatosMap.isEmpty()){
            //Nesse caso, não é necessário varrer agendaContatosMap,
            //pois quando se trabalha com key, sabe-se elas mapeam apenas um valor, não podem ser duplicados
            agendaContatosMap.remove(nome);
        }
    }

    public void exibirContaos(){
        System.out.println(agendaContatosMap);
    }

    public Integer pesquisarPorNome(String nome){
        Integer numeroPorNome = null;
        if (!agendaContatosMap.isEmpty()){
            numeroPorNome = agendaContatosMap.get(nome);
        }

        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        //Quando se trabalha com o método put em HashMap, TreeMap ou LinkedHashMap,
        //ele atualiza o value de uma key de acordo com o último value inserido
        
        //Note que, neste exemplo, o objeto 'Henry' aparecerá com o telefone '88888', pois
        //este é o últmo valor inserido e atualizado pelo HashMap

        agendaContatos.adicionarContato("Henry", 55555);
        agendaContatos.adicionarContato("Henry", 44444);
        agendaContatos.adicionarContato("Henry Gabriel", 33333);
        agendaContatos.adicionarContato("Henry Sz", 22222);
        agendaContatos.adicionarContato("Henry Silva", 55555);
        agendaContatos.adicionarContato("Henry", 88888);

        agendaContatos.exibirContaos();

        agendaContatos.removerContato("Henry Sz");

        System.out.println(agendaContatos.pesquisarPorNome("Henry Gabriel"));

    }
}
