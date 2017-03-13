package observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by gavin on 2017/3/13.
 */
public class ObserverManager implements SubjectListener {

    private static ObserverManager manager;


    private List<ObserverListener> list=new ArrayList<>();


    public ObserverManager getInstance() {

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

    }

    @Override
    public void notifyObserver(String content) {

    }

    @Override
    public void remove(ObserverListener observerListener) {

    }
}
