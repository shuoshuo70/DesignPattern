package Factory;

/**
 * Created by shuoshu on 2017/10/25.
 */
public class OperationAdd extends Operation {
    @Override
    public double getResult() {
        return getNumA() + getNumB();
    }
}
