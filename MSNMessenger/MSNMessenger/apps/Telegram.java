package MSNMessenger.apps;

public class Telegram extends Mensagem {

    public void enviarMensagem(){
        validarConexaoInternet();
        System.out.println("Enviando mensagem pelo Telegram");
        salvarHistoricoMensagem();
    }

    public void receberMensagem(){
        validarConexaoInternet();
        System.out.println("Recebendo mensagem pelo Telegram");
        salvarHistoricoMensagem();
    }

    protected void salvarHistoricoMensagem(){
        System.out.println("Salvando o histórico das mensagens do Telegram");
    };
    
}
