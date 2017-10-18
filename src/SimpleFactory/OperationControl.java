package SimpleFactory;

/**
 * Created by shuoshu on 2017/10/18.
 */
public class OperationControl {
    public static void main(String[] args) throws Exception{
        OperationFactory factory = new OperationFactory();
        Operation operation = factory.createOperation("/");
        operation.setNumA(1);
        operation.setNumB(2);

        System.out.println(operation.getResult());
    }
}
