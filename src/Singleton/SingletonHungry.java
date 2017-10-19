package Singleton;

/**
 * Created by shuoshu on 2017/10/19.
 */
public class SingletonHungry {
    private static SingletonHungry singleton = new SingletonHungry();

    private SingletonHungry() {
    }

    public static SingletonHungry getSingleton() {
        return singleton;
    }

    public static void main(String[] args) {
        SingletonHungry s1 = SingletonHungry.getSingleton();
        SingletonHungry s2 = SingletonHungry.getSingleton();

        System.out.println(s1 == s2);
    }
}
