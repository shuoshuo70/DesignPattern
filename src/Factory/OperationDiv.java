package Factory;

/**
 * Created by shuoshu on 2017/10/25.
 */
public class OperationDiv extends Operation {
    @Override
    public double getResult() throws Exception{
        if (getNumB() == 0.0) {
            throw new Exception("除数不能为0");
        }
        return getNumA() / getNumB();
    }
}
