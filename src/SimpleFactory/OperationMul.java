package SimpleFactory;

/**
 * Created by shuoshu on 2017/10/18.
 */
public class OperationMul extends Operation {
    @Override
    public double getResult() {
        return getNumA() * getNumB();
    }
}
