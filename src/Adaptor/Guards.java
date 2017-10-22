package Adaptor;

/**
 * 后卫
 * Created by shuoshu on 2017/10/22.
 */
public class Guards extends Player {
    Guards(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println(name + ", 后卫进攻");
    }

    @Override
    public void defense() {
        System.out.println(name + ", 后卫防守");
    }
}
