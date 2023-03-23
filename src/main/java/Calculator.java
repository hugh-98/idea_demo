/**
 * @author hugh
 * @create 2023-03-22 16:50
 */
public class Calculator {

    public int compute(int num1, int num2, String symbol) {
        switch (symbol) {
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            default:
                throw new IllegalArgumentException();
        }
    }
}
