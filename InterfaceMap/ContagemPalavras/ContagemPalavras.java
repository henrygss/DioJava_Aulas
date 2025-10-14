import java.util.Map;
import java.util.HashMap;

public class ContagemPalavras{

    private Map<String, Integer> palavrasMap;

    public ContagemPalavras(){
        this.palavrasMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, Integer contagem){
        palavrasMap.put(palavra, contagem);
    }

    public void removerPalavra(String palavra){
        palavrasMap.remove(palavra);
    }

    public void exibirContagemPalavras(){
        System.out.println(palavrasMap);
    }

    public String encontrarPalavraMaisFrequente(){
        String palavraMaisFrequente = null;
        int maiorContagem = 0;

        for (Map.Entry<String, Integer> entry : palavrasMap.entrySet()){
            if (entry.getValue() > maiorContagem){
                maiorContagem = entry.getValue();
                palavraMaisFrequente = entry.getKey();
            }
        }

        return palavraMaisFrequente;
        
    }


    public static void main(String[] args) {
        ContagemPalavras contagemPalavras = new ContagemPalavras();

        contagemPalavras.adicionarPalavra("casa", 2);
        contagemPalavras.adicionarPalavra("árvore", 5);
        contagemPalavras.adicionarPalavra("correr", 1);
        contagemPalavras.adicionarPalavra("rapidamente", 7);
        contagemPalavras.adicionarPalavra("tempo", 6);

        contagemPalavras.removerPalavra("rapidamente");

        contagemPalavras.exibirContagemPalavras();

        System.out.println(contagemPalavras.encontrarPalavraMaisFrequente());

    }
}