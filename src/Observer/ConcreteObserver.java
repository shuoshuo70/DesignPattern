package Observer;

/**
 * Created by shuoshu on 2017/10/20.
 */
public class ConcreteObserver implements Observer {
    String name;
    ConcreteSubject subject;

    ConcreteObserver(ConcreteSubject subject, String name) {
        this.name = name;
        this.subject = subject;
    }

    @Override
    public void update() {
        System.out.println("hahaha");
    }
}
