package Proxy;

/**
 * Created by shuoshu on 2017/10/17.
 */
public class Proxy implements SendGift{
    Boy boy;
    Proxy(Girl girl) {
        boy = new Boy(girl);
    }

    @Override
    public void buyFlowers() {
        boy.buyFlowers();
    }
}
