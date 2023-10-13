package desafio_stream_api;

import java.util.Arrays;
import java.util.List;

// CALCULE A MEDIA DOS NUMEROS MAIORES QUE 5
public class Desafio5 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,5,4,3);

        List<Integer> numerosMaioresQueCinco = numeros.stream().filter(n -> n > 5).toList();

        double media = numerosMaioresQueCinco.stream().reduce(0,Integer::sum);

        System.out.println(media/ numerosMaioresQueCinco.size());
    }
}
