package observer;

/**
 * Created by gavin on 2017/3/14.
 */
public class ObserverClient {

    public static void main(String[] args) {


        ObserverManager.getInstance().add(new Applicant("小明"));
        ObserverManager.getInstance().add(new Applicant("小蓝"));
        ObserverManager.getInstance().add(new Applicant("小红"));
        ObserverManager.getInstance().add(new Applicant("小黄"));

        ObserverManager.getInstance().notifyObserver("开始上课了");
    }
}
