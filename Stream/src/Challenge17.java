import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Challenge17 {
    public static void main(String[] args) {
        /*
         * Desafio 17 - Filtrar os números primos da lista:
         * Com a ajuda da Stream API, filtre os números primos
         *  da lista e exiba o resultado no console.
         */

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> primeNumbers = numbers.stream()
            .filter(number -> isPrimeNumber(number))
            .collect(Collectors.toList());
        
        System.out.println(primeNumbers);
    }

    private static boolean isPrimeNumber(int number) {
        if (number == 1) {
            return false;
        }

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
