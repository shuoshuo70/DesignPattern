package SimpleFactory;

/**
 * Created by shuoshu on 2017/10/18.
 */
public class OperationFactory {
    public Operation createOperation(String operate) {
        Operation operation;

        switch (operate) {
            case "+": {
                operation = new OperationAdd();
                break;
            }
            case "-": {
                operation = new OperationSub();
                break;
            }
            case "*": {
                operation = new OperationMul();
                break;
            }
            case "/" : {
                operation = new OperationDiv();
                break;
            }
            default: {
                operation = null;
            }
        }

        return operation;
    }
}
