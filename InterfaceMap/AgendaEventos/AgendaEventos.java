import java.util.Map;
import java.util.HashMap;
import java.util.HashMap;
import java.util.TreeMap;
import java.time.LocalDate;
import java.util.Collection;
import java.util.Date;

public class AgendaEventos {

    private Map<LocalDate, Evento> agendaEventosMap;

    public AgendaEventos(){
        this.agendaEventosMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao){
        agendaEventosMap.put(data, new Evento(nome, atracao));
    }

    //Aqui será criado um novo Map com o TreeMap.
    //pois este consegue ordenar os elementos 
    public void exibirAgenda(){
        Map<LocalDate, Evento> agendaEventosTreeMap = new TreeMap<>(agendaEventosMap);

        System.out.println(agendaEventosTreeMap);
    }

    public void obterProximoEvento(){


      /* 
        Esse método retorna um set com todas as keys de agendaEventosMap
        Set<LocalDate> dateSet = agendaEventosMap.keySet();

        Esse método retorna uma coleção com todos os valores de agendaEventosMap
        Collection<Evento> values = agendaEventosMap.values();

        Porém, é importante ressaltar que o Set e a Collection não se conhecem, ou seja, não possuem relação
        */

        LocalDate dataAtual = LocalDate.now();
        LocalDate proximaData = null;
        Evento proximoEvento = null;

        //Aqui foi criado um TreeMap para organizar a key, no caso, as datas, em ordem crescente de data.
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(agendaEventosMap);
        
        //O método .entrySet() retornará um Set que terá objetos do tipo Map.Entry que aponta para a chave e o valor correspondente
        //Ou seja, com o Map.Entry se terá uma determinada key e um value interligados, diferentemente do método .keySet(), que retorna apenas um Set de key
        for (Map.Entry<LocalDate, Evento> entry : eventosTreeMap.entrySet()){
            if (entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)){
                proximaData = entry.getKey();
                proximoEvento = entry.getValue();
                System.out.println("O próximo evento: " + proximoEvento + " acontecerá na data: " + proximaData);
                break;
            } 
        }
    }

    public static void main(String[] args) {
        
        AgendaEventos agendaEventos = new AgendaEventos();

        //agendaEventos.adicionarEvento(LocalDate.of(2025, 10, 6), "Evento 1", "Atração 1");
        agendaEventos.adicionarEvento(LocalDate.of(2025, 11, 7), "Evento 2", "Atração 2");
        agendaEventos.adicionarEvento(LocalDate.of(2025, 11, 8), "Evento 3", "Atração 3");
        agendaEventos.adicionarEvento(LocalDate.of(2025, 12, 10), "Evento 4", "Atração 4");
        agendaEventos.adicionarEvento(LocalDate.of(2025, 11, 4), "Evento 5", "Atração 5");

        agendaEventos.exibirAgenda();

        agendaEventos.obterProximoEvento();


        
    }
}
