import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );

        System.out.println("Ingrese una operación y un número:");
        String operationNumber = scanner.nextLine();


        int number = NumberUtils.ParsePrimo(operationNumber);
        System.out.println("Factorización prima:");
        System.out.println(NumberUtils.getNumbers(number));

        number = NumberUtils.parseInput(operationNumber);
        System.out.println("Factorización:");
        System.out.println(NumberUtils.getFactors(number));
    }
}
