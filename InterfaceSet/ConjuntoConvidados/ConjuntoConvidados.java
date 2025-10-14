package ConjuntoConvidados;

import java.util.Set;
import java.util.HashSet;

public class ConjuntoConvidados {
    
    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados(){
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite){
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorConvite(int codigoConvite){
        Convidado convidadoParaRemover = null;

        for(Convidado c : convidadoSet){
            if (c.getCodigoConvite() == codigoConvite){
                convidadoParaRemover = c;
                break;
            }
        }
        convidadoSet.remove(convidadoParaRemover);
    }

    public int contarConvidados(){
        return convidadoSet.size();
    }

    public void exibirConvidados(){
        System.out.println(convidadoSet);
    }

    public static void main(String[] args) {
        
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();

        conjuntoConvidados.adicionarConvidado("Henry", 1234);
        conjuntoConvidados.adicionarConvidado("Gabriel", 4321);
        conjuntoConvidados.adicionarConvidado("Silva", 4567);
        conjuntoConvidados.adicionarConvidado("José", 7654);
        //Este objeto não será salvo por conta do método que verifica se já existe um codigoConvite com esses dados
        conjuntoConvidados.adicionarConvidado("Antonio", 7654);

        conjuntoConvidados.exibirConvidados();

        System.out.println("Existe(m) " + conjuntoConvidados.contarConvidados() + " convidado(s) dentro do Set de convidados");

        
        conjuntoConvidados.removerConvidadoPorConvite(1234);

        System.out.println("Existe(m) " + conjuntoConvidados.contarConvidados() + " convidado(s) dentro do Set de convidados");


    }
}
