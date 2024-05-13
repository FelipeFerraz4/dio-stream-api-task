import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Challenge16 {
    public static void main(String[] args) {
        /*
         * Desafio 16 - Agrupe os números em pares e ímpares:
         * Utilize a Stream API para agrupar os números em duas 
         * listas separadas, uma contendo os números pares e outra 
         * contendo os números ímpares da lista original, 
         * e exiba os resultados no console.
         */

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Map<Boolean, List<Integer>> numbersEvenOdd = numbers.stream()
            .collect(Collectors.partitioningBy(number -> number % 2 == 0));
        
        List<Integer> even = numbersEvenOdd.get(true);
        List<Integer> odd = numbersEvenOdd.get(false);

        System.out.println(numbersEvenOdd);
        System.out.println(even);
        System.out.println(odd);
    }
}
