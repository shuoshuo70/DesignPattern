package Strategy;

/**
 * Created by shuoshu on 2017/10/31.
 */
public class Context {
    private Strategy strategy;
    Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void contextAlgorithm() {
        strategy.strategyAlgorithm();
    }
}
