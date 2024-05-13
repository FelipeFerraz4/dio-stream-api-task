import java.util.Arrays;
import java.util.List;

public class Challenge6 {
    public static void main(String[] args) {
        /*
         * Desafio 6 - Verificar se a lista contém algum número maior que 10:
         * Utilize a Stream API para verificar se a lista contém algum número 
         * maior que 10 e exiba o resultado no console.
         */

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        //1 answer
        // boolean numberGreaterThan10 = numbers.stream().allMatch(number -> number > 10);
        // System.out.println(numberGreaterThan10);

        //2º answer
        boolean numberGreaterThan10 = numbers.stream().anyMatch(number -> number > 10);
        System.out.println(numberGreaterThan10);
    }
}
