package Adaptor;

/**
 * Created by shuoshu on 2017/10/22.
 */
public class Translator extends Player {
    ForeignCenter foreignCenter;
    Translator(String name) {
        foreignCenter = new ForeignCenter(name);
    }

    @Override
    public void attack() {
        foreignCenter.attack();
    }

    @Override
    public void defense() {
        foreignCenter.defense();
    }
}
