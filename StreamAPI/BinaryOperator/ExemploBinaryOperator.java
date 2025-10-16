import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

/**
 * Representa uma operação que combina dois argumentos do tipo T e retorna um resultado do mesmo tipo T.
 * É usada para realizar operações de redução em pares de elementos, como somar números ou combinar objetos.
 */
public class ExemploBinaryOperator {
    public static void main(String[] args) {
        // Cria uma lista de números inteiros
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        // Usa o BinaryOperator com expressão lambda para somar dois números inteiros
        BinaryOperator<Integer> somar = (num1, num2) -> num1 + num2;

        /* Utilizando o method reference
        BinaryOperator<Integer> somar = Integer::sum; */


        // Usa o BinaryOperator para somar todos os números no Stream
        //O método reduce faz com que o primeiro argumento(identity) fosse uma variável temporária
        //inicialmente com 0, para que passe pelo primeiro elemento(1) e some com 0, passe pelo segundo e soma, e assim por diante
        int resultado = numeros.stream()
                .reduce(0, Integer::sum);

        /* Suponha que não se sabe como implementar o Binary Operator, outra forma de se fazer seria:
        int resultado = numeros.stream()
                .reduce(identity = 0, new BinaryOperator<Integer>() {
                    @Override
                    public Integer apply(Integer num1, Integer num2) {
                        return  num1 + num2;
                    }
                }); */

        /* Utilizando lambda:
        int resultado = numeros.stream()
        .reduce(0, (num1, num2) -> num1 + num2); */

        /* É possível, ainda, simplificar, utilizando o method reference:
        int resultado = numeros.stream()
                .reduce(0, Integer::sum); */


        // Imprime o resultado da soma
        System.out.println("A soma dos números é: " + resultado);
    }
}
