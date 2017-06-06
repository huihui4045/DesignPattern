package xiterator;

/**
 * Created by gavin on 2017/6/6.
 */
public interface Iterator<T> {
    /******
     * z是否还有下一个元素
     * @return true 标识有 false 标识没有
     */
    boolean hasNext();

    /******
     * 返回当前位置的元素，并将位置移到下一位
     * @return
     */
    T next();
}
