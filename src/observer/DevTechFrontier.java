package observer;

import java.util.Observable;

/**
 * Created by gavin on 2017/3/10.
 */
public class DevTechFrontier extends Observable {

    public void postNewPublication(String content) {

        setChanged();

        notifyObservers(content);
    }
}
