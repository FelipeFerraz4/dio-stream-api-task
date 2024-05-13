import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Challenge10 {
    public static void main(String[] args) {
        /*
         * Desafio 10 - Agrupe os valores ímpares múltiplos de 3 ou de 5:
         * Utilize a Stream API para agrupar os valores ímpares múltiplos 
         * de 3 ou de 5 e exiba o resultado no console.
         */

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Map<Boolean, List<Integer>> numberOddMultiple3or5 = numbers
            .stream()
            .filter(number -> (number % 2 == 1))
            .filter(number -> number % 3 == 0 || number % 5 == 0)
            .collect(Collectors.partitioningBy(number -> number % 3 == 0));
        System.out.println( numberOddMultiple3or5);
    }
}
