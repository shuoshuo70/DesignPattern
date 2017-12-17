package Singleton;

/**
 * Created by shuoshu on 2017/12/17.
 */
public class SingletonInnerStatic {
    private static class SingletonHolder {
        private static SingletonInnerStatic instance = new SingletonInnerStatic();
    }

    private SingletonInnerStatic() {

    }

    public static SingletonInnerStatic getInstance() {
        return SingletonHolder.instance;
    }
}
