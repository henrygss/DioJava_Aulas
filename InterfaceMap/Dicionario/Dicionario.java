import java.util.Map;
import java.util.HashMap;


public class Dicionario {
    
    private Map<String, String> dicionarioMap;

    public Dicionario(){
        this.dicionarioMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao){
        dicionarioMap.put(palavra, definicao);
    }

    public void removerPalavra(String palavra){
        if (!dicionarioMap.isEmpty()){
            dicionarioMap.remove(palavra);
        }
    }

    public void exibirPalavras(){
        System.out.println(dicionarioMap);
    }

    public String pesquisarPorPalavra(String palavra){
        String definicaoPorPalavra = null;
        if (!dicionarioMap.isEmpty()){
            definicaoPorPalavra = dicionarioMap.get(palavra);
        }

        return definicaoPorPalavra;
    }

    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();

        //Perceba que 'oi' será salvo com o value(definição) 'cumprimento,
        //pois foi o último value inserido para esta chave'
        dicionario.adicionarPalavra("Oi", "Saudações");
        dicionario.adicionarPalavra("Obrigado", "Agradecimento");
        dicionario.adicionarPalavra("Tchau", "Despedida");
        dicionario.adicionarPalavra("Oi", "Cumprimento");
        dicionario.adicionarPalavra("Apagado", "Exluído, removido, deletado");
        dicionario.adicionarPalavra("Amarelo", "Cor");

        dicionario.exibirPalavras();

        dicionario.removerPalavra("Apagado");
        dicionario.exibirPalavras();

        System.out.println("Definição: " + dicionario.pesquisarPorPalavra("Amarelo"));
    }
}
