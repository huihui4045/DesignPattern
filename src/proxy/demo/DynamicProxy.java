package proxy.demo;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by gavin on 2017/6/8.
 */
public class DynamicProxy implements InvocationHandler {

    private Object obj;

    public DynamicProxy(Object obj) {
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        Object invoke = method.invoke(obj, args);
        return invoke;
    }
}
