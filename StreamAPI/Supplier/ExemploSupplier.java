import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.List;


/*Supplier<T> representa uma operação que não aceita nenhum argumento
 e retorna um resultado do tipo T. É comumente usada para criar ou fornecer
novos objetos de um determinado tipo; 
*/

public class ExemploSupplier {
  public static void main(String[] args) {
    // Usa o Supplier com expressão lambda para fornecer uma saudação personalizada
    //Note que o Consumer não recebe nenhum argumento na expresão lambda
    Supplier<String> saudacao = () -> "Olá, seja bem-vindo(a)!";


    //Suponha que não se sabe como implementar o Supplier, então outra forma de fazer seria:


    // Usar o Supplier para obter uma lista com 5 saudações
    //O método generate da interface Stream recebe um Supplier que, no caso, seria saudacao
    //com a mensagem
    //Como se deseja imprimir a lista com 5 saudações, foi usado o método .limit, que recebe um long,
    // para indicar quantas vezes deve ser gerado
    //Para inserir o Supllier dentro da lista, foi usado o método .collect(que coleta) que recebe
    //um coletor e, após isso, inserido na lista através do método .toList()
    //É possível omitir o método .collect e o Collector, ficando apenas o método .toList()
    List<String> listaSaudacoes = Stream.generate(saudacao)
        .limit(5)
        .collect(Collectors.toList());


    /*Suponha que não se sabe como implementar o Supplier, então outra forma de fazer isso seria:
    List<String> listaSaudacoes = Stream.generate(
        new Supplier<String> () {
            @Override
            public String get()  {
                return "Olá, seja bem-vindo";
            }
        }
        )
        .limit(5)
        .collect(Collectors.toList());
        */

    /*Usando expressões lambda, ficaria assim:

    List<String> listaSaudacoes = Stream.generate(
        () ->  "Olá, seja bem-vindo"
    )
    .limit(5)
    .toList();

    */

    // Imprime as saudações geradas
    //Note que o método forEach recebe um Consumer, e o Consumer recebe um argumento e um corpo
    listaSaudacoes.forEach(s -> System.out.println());

    //Usando o method reference, ficaria assim:
    //listaSaudacoes.forEach(System.out::println);


  }
}