package Singleton;

/**
 * Created by shuoshu on 2017/10/19.
 */
public class SingletonLock {
    private static volatile SingletonLock singleton = null;
    private static final Object syncRoot = new Object();

    private SingletonLock() {
    }

    public static SingletonLock getSingleton() {
        if (singleton == null) {
            synchronized (syncRoot) {
                if (singleton == null) {
                    singleton = new SingletonLock();
                }
            }
        }

        return singleton;
    }

    public static void main(String[] args) {
        SingletonLock s1 = SingletonLock.getSingleton();
        SingletonLock s2 = SingletonLock.getSingleton();

        System.out.println(s1 == s2);
    }
}
