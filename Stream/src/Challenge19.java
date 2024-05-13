import java.util.Arrays;
import java.util.List;

public class Challenge19 {
    public static void main(String[] args) {
        /*
         * Desafio 19 - Encontre a soma dos números divisíveis por 3 e 5:
         * Com a Stream API, encontre a soma dos números da lista que são 
         * divisíveis tanto por 3 quanto por 5 e exiba o resultado no console.
         */

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        //1º answer
        // Integer sumOfDivisorsFor3And5 = numbers.stream()
        //     .filter(number -> number % 3 == 0)
        //     .filter(number -> number % 5 == 0)
        //     .reduce(0, (sum, number) -> sum + number);

        // System.out.println(sumOfDivisorsFor3And5);

        //2º answer
        Integer sumOfDivisorsFor3And5 = numbers.stream()
            .filter(number -> number % 3 == 0)
            .filter(number -> number % 5 == 0)
            .mapToInt(number -> number.intValue())
            .sum();
        System.out.println(sumOfDivisorsFor3And5);
    }
}
