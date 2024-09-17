
import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.print(("skriv første tal: "));
        double a = inputDouble();

        System.out.print(("skriv andet tal: "));
        double b = inputDouble();
        System.out.println(("vælg operator"));

        switch (scanner.next()) {
            case "+" -> System.out.println(calculator.add(a, b));
            case "-" -> System.out.println(calculator.subtract(a, b));
            case "*" -> System.out.println(calculator.multiply(a, b));
            case "/" -> System.out.println(calculator.divide(a, b));
        }
    }

    public static double inputDouble() {
        return scanner.nextDouble();
    }
}
