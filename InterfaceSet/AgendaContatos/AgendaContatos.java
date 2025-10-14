import java.util.Set;
import java.util.HashSet;

public class AgendaContatos{

    private Set<Contato> agendaContatosSet;

    public AgendaContatos(){
        this.agendaContatosSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numeroTelefone){
        this.agendaContatosSet.add(new Contato(nome, numeroTelefone));
    }

    public void exibirContatos(){
        System.out.println(agendaContatosSet);
    }

    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatoPorNome = new HashSet<>();

        for (Contato c : agendaContatosSet){
            if (!agendaContatosSet.isEmpty()){
                if (c.getNome().startsWith(nome)){
                    contatoPorNome.add(c);
                }
            }
        }
        return contatoPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero){
        Contato contatoAtualizado = null;

        for (Contato c : agendaContatosSet){
            if (c.getNome().equalsIgnoreCase(nome)){
                c.setNumeroTelefone(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Henry", 1234);
        agendaContatos.adicionarContato("Gabriel", 4567);
        agendaContatos.adicionarContato("Silva", 6789);
        
        //Note que este contato não será salvo devido aos métodos implantados que não salvam
        agendaContatos.adicionarContato("Gabriel", 9876);

        agendaContatos.exibirContatos();

        System.out.println(agendaContatos.pesquisarPorNome("Silva"));

        agendaContatos.atualizarNumeroContato("Gabriel", 9999);
        System.out.println(agendaContatos.pesquisarPorNome("Gabriel"));

    }

}