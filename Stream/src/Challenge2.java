import java.util.Arrays;
import java.util.List;

public class Challenge2 {
    public static void main(String[] args) {
        /*
        * Desafio 2 - Imprima a soma dos números pares da lista:
        * Utilizando a Stream API, realize a soma dos números pares da lista
        * e exiba o resultado no console.
        */

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        //1º answer
        // int sumTotal = 0;
        // int sumEven = 0;
        // for (Integer number : numbers) {
        //     sumTotal += number;
        //     if (number % 2 == 0) {
        //         sumEven += number;
        //     }
        // }

        // System.out.println(sumTotal);
        // System.out.println(sumEven);

        //2º answer
        int sum = numbers.stream().mapToInt(number -> number.intValue()).sum();
        
        int sumEven = numbers.stream().filter(number -> number % 2 == 0).mapToInt(number -> number.intValue()).sum(); 

        System.out.println(sum);
        System.out.println(sumEven);
    }
}
