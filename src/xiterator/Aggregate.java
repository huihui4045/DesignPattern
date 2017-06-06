package xiterator;

/**
 * Created by gavin on 2017/6/6.
 */
public interface Aggregate<T> {

    void add(T obj);

    void remove(T ob);

    Iterator<T> iterator();
}
