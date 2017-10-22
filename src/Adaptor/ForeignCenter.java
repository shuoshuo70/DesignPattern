package Adaptor;

/**
 * 外籍中锋，与player类不兼容
 * Created by shuoshu on 2017/10/22.
 */
public class ForeignCenter {
    String name;
    ForeignCenter(String name) {
        this.name = name;
    }

    public void attack() {
        System.out.println(name + ", 外籍中锋进攻");
    }

    public void defense() {
        System.out.println(name + ", 外籍中锋防守");
    }
}
