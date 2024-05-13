import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
// import java.util.stream.Collectors;

public class Challenge5 {
    public static void main(String[] args) {
        /*
         * Desafio 5 - Calcule a média dos números maiores que 5:
         * Com a Stream API, calcule a média dos números maiores que 5 e 
         * exiba o resultado no console.
         */

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        //1º answer
        // List<Integer> numberGreaterThan5 = numbers.stream().filter(number -> number > 5).collect(Collectors.toList());
        // double avegare = numberGreaterThan5.stream().mapToInt(number -> number.intValue()).sum() / numberGreaterThan5.size();
        // System.out.println(numberGreaterThan5);
        // System.out.println( avegare);

        //2º answer
        OptionalDouble avegare = numbers.stream().filter(number -> number > 5).mapToDouble(number -> number.doubleValue()).average();
        System.out.println(avegare.getAsDouble());
    }
}
