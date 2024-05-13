import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Challenge14 {
    public static void main(String[] args) {
        /*
         * Desafio 14 - Encontre o maior número primo da lista:
         * Com a Stream API, encontre o maior número primo da 
         * lista e exiba o resultado no console.
         */

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        //1º answer
        // Optional<Integer> largestPrimeNumber = numbers.stream()
        //     .filter(number -> isPrimeNumber(number))
        //     .sorted((a, b) -> b.compareTo(a))
        //     .findFirst();
        
        // System.out.println(largestPrimeNumber.get());

        //2º answer
        Optional<Integer> largestPrimeNumber = numbers.stream()
            .filter(number -> isPrimeNumber(number))
            .max((numb1, numb2) -> Integer.compare(numb1, numb2));

        System.out.println(largestPrimeNumber.get());
        
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
