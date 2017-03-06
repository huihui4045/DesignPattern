package iterator;

/**
 * Created by gavin on 2017/3/6.
 * 抽象请求者
 */
public abstract class AbstractRequest {

    private Object object;

    public AbstractRequest(Object object) {
        this.object = object;
    }

    public Object getContent() {
        return object;
    }

    /**
     * 获取请求的级别
     *
     * @return
     */
    public abstract int getRequestLevel();
}
