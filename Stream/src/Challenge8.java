import java.util.Arrays;
import java.util.List;

public class Challenge8 {
    public static void main(String[] args) {
        /*
         * Desafio 8 - Somar os dígitos de todos os números da lista:
         * Utilizando a Stream API, realize a soma dos dígitos de todos 
         * os números da lista e exiba o resultado no console.
         */

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        
        int sumDigit = numbers.stream()
            .map(number -> Challenge8.digitSum(number))
            .reduce(0, (sum, number) -> number + sum);

        System.out.println(sumDigit);


            
        }
        private static int digitSum(int number) {
            int sum = 0;
            while (number != 0) {
                sum += number % 10;
                number /= 10;
            }
            return sum;
        }
}
