package proxy;

/**
 * Created by gavin on 2017/6/8.
 */
public class Client {
    public static void main(String[] args) {

        RealSubject subject=new RealSubject();

        ProxySubject proxySubject=new ProxySubject(subject);

        proxySubject.visit();
    }
}
