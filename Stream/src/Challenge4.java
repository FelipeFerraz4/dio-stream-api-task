import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Challenge4 {
    public static void main(String[] args) {
        /*
         * Desafio 4 - Remova todos os valores ímpares: 
         * Utilize a Stream API para remover os valores 
         * ímpares da lista e imprima a lista resultante no console.
         */

         List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
         
        //1º answer
        // List<Integer> numbersNotOdd = new ArrayList<>();
        // for (Integer number : numbers) {
        //     if (number % 2 == 0) {
        //         numbersNotOdd.add(number);
        //     }
        // }
        // System.out.println(numbersNotOdd);

        //2º answer
        List<Integer> numbersNotOdd = numbers.stream().filter(number -> number % 2 == 0).collect(Collectors.toList());
        System.out.println(numbersNotOdd);
         
    }
}
