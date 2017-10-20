package Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 消息的发布者
 * Created by shuoshu on 2017/10/20.
 */
public class Subject {
    private List<Observer> observers = new ArrayList<>();

    public boolean addObserver(Observer observer) {
        return observers.add(observer);
    }

    public boolean delObserver(Observer observer) {
        return observers.remove(observer);
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
