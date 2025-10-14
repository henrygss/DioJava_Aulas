public class Livro {
    
    private String titulo;
    private String autor;
    private int ano;

    public Livro(String titulo, String autor, int ano){
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "Livro: " + getTitulo() + " | Autor: " +
        getAutor() + " | Ano de publicação: " + getAno();
    }

    public int getAno() {
        return ano;
    }

    public String getAutor() {
        return autor;
    }

    public String getTitulo() {
        return titulo;
    }
}
