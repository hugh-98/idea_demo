/**
 * @author hugh
 * @create 2023-03-22 16:50
 */
public class Calculator {

    public int compute(int num1, int num2, String symbol) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Computable computable = ComputeFactory.getCompute(symbol);
        int result = computable.compute(num1, num2);
        return result;
    }
}
