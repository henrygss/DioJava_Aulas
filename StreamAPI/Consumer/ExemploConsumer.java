import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 *  Consumer<T> representa uma operação que aceita um argumento do tipo T(qualquer tipo) e não retorna nenhum resultado.
 * É utilizada principalmente para realizar ações, ou efeitos colaterais nos elementos do Stream sem modificar, ou
 * retornar um valor.
 */
public class ExemploConsumer {

public static void main(String[] args) {

    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

    // Usa o Consumer com expressão lambda para imprimir números pares

    
    Consumer<Integer> imprimirNumeroPar = numero ->  {
     // if (numero % 2 == 0) {
       // System.out.println(numero);
      };
    
    

    // Usa o Consumer para imprimir números pares no Stream
    // numeros.stream().forEach(imprimirNumeroPar);
    

    //Imagine que não se sabe como implementar o consumer, a forma de se fazer o que
    //foi feito acima seria:

    //O método forEach recebe um Consumer do tipo Integer
    numeros.stream().forEach(new Consumer<Integer>(){
        @Override 
        public void accept(Integer n){
            if (n % 2 == 0){
                System.out.println(n);
            }
        }
    });

    //Usando lambda, ficaria dessa forma:

    //Aqui é possível omitir o método .stream, ficando assim:
    numeros.forEach(n -> {
        if ( n % 2 == 0){
            System.out.println(n);
        }
    }
    );
}
}






  
