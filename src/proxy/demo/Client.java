package proxy.demo;

import java.lang.reflect.Proxy;

/**
 * Created by gavin on 2017/6/8.
 */
public class Client {
    public static void main(String[] args) {

       /* ILawsuit xiaomin=new XiaoMin();

        ILawsuit lawter=new Lawyer(xiaomin);

        lawter.submit();

        lawter.broden();

        lawter.defend();

        lawter.finish();*/

        ILawsuit xiaomin = new XiaoMin();


        /*****
         * 动态代理类
         */
        DynamicProxy proxy = new DynamicProxy(xiaomin);


        ClassLoader classLoader = xiaomin.getClass().getClassLoader();

        ILawsuit lawyer = (ILawsuit) Proxy.newProxyInstance(classLoader, new Class[]{ILawsuit.class}, proxy);

        lawyer.submit();
        lawyer.broden();
        lawyer.defend();
        lawyer.finish();


    }
}
