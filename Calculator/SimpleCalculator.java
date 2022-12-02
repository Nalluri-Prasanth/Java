package Calculator;

public class SimpleCalculator {

    int result;

    public int sum(int num1, int num2) {
        result = num1 + num2;
        return result;
    }

    public int subtract(int num1, int num2) {
        result = num1 - num2;
        return result;
    }

    public int divide(int num1, int num2) {
        result = num1 / num2;
        return result;
    }

    public int multiply(int num1, int num2) {
        result = num1 * num2;
        return result;

    }

}
