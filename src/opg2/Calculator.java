package opg2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        double num1;
        double num2;
        char operator;
        double result;

        // Run while user hasn't quit
        while (true){
            printInfo();
            operator = scanner.next().charAt(0);

            if (operator == 'q') break;
            num1 = inputDouble("write first number : ");
            num2=  inputDouble("Write second number :");

            switch (operator) {
                case '+' -> result = num1 + num2;
                case '-' -> result = num1 - num2;
                case '*' -> result = num1 * num2;
                case '/' -> result = num1 / num2;
                default -> {
                    System.out.print("ugyldig oprator (regne tegn)");
                    scanner.nextLine();
                    continue;
                }
            }
            System.out.print("RESULT = " + result);
            System.out.println();;
        }
    }

    // Prompt for double
    static double inputDouble(String promt) {
        boolean isDouble = false;
        double num = 0;

        // Run while user doesn't input a double
        do {
            try {
                System.out.print(promt);
                num = scanner.nextDouble();
                isDouble = true;
            } catch (InputMismatchException e) {
                System.out.println("wrong input, try again");
            }
        } while (!isDouble);
        return num;
    }

    // Print guide info
    static void printInfo() {
        System.out.println("Velkommen til regnemaskinen");
        System.out.println(" + for addition ");
        System.out.println(" - for substraktion");
        System.out.println(" * for multiplikation");
        System.out.println(" / for division");
        System.out.println(" q for quit");
    }
}
