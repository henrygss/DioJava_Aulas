package aulas.StreamAPI.Function;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Representa uma função que aceita um argumento do tipo T e retorna um resultado do tipo R.
 * É utilizada para transformar, ou mapear os elementos do Stream em outros valores, ou tipos.
 */
public class ExemploFunction {
    public static void main(String[] args) {
        // Cria uma lista de números inteiros
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        // Usa a Function com expressão lambda para dobrar todos os números
        Function<Integer, Integer> dobrar = numero -> numero * 2;


        /* Usa a função para dobrar todos os números no Stream e armazená-los em outra lista
        Aqui, a partir do método .stream, foi usado o método .map, que recebe uma Function, para mapear
        de um valor para outro valor */
        List<Integer> numerosDobrados = numeros.stream()
                .map(dobrar)
                .collect(Collectors.toList());

        /* o método .collect(Collector.toList() pode ser substituído simplesmente por:
        .toList();  */

        /* Suponha que não se sabe como implementar o Function, outra forma de se fazer seria:
        List<Integer> numerosDobrados = numeros.stream()
                .map(
                        new Function<Integer, Integer>() {
                            @Override
                            public Integer apply(Integer n) {
                                return n * 2;
                            }
                        }
                )
                .toList(); */

        /* Utilizando lambda, ficaria:

        List<Integer> numerosDobrados = numeros.stream()
        .map(n -> n * 2)
        .toList(); */


        // Imprime a lista de números dobrados
        numerosDobrados.forEach(n -> System.out.println(n));

        /* Utilizando o method reference:
        numerosDobrados.forEach(System.out::println); */

    }
}