import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Challenge1 {
    public static void main(String[] args) throws Exception {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        /*
         * Desafio 1 - Mostre a lista na ordem numérica:
         * Crie um programa que utilize a Stream API para ordenar 
         * a lista de números em ordem crescente e a exiba no console.
         */
        
        //1º answer
        // Collections.sort(numbers);
        // System.out.println(numbers);

        //2º answer
        List<Integer> orderedNumbers = numbers.stream().sorted().collect(Collectors.toList());
        System.out.println(orderedNumbers);
    }
}
