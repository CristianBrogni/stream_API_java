package desafio_stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

// IMPRIMA  A SOMA DOS NUMEROS PARES DA LISTA
public class Desafio2 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9,10,5,4,3);

        List<Integer> numerosPares = numeros.stream().filter(n -> n % 2 == 0).toList();
        numerosPares.forEach(System.out::println);

        BinaryOperator<Integer> somar = Integer::sum;

        int resultado = numerosPares.stream().reduce(0,somar);
        System.out.println("A soma dos numeros pares é: " + resultado);
    }

}
