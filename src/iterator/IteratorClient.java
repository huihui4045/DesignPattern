package iterator;

/**
 * Created by gavin on 2017/3/6.
 *
 * 责任链模式
 */
public class IteratorClient {

    public static void main(String[] args) {

        AbstractHandle handle1=new Handler1();

        AbstractHandle handle2=new Handler2();

        AbstractHandle handle3=new Handler3();

        handle1.nextHandler=handle2;

        handle2.nextHandler=handle3;


        AbstractRequest request1=new Request1("request1");
        AbstractRequest request2=new Request2("request2");
        AbstractRequest request3=new Request3("request3");


        handle1.handleRequest(request1);
        handle1.handleRequest(request2);
        handle1.handleRequest(request3);
    }




}
