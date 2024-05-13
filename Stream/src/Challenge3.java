import java.util.Arrays;
import java.util.List;

public class Challenge3 {
    public static void main(String[] args) {
        /*
         * Desafio 3 - Verifique se todos os números da lista são positivos: 
         * Com a ajuda da Stream API, verifique se todos os números da lista 
         * são positivos e exiba o resultado no console.
         */

         List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

         //1º answer
        //  boolean positiveNumbers = true;
        //  for (Integer number : numbers) {
        //     if (number < 0) {
        //         positiveNumbers = false;
        //     }
        //  }

        //  System.out.println(positiveNumbers);

        //2º answer
        boolean positiveNumbers = numbers.stream().allMatch(number -> number > 0);

        System.out.println(positiveNumbers);
    }
}
