

import java.util.Set;
import java.util.HashSet;


public class CojuntoPalavrasUnicas {
    
    //Fiz dessa forma:
    //private Set<Palavra> palavrasSet;

    //Forma correta:
    private Set<String> palavrasSet;

    public CojuntoPalavrasUnicas(){
        this.palavrasSet = new HashSet<>();     
    }

    //Fiz dessa forma:
    /* public void adicionarPalavra(String palavra){
        this.palavrasSet.add(new Palavra(palavra));
    } */

    //Forma correta:
    public void adicionarPalavra(String palavra){
        palavrasSet.add(palavra);
    }

    
    //Fiz dessa forma:
    /*public void removerPalavra(String palavra){
        Palavra palavraParaRemover = null;

        for(Palavra p : palavrasSet){
            if (!palavrasSet.isEmpty()){
                if(p.getPalavra().equalsIgnoreCase(palavra)){
                    palavraParaRemover = p;
                    break;
                }else{
                    palavraParaRemover = null;
                }
            }else{
                System.out.println("O set de palavrasSet está vazio.");
            }
        }

        if (palavraParaRemover != null){
            palavrasSet.remove(palavraParaRemover);
            System.out.println("Palavra '" + palavraParaRemover + "' removida com sucesso.");
        }else{
            System.out.println("Palavra '" + palavra + "' não encontrada.");
            
        }     
    } */

    //Forma correta:
    public void removerPalavra(String palavra){
        if (!palavrasSet.isEmpty()){
            if (palavrasSet.contains(palavra)){
                palavrasSet.remove(palavra);
            }else{
                System.out.println("Palavra não encontrada no conjunto");
            }
        }else{
            System.out.println("O conjunto está vazio.");
        }
    }
    /*A diferença do método usado pelo professor é que ele não precisou usar um foreach para 
    varrer palavrasSet, apenas usou '.contains(palavra)' para verificar se aquela palavra
    existia em palavrasSet */


    //Fiz dessa forma. Particularmente acei melhor que a do professor:
    /*public void verificarPalavra(String palavra){
        Palavra verificarPalavra = null;

        for(Palavra p : palavrasSet){
            if (!palavrasSet.isEmpty()){
                if(p.getPalavra().equalsIgnoreCase(palavra)){
          
                    verificarPalavra = p;
                    break;
                }else{
                    verificarPalavra = null;
                }
            }else {
                System.out.println("O set de palavrasSet está vazia");
                break;

            }
        }

        if (verificarPalavra == null){
            System.out.println("Essa palavra não existe no Set de palavrasSet: " + palavra );
        }else{
            System.out.println("Essa palavra existe no Set de palavrasSet: " + verificarPalavra);
        }

        
    } */

    //Forma correta:
    public boolean verificarPalavra(String palavra){
        return palavrasSet.contains(palavra);
    }
    

    public void exibirPalavrasUnicas(){
        if (!palavrasSet.isEmpty()){
            System.out.println(palavrasSet);
        }else{
            System.out.println("Conjunto vazio");
        }
    }

    public int contarPalavras(){
        return palavrasSet.size();
    }

    public static void main(String[] args) {
        CojuntoPalavrasUnicas cojuntoPalavrasUnicas = new CojuntoPalavrasUnicas();

        cojuntoPalavrasUnicas.adicionarPalavra("Banana");
        cojuntoPalavrasUnicas.adicionarPalavra("Maçã");
        cojuntoPalavrasUnicas.adicionarPalavra("Uva");
        cojuntoPalavrasUnicas.adicionarPalavra("Laranja");
        cojuntoPalavrasUnicas.adicionarPalavra("Laranja");
        cojuntoPalavrasUnicas.adicionarPalavra("Pão");
        cojuntoPalavrasUnicas.adicionarPalavra("Pão");


        //Por alguma razão, o programa não salva palavras repetidas, o que é o correto.
        //Mas antes estava salvando
        System.out.println("Existem " + cojuntoPalavrasUnicas.contarPalavras() + " palavras no Set de palavrasSet.");

        cojuntoPalavrasUnicas.exibirPalavrasUnicas();

        cojuntoPalavrasUnicas.removerPalavra("Laranja");
        System.out.println("Existem " + cojuntoPalavrasUnicas.contarPalavras() + " palavras no Set de palavrasSet.");

        cojuntoPalavrasUnicas.verificarPalavra("laranja");

    }

}
