package MSNMessenger.apps;

public class MSNMessenger extends Mensagem{

    public void enviarMensagem(){
        validarConexaoInternet();
        System.out.println("Enviando mensagem pelo Messenger");
        salvarHistoricoMensagem();
    }

    public void receberMensagem(){
        validarConexaoInternet();
        System.out.println("Recebendo mensagem pelo Messenger");
        salvarHistoricoMensagem();
    }

    protected void salvarHistoricoMensagem(){
        System.out.println("Salvando o histórico das mensagens do Messenger");
    };
    
   
}