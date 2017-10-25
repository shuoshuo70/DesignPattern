package Factory;

/**
 * Created by shuoshu on 2017/10/25.
 */
public class FactoryDiv implements IFactory {
    @Override
    public Operation createOperation() {
        return new OperationDiv();
    }
}
