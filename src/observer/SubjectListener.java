package observer;

/**
 * Created by gavin on 2017/3/13.
 * 订阅者借口
 */
public interface SubjectListener {

    void add(ObserverListener observerListener);
    void notifyObserver(Object content);
     void remove(ObserverListener observerListener);
}
