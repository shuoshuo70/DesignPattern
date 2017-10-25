package Factory;

/**
 * Created by shuoshu on 2017/10/25.
 */
public class OperationMul extends Operation{
    @Override
    public double getResult() {
        return getNumA() * getNumB();
    }
}
