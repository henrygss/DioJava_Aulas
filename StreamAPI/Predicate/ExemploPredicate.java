import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * Representa uma função que aceita um argumento do tipo T e retorna um valor booleano (verdadeiro oufalso).
 * É comumente usada para filtrar os elementos do Stream com base em alguma condição.
 */

public class ExemploPredicate {
    public static void main(String[] args) {
        // Cria uma lista de palavras
        List<String> palavras = Arrays.asList("java", "kotlin", "python", "javascript", "c", "go", "ruby");

        // Cria um Predicate que verifica se a palavra tem mais de 5 caracteres
        Predicate<String> maisDeCincoCaracteres = palavra -> palavra.length() > 5;

        // Usa o Stream para filtrar as palavras com mais de 5 caracteres e, em seguida,
        // imprime cada palavra que passou no filtro
        palavras.stream()
                .filter(maisDeCincoCaracteres)
                .forEach(System.out::println);

        /* Suponha que não se sabe como implementar o Predicate, outra forma de se fazer seria:
        palavras.stream()
        .filter(
                new Predicate<String>() {
                    @Override
                    public boolean test(String p) {
                        return p.length() > 5;
                    }
                }
        )
        .forEach(System.out::println); */

        /* Utilizando lambda:
        palavras.stream()
                .filter(p -> p.length() > 5)
                .forEach(System.out::println); */

    }
}
