import java.util.Map;
import java.util.NoSuchElementException;
import java.util.LinkedHashMap;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;





public class LivrariaOnline {
    
    private Map<String, Livro> livrariaOnlineMap;

    public LivrariaOnline(){
        this.livrariaOnlineMap = new HashMap<>();
    }

    public void adicionarLivro(String link, Livro livro){
        livrariaOnlineMap.put(link, livro);
    }

    public void removerLivro(String titulo){

        List<String> chavesRemover = new ArrayList<>();

        if (!livrariaOnlineMap.isEmpty()){
            for (Map.Entry<String, Livro> entry : livrariaOnlineMap.entrySet()){
                if (entry.getValue().getTitulo().equalsIgnoreCase(titulo)){
                    chavesRemover.add(entry.getKey());
                }
            }
        }else {
            System.out.println("Conjunto vazio");
        }

        for (String chave : chavesRemover){
            livrariaOnlineMap.remove(chave);
        }
    }

    public void exibirLivros(){
        System.out.println(livrariaOnlineMap);
    }

    public int contarQuantidadeLivros(){
        return livrariaOnlineMap.size();
    }


    /*
     Fiz dessa forma e não deu certo
     
    public Map<String, Livro> exibirLivrosOrdenadosPorPreco(){


        Map<String, Livro> ordenarPorPrecoTreeMap = new TreeMap<>();
        double maiorPreco = Double.MAX_VALUE;

        if (!livrariaOnlineMap.isEmpty()){
            for (Map.Entry<String, Livro> l : livrariaOnlineMap.entrySet()){
                if (l.getValue().getPreco() < maiorPreco){
                    maiorPreco = l.getValue().getPreco();
                    ordenarPorPrecoTreeMap.put(l.getKey(), l.getValue());
                }
            }
        }else {
            System.out.println("Conjunto vazio");
        }

        return ordenarPorPrecoTreeMap;
    }

    */

    //Forma correta

    public Map<String, Livro> exibirLivrosOrdenadosPorPreco(){

        //Aqui o Map original(livrariaOnlineMap) foi convertido a uma List de Map.Entry, que são pares(chave, valor)
        //Isso foi necessário, pois não se consegue ordenar diretamente um Map, mas é possível com uma List.
        List<Map.Entry<String, Livro>> livrosParaOrdenarPorPreco = new ArrayList<>(livrariaOnlineMap.entrySet());

        
        Collections.sort(livrosParaOrdenarPorPreco, new ComparatorPorPreco());

        //Aqui foi criado um novo Map que preserva a ordem em que os elementos foram inseridos(ao contrário de HashMap)
        //Isso é necessário porque, depois da ordenação, é preciso manter os elementos na ordem em que foram organizados
        Map<String, Livro> livrosOrdenadosPorPreco = new LinkedHashMap<>();

        for (Map.Entry<String, Livro> entry : livrosParaOrdenarPorPreco){
            livrosOrdenadosPorPreco.put(entry.getKey(), entry.getValue());
        }

        return livrosOrdenadosPorPreco;
    }


    
    //Fiz dessa forma. Errei apenas a parte do if(Já corrigido)
    public Map<String, Livro> pesquisarLivrosPorAutor(String autor){

        Map<String, Livro> pesquisarPorAutorTreeMap = new TreeMap<>();

        if (!livrariaOnlineMap.isEmpty()){
            for (Map.Entry<String , Livro> entry : livrariaOnlineMap.entrySet()){
                Livro livro = entry.getValue();
                if (livro.getAutor().equalsIgnoreCase(autor)){
                    pesquisarPorAutorTreeMap.put(entry.getKey(), livro);
                }
            }
        }else{
            System.out.println("Conjunto vazio");
        }

        return pesquisarPorAutorTreeMap;
    }
        


    public Map<String, Livro> exibirLivrosOrdenadosPorAutor() {

        List<Map.Entry<String, Livro>> livrosParaOrdenarPorAutor = new ArrayList<>(livrariaOnlineMap.entrySet());

        Collections.sort(livrosParaOrdenarPorAutor, new ComparatorPorAutor());

        Map<String, Livro> livrosOrdenadosPorAutor = new LinkedHashMap<>();

        for (Map.Entry<String, Livro> entry : livrosParaOrdenarPorAutor) {
            livrosOrdenadosPorAutor.put(entry.getKey(), entry.getValue());
        }

        return livrosOrdenadosPorAutor;
    }

