package MSNMessenger.apps;

public abstract class Mensagem {


    //Métodos abstratos e detalhados nas outras classes
    public abstract void enviarMensagem();
    public abstract void receberMensagem();
    protected abstract void salvarHistoricoMensagem();

    //Método protegido
    //Somente as classes filhas terão acesso a esse método
    protected void validarConexaoInternet(){
        System.out.println("Validando se está conectado");
    };


    //Todo o código abaixo foi feito, inicialmente, com o conceito de herança
    //onde as classes Facebook, MSNMessenger e Telegram herdam os métodos desta classe

    //Agora, será feito com o conceito de abstração, onde são criados os métodos enviarMensagem e receber
    //mas seus comportamentos são detalhados nas classes subsequentes
    /* 

    public void enviarMensagem(){

        validarConexaoInternet();
        
        System.out.println("Enviando mensagem");
        
        salvarHistoricoMensagem();
    }

    public void receberMensagem(){
        System.out.println("Recebendo mensagem");
    }

    //métodos visíveis somente na classe

    private void validarConexaoInternet(){
        System.out.println("Validando se está conectado");
    }

    private void salvarHistoricoMensagem(){
        System.out.println("Salvando o histórico de mensagens");
    } */
}
