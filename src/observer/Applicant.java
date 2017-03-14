package observer;

/**
 * Created by gavin on 2017/3/14.
 */
public class Applicant implements ObserverListener {

    private String userName;

    public Applicant(String userName) {
        this.userName = userName;
    }

    @Override
    public void observerUpData(Object content) {

        System.out.println(userName+":收到通知 内容："+content.toString());
    }
}