    /*Fiz dessa forma. Está funcionando, porém, caso 
    existam dois livros mais caros com o mesmo preço
    o programa só mostrará o primeiro livro
    public Livro obterLivroMaisCaro(){

        double livroMaisBarato = Double.MIN_VALUE;
        Livro livroMaisCaro = null;
        
        if (!livrariaOnlineMap.isEmpty()){
            for (Livro l : livrariaOnlineMap.values()){
                if (l.getPreco() > livroMaisBarato){
                    livroMaisBarato = l.getPreco();
                    livroMaisCaro = l;
                }
            }
        }else{
            System.out.println("Conjunto vazio");
        }

        return livroMaisCaro;
    }

    */

    //Forma mais adequada:

    public List<Livro> obterLivroMaisCaro() {

        List<Livro> livrosMaisCaros = new ArrayList<>();
        double precoMaisAlto = Double.MIN_VALUE;

        if (!livrariaOnlineMap.isEmpty()) {
            for (Livro livro : livrariaOnlineMap.values()) {
                if (livro.getPreco() > precoMaisAlto) {
                    precoMaisAlto = livro.getPreco();
                }
            }
        }else{
                throw new NoSuchElementException("A livraria está vazia!");
            }

        for(Map.Entry<String, Livro> entry: livrariaOnlineMap.entrySet()) {
            if(entry.getValue().getPreco() == precoMaisAlto) {
                Livro livroComPrecoMaisAlto = livrariaOnlineMap.get(entry.getKey());
                livrosMaisCaros.add(livroComPrecoMaisAlto);
            }
        }
        return livrosMaisCaros;
    }


  /*Fiz dessa forma. Mesma coisa do outro método
  Não está errado, mas retorna apenas um livro, mesmo
  que exista um outro mais barato com o mesmo preço
    public Livro obterLivroMaisBarato(){

        double livroMaisCaro = Double.MAX_VALUE;
        Livro livroMaisBarato = null;
        
        if (!livrariaOnlineMap.isEmpty()){
            for (Livro l : livrariaOnlineMap.values()){
                if (l.getPreco() < livroMaisCaro){
                    livroMaisCaro = l.getPreco();
                    livroMaisBarato = l;
                }
            }
        }else{
            System.out.println("Conjunto vazio");
        }

        return livroMaisBarato;
    }

    */

    //Forma mais adequada

    public List<Livro> obterLivroMaisBarato() {
        List<Livro> livrosMaisBaratos = new ArrayList<>();
        double precoMaisBaixo = Double.MAX_VALUE;

        if (!livrariaOnlineMap.isEmpty()) {
            for (Livro livro : livrariaOnlineMap.values()) {
                if (livro.getPreco() < precoMaisBaixo) {
                    precoMaisBaixo = livro.getPreco();
                }
            }
        } else {
            throw new NoSuchElementException("A livraria está vazia!");
        }

        for(Map.Entry<String, Livro> entry: livrariaOnlineMap.entrySet()) {
            if(entry.getValue().getPreco() == precoMaisBaixo) {
                Livro livroComPrecoMaisBaixo = livrariaOnlineMap.get(entry.getKey());
                livrosMaisBaratos.add(livroComPrecoMaisBaixo);
            }
        }
        return livrosMaisBaratos;
    }

    public static void main(String[] args) {
        
        LivrariaOnline livrariaOnline = new LivrariaOnline();

        livrariaOnline.adicionarLivro("https://livro1", new Livro("Livro 1", "Autor 1", 70));
        livrariaOnline.adicionarLivro("https://livro2", new Livro("Livro 2", "Autor 2", 30));
        livrariaOnline.adicionarLivro("https://livro3", new Livro("Livro 3", "Autor 3", 20));
        livrariaOnline.adicionarLivro("https://livro4", new Livro("Livro 4", "Autor 4", 90));
        livrariaOnline.adicionarLivro("https://livro5", new Livro("Livro 5", "Autor 5", 10));


       livrariaOnline.exibirLivros();

       System.out.println(livrariaOnline.contarQuantidadeLivros());



       livrariaOnline.removerLivro("Livro 1");


       System.out.println(livrariaOnline.obterLivroMaisCaro());
       System.out.println(livrariaOnline.obterLivroMaisBarato());

       System.out.println(livrariaOnline.contarQuantidadeLivros());

       System.out.println(livrariaOnline.exibirLivrosOrdenadosPorPreco());
       System.out.println(livrariaOnline.exibirLivrosOrdenadosPorAutor());
       
       System.out.println(livrariaOnline.pesquisarLivrosPorAutor("Autor 2"));


    }

    
}
