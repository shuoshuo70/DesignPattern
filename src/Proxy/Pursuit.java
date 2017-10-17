package Proxy;

/**
 * Created by shuoshu on 2017/10/17.
 */
public class Pursuit {
    public static void main(String[] args) {
        Girl girl = new Girl("mm");
        Proxy proxy = new Proxy(girl);

        proxy.buyFlowers();
    }
}
