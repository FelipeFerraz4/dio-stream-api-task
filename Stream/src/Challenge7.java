import java.util.Arrays;
import java.util.List;

public class Challenge7 {
    public static void main(String[] args) {
        /*
         * Desafio 7 - Encontrar o segundo número maior da lista:
         * Com a ajuda da Stream API, encontre o segundo número 
         * maior da lista e exiba  o resultado no console.
         */


        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        //1º answer
        // Integer largestNumber = Integer.MIN_VALUE;
        // Integer secondLargestNumber = Integer.MIN_VALUE;
        // for (int i = 0; i < numbers.size(); i++) {
        //     Integer number = numbers.get(i);
        //     if (i == 0) {
        //         largestNumber = number;
        //         secondLargestNumber = number;
        //     } else if (number > largestNumber) {
        //         secondLargestNumber = largestNumber;
        //         largestNumber = number;
        //     } else if (number > secondLargestNumber) {
        //         secondLargestNumber = number;
        //     }
        // }
        // System.out.println(secondLargestNumber.intValue());

        //2º answer
        Integer secondLargestNumber = numbers.stream().sorted((a, b) -> b.compareTo(a)).skip(1).findFirst().orElse(null);
        System.out.println(secondLargestNumber);
    }
}
