import java.util.List;
import java.util.ArrayList;


public class CatalogoLivros{

    private List<Livro> listaLivros;

    public CatalogoLivros(){
        this.listaLivros = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int ano){
        listaLivros.add(new Livro(titulo, autor, ano ));
    }

    public List<Livro> pesquisarPorAutor(String autor){
      List<Livro> livrosPorAutor = new ArrayList<>();

      if (!listaLivros.isEmpty()){
        for (Livro l : listaLivros){
            if (l.getAutor().equalsIgnoreCase(autor)){
                livrosPorAutor.add(l);
            }
        }
      }else {
        System.out.println("Catálogo vazio");
      }
      
      return livrosPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> livrosPorIntervaloAnos = new ArrayList<>();

        if (!listaLivros.isEmpty()){
            for (Livro l : listaLivros){
                if (l.getAno() >= anoInicial && l.getAno() <= anoFinal){
                    livrosPorIntervaloAnos.add(l);
                }
            }
        }else{
            System.out.println("Catálogo vazio");
        }
      
      return livrosPorIntervaloAnos;

    }

    //Esse método deve retornar somente o primeiro livro encontrado
    public Livro pesquisarPorTitulo(String titulo){

        Livro livroPorTitulo = null;

        if (!listaLivros.isEmpty()){
            for (Livro l : listaLivros){
                if (l.getTitulo().equalsIgnoreCase(titulo)){
                    livroPorTitulo = l;
                    break;
                }
            }
        }else {
            System.out.println("Catálogo vazio");
        }

        return livroPorTitulo;

    }

    public static void main(String[] args) {
        
        CatalogoLivros catalogoLivros = new CatalogoLivros();

        catalogoLivros.adicionarLivro("livro1", "autor 1", 2001);
        catalogoLivros.adicionarLivro("livro2", "autor 2", 2002);
        catalogoLivros.adicionarLivro("livro3", "autor 3", 2003);
        catalogoLivros.adicionarLivro("livro3", "autor 3", 2003);
        catalogoLivros.adicionarLivro("livro4", "autor 4", 2004);

        System.out.println(catalogoLivros.pesquisarPorAutor("autor 3"));
        System.out.println(catalogoLivros.pesquisarPorAutor("autor 5"));

        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2001, 2003));

        //O método só mostra o primeiro livro que aparecer
        System.out.println(catalogoLivros.pesquisarPorTitulo("livro3"));


    }

    
}