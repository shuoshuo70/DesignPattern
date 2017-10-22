package Adaptor;

/**
 * 前锋
 * Created by shuoshu on 2017/10/22.
 */
public class Forwards extends Player {
    Forwards(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println(name + ", 前锋进攻");
    }

    @Override
    public void defense() {
        System.out.println(name + ", 前锋防守");
    }
}
