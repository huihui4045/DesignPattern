package proxy.dynamic;

/**
 * Created by gavin on 2018/1/8.
 */
public class DynamicProxyTest {

    public static void main(String[] args) {

        UserService service=new UserServiceImpl();

        MyInvocationHandler invocationHandler=new MyInvocationHandler(service);

        UserService proxy= (UserService) invocationHandler.getProxy();

        proxy.add();
    }
}
