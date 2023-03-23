/**
 * @author hugh
 * @create 2023-03-23 9:37
 */
public class ComputeFactory {
    private static final Add add = new Add();
    private static final Sub sub = new Sub();
    public static Computable getCompute(String symbol) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        return (Computable) Class.forName(symbol).newInstance();
    }
}
