package desafio_stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

// VERIFIQUE  SE TODOS OS NUMEROS DA LISTA SAO POSITIVOS
public class Desafio3 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9,10,5,4,3);

        Predicate<Integer> isImpar = numero -> numero % 2 != 0;

        List<Integer> numerosImpares = numeros.stream().filter(isImpar).toList();

        if(!numerosImpares.isEmpty()){
            System.out.println("Nem todos os numeros da lista sao pares");
        }
    }
}
