package MSNMessenger.apps;

public class Facebook extends Mensagem{

    public void enviarMensagem(){
        validarConexaoInternet();
        System.out.println("Enviando mensagem pelo Facebook");
        salvarHistoricoMensagem();
    }

    public void receberMensagem(){
        validarConexaoInternet();
        System.out.println("Recebendo mensagem pelo Facebook");
        salvarHistoricoMensagem();
    }

    protected void salvarHistoricoMensagem(){
        System.out.println("Salvando o histórico das mensagens do Facebook");
    };

}
