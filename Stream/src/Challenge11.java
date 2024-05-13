import java.util.Arrays;
import java.util.List;

public class Challenge11 {
    public static void main(String[] args) {
        /*
         * Desafio 11 - Encontre a soma dos quadrados de todos os números da lista:
         * Utilizando a Stream API, encontre a soma dos quadrados de todos os números 
         * da lista e exiba o resultado no console.
         */

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        //1º answer
        // Integer numberSquared = numbers.stream().map(number -> number*number).mapToInt(number -> number.intValue()).sum();
        // System.out.println(numberSquared);

        //2º answer
        Integer numberSquared = numbers.stream().map(number -> number*number).reduce(0, (sum, number) -> sum + number);
        System.out.println(numberSquared);
    }
}
