package desafio_stream_api;

import java.util.Arrays;
import java.util.List;

// REMOVA TODOS OS VALORES IMPARES

public class Desafio4 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9,10,5,4,3);

        List<Integer> listaSemImpares = numeros.stream().filter(n -> n % 2 == 0).toList();

        System.out.println(listaSemImpares);

    }
}
