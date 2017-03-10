package observer;

/**
 * Created by gavin on 2017/3/10.
 */
public class Test {

    public static void main(String[] args) {

        DevTechFrontier mDevTechFrontier = new DevTechFrontier();


        Coder coder1 = new Coder("code1");
        Coder coder2 = new Coder("code2");
        Coder coder3 = new Coder("code3");


        mDevTechFrontier.addObserver(coder1);
        mDevTechFrontier.addObserver(coder2);
        mDevTechFrontier.addObserver(coder3);


        mDevTechFrontier.postNewPublication("新消息来了");
    }
}
