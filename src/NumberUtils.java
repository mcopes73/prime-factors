import java.util.*;
import java.util.stream.Collectors;

public class NumberUtils {

    private boolean esPrimo = false;

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

    public static LinkedList<Integer> getNumbers(int number) {
        LinkedList<Integer> numbers = new LinkedList<>();
        for(int i = 2; i< number; i++) {
            while(number%i == 0) {
                numbers.add(i);
                number = number/i;
            }
        }
        if(number >2) {
            numbers.add(number);
        }

        return numbers;
    }

    public static Integer parseInput(String number) {
        if (number.startsWith("f")) {
            return Integer.parseInt(number.substring(1));
        }

        throw new IllegalArgumentException("Formato incorrecto");
    }

    public static Integer ParsePrimo(String number) {
        if (number.startsWith("fp")) {
            return Integer.parseInt(number.substring(2));
        }

        throw new IllegalArgumentException("Formato incorrecto");
    }
}
