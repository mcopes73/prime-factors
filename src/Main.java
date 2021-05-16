import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );

        System.out.println("Ingrese una operación y un número:");
        String operationNumber = scanner.nextLine();


        int number = NumberUtils.parseInput(operationNumber);
        if (operationNumber.startsWith("fp")) {
            System.out.println("Factorización prima:");
            System.out.println(NumberUtils.GetPrimeFactors(number));
        }

        if (operationNumber.startsWith("f")) {
            System.out.println("Factores de " + number + ":");
            System.out.println(NumberUtils.getFactors(number));
        }
    }
}
