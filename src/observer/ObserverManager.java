package observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by gavin on 2017/3/13.
 */
public class ObserverManager implements SubjectListener {

    private static ObserverManager manager;


    private List<ObserverListener> list = new ArrayList<>();

    private ObserverManager() {
    }

    public static ObserverManager getInstance() {

        if (null == manager) {


            synchronized (ObserverManager.class) {

                if (null == manager) {

                    manager = new ObserverManager();
                }
            }
        }

        return manager;
    }


    @Override
    public void add(ObserverListener observerListener) {

        list.add(observerListener);
    }

    @Override
    public void notifyObserver(Object content) {

        if (list.size() > 0) {

            list.forEach(item -> item.observerUpData(content));
        }
    }

    @Override
    public void remove(ObserverListener observerListener) {

        if (list.contains(observerListener)) {

            list.remove(observerListener);
        }
    }
}
