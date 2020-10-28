import java.util.Scanner;

// Hola
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );

        System.out.println("Ingrese una operación y un número:");
        String operationNumber = scanner.nextLine();

        int number = NumberUtils.parseInput(operationNumber);
        System.out.println("Factorización:");
        System.out.println(NumberUtils.getFactors(number));
    }
}
