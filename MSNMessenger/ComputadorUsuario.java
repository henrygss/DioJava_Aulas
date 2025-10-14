import MSNMessenger.apps.Mensagem;
import MSNMessenger.apps.MSNMessenger;
import MSNMessenger.apps.Facebook;
import MSNMessenger.apps.Telegram;




public class ComputadorUsuario {
    public static void main(String[] args) {
        
        /*MSNMessenger msn = new MSNMessenger();

        //msn.validarConexaoInternet();
        //msn.salvarHistoricoMensagem();

        msn.enviarMensagem();

        msn.receberMensagem();

        Facebook facebook = new Facebook();

        facebook.enviarMensagem();
        facebook.receberMensagem();

        Telegram telegram = new Telegram();

        telegram.enviarMensagem();
        telegram.receberMensagem(); */


        //Usando o conceito de polimorfismo
        //smi quer dizer serviço de mensagem instantânea
        Mensagem smi = null;
        //Não se sabe qual app será aberto
        //mas qualquer um deverá enviar e receber mensagens

        String appEscolhido = "messenger";

        if (appEscolhido.equals("messenger")){
            smi = new MSNMessenger();
        }else if (appEscolhido.equals("facebook")){
            smi = new Facebook();
        }else if (appEscolhido.equals("telegram")){
            smi = new Telegram();
        }

        smi.enviarMensagem();
        smi.receberMensagem();

        //Deixei o método abstract salvarHistoricoMensagem() na classe Mensagem como protected
        //e nas classes filhas, como protected também. Deu certo, e foi o correto a se fazer

        //Método só está visível para as classes filhas
        //smi.salvarHistoricoMensagem();
        
        //O método abaixo está protegido, isto é, somente as classes filhas de Mensagem poderão ter acesso a ele
        //smi.validarConexaoInternet();
    }
    

    
}
