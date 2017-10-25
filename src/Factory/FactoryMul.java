package Factory;

/**
 * Created by shuoshu on 2017/10/25.
 */
public class FactoryMul implements IFactory {
    @Override
    public Operation createOperation() {
        return new OperationMul();
    }
}
