package Adaptor;

/**
 * 中锋
 * Created by shuoshu on 2017/10/22.
 */
public class Centers extends Player{
    Centers(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println(name + ", 中锋进攻");
    }

    @Override
    public void defense() {
        System.out.println(name + ", 中锋防守");
    }
}
