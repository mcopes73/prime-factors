import java.util.*;

public class NumberUtils {
    public static List<Integer> getFactors(int number) {

        ArrayList<Integer> factors = new ArrayList<>();

        for (int i = 1; i <= number; ++i) {

            // if number is divided by i
            // i is the factor
            if (number % i == 0) {
                factors.add(i);
            }
        }

        return factors;
    }

    public static List<Integer> GetPrimeFactors(int numero) {
        LinkedList<Integer> numbers = new LinkedList<>();
        for(int i = 2; i< numero; i++) {
            while(numero%i == 0) {
                numbers.add(i);
                numero = numero/i;
            }
        }
        if(numero >2){
            numbers.add(numero);
        }

        return new ArrayList<>(numbers);
    }

    public static Integer parseInput(String number) {
        if (number.startsWith("f") || number.startsWith("fp")) {
            return Integer.parseInt(number.substring(2));
        }

        throw new IllegalArgumentException("Formato incorrecto");
    }

}
