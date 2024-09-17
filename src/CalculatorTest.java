import org.junit.jupiter.api.Assertions;

class CalculatorTest {
    double a = 1.0;
    double b = 2.0;
    Calculator calculator = new Calculator();

    @org.junit.jupiter.api.Test
    void add() {
        double result = calculator.add(a,b);
        Assertions.assertEquals(3.0, result, 0.1);
    }

    @org.junit.jupiter.api.Test
    void subtract() {
        double result = calculator.subtract(a,b);
        Assertions.assertEquals(-1.0, result, 0.1);
    }

    @org.junit.jupiter.api.Test
    void multiply() {
        double result = calculator.multiply(a,b);
        Assertions.assertEquals(2.0, result, 0.1);
    }

    @org.junit.jupiter.api.Test
    void divide() {
        double result = calculator.divide(a,b);
        Assertions.assertEquals(0.5, result, 0.1);
    }
}
