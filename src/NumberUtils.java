import java.util.ArrayList;
import java.util.List;

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

    public static Integer parseInput(String number) {
        if (number.startsWith("f")) {
            return Integer.parseInt(number.substring(1));
        }

        throw new IllegalArgumentException("Formato incorrecto");
    }
}
