package Singleton;

/**
 * Created by shuoshu on 2017/10/19.
 */
public class SingletonLazy {
    private static SingletonLazy singleton = null;

    //为了阻止外界利用new来创建对象
    private SingletonLazy() {
    }

    public static SingletonLazy getSingleton() {
        if (singleton == null) {
            singleton = new SingletonLazy();
        }
        return singleton;
    }

    public static void main(String[] args) {
        SingletonLazy s1 = SingletonLazy.getSingleton();
        SingletonLazy s2 = SingletonLazy.getSingleton();

        System.out.println(s1 == s2);
    }
}
