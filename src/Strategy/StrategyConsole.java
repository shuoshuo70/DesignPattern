package Strategy;

/**
 * Created by shuoshu on 2017/10/31.
 */
public class StrategyConsole {
    public static void main(String[] args) {
        Context context = new Context(new StrategyA());
        context.contextAlgorithm();
    }
}
