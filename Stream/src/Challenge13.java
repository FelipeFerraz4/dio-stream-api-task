import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Challenge13 {
    public static void main(String[] args) {
        /*
         * Desafio 13 - Filtrar os números que estão dentro de um intervalo:
         * Utilize a Stream API para filtrar os números que estão dentro de 
         * um intervalo específico (por exemplo, entre 5 e 10) e exiba o resultado no console.
         */

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        
        List<Integer> numbreBetween5And10 = numbers.stream()
            .filter(number -> number >= 5)
            .filter(number -> number <= 10)
            .collect(Collectors.toList());

        System.out.println(numbreBetween5And10);
    }
}
