package xiterator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by gavin on 2017/6/6.
 */
public class ConcreteIterator<T> implements Iterator<T> {

    private List<T> list = new ArrayList<T>();

    private int cursor = 0;

    public ConcreteIterator(List<T> list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        return cursor != list.size();
    }

    @Override
    public T next() {

        T obj = null;
        if (hasNext()) {

            obj = list.get(cursor);

            cursor++;
        }
        return obj;
    }
}
