package Proxy;

/**
 * Created by shuoshu on 2017/10/17.
 */
public class Boy implements SendGift{
    Girl girl;
    Boy(Girl girl) {
        this.girl = girl;
    }

    @Override
    public void buyFlowers() {
        System.out.println(girl.name + ", send you a flower");
    }
}
