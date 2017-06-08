package proxy;

/**
 * Created by gavin on 2017/6/8.
 * 代理类
 */
public class ProxySubject extends Subject {

    private RealSubject mSubject;

    public ProxySubject(RealSubject mSubject) {
        this.mSubject = mSubject;
    }

    @Override
    public void visit() {

        mSubject.visit();
    }
}
