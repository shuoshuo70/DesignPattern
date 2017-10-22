package Adaptor;

/**
 * 球员的基类
 * Created by shuoshu on 2017/10/22.
 */
public abstract class Player {
    String name;
    Player() {

    }

    Player(String name) {
        this.name = name;
    }

    public abstract void attack();
    public abstract void defense();
}
