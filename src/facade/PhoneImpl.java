package facade;

/**
 * Created by gavin on 2017/6/14.
 */
public class PhoneImpl implements Phone {
    @Override
    public void deil() {

        System.out.println("打电话");
    }

    @Override
    public void hangup() {

        System.out.println("挂电话");
    }
}
