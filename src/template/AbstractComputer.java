package template;

/**
 * Created by gavin on 2017/6/7.
 */
public abstract class AbstractComputer {

    protected void powerOn() {

        System.out.println("开启电源");
    }

    protected void checkHardware() {
        System.out.println("开启电源");
    }

    protected void loadOS() {
        System.out.println("载入操作系统");
    }

    protected void login() {

        System.out.println("小宝的计算机无验证，直接今日系统");
    }

    public final  void startUp(){

        System.out.println("---------开机开始-------------");

        powerOn();

        checkHardware();
        loadOS();
        login();

        System.out.println("---------开机完成-------------");

    }
}
