package Observer;

/**
 * Created by shuoshu on 2017/10/21.
 */
public class ObserverConsole {
    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();
        subject.addObserver(new ConcreteObserver(subject, "o1"));
        subject.addObserver(new ConcreteObserver(subject, "o2"));

        subject.setSubjectState("as");
        subject.notifyObservers();
    }
}
