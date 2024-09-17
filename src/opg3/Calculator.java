package opg3;

/*IntelliJ fortæller at man ikke burde bruge Non-ASCII symboler, så derfor forholder vi os til engelsk*/
public class Calculator {
    private double firstNum;
    private double secondNum;

    public Calculator() {
    }

    public Calculator(double firstNum) {
        this.firstNum = firstNum;
    }

    public Calculator(double firstNum, double secondNum) {
        this.firstNum = firstNum;
        this.secondNum = secondNum;
    }

    public double getFirstNum() {
        return firstNum;
    }

    public void setFirstNum(double firstNum) {
        this.firstNum = firstNum;
    }

    public double getSecondNum() {
        return secondNum;
    }

    public void setSecondNum(double secondNum) {
        this.secondNum = secondNum;
    }
}
