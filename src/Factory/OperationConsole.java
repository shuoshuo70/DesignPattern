package Factory;

/**
 * Created by shuoshu on 2017/10/25.
 */
public class OperationConsole {
    public static void main(String[] args) throws Exception{
        IFactory factory = new FactoryAdd();
        Operation operation = factory.createOperation();
        operation.setNumA(1.2);
        operation.setNumB(2.3);
        System.out.println(operation.getResult());
    }
}
