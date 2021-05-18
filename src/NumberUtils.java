import java.util.ArrayList;
import java.util.List;

public class NumberUtils {

    public static List<Integer> getFactors(int number) {

        ArrayList<Integer> factors = new ArrayList<>();

        for (int i = 1; i <= number; ++i) {
            // If number is divided by i, i is a factor
            if (number % i == 0) {
                factors.add(i);
            }
        }

        return factors;
    }

    public static Integer parseInput(String input) {
        if (input.startsWith("f")) {
            return Integer.parseInt(input.substring(1));
        }

        throw new IllegalArgumentException("Formato incorrecto");
    }
}
