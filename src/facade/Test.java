package facade;

/**
 * Created by gavin on 2017/6/14.
 * 外观模式
 */
public class Test {

    public static void main(String[] args) {
        MobilePhone phone=new MobilePhone();


        phone.takePicture();

        phone.videoChat();

    }
}
