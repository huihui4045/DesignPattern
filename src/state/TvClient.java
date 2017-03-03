package state;

/**
 * Created by gavin on 2017/3/3.
 */
public class TvClient {

    public static void main(String[] args) {

        TvController mTvController=new TvController();

        mTvController.powerOn();

        mTvController.nextChannel();

        mTvController.powerOff();

        mTvController.turnUp();
    }
}
