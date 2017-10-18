package SimpleFactory;

/**
 * Created by shuoshu on 2017/10/18.
 */
public class Operation {
    private double numA;
    private double numB;

    public double getResult() throws Exception {
        return 0.0;
    }

    public double getNumA() {
        return numA;
    }

    public void setNumA(double numA) {
        this.numA = numA;
    }

    public double getNumB() {
        return numB;
    }

    public void setNumB(double numB) {
        this.numB = numB;
    }
}
