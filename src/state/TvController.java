package state;

/**
 * Created by gavin on 2017/3/3.
 */
public class TvController implements PowerController, TvState {

    private TvState mTvState;

    public void setTvState(TvState mTvState) {
        this.mTvState = mTvState;
    }

    @Override
    public void powerOn() {

        setTvState(new PowerOnState());

        System.out.println("开机了");
    }

    @Override
    public void powerOff() {

        setTvState(new PowerOffState());

        System.out.println("关机了");
    }

    @Override
    public void nextChannel() {

        mTvState.nextChannel();
    }

    @Override
    public void prevChannel() {
        mTvState.prevChannel();
    }

    @Override
    public void turnUp() {
        mTvState.turnUp();
    }

    @Override
    public void turnDown() {
        mTvState.turnDown();
    }
}
