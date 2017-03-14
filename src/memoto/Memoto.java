package memoto;

/**
 * Created by gavin on 2017/3/14.
 * 备忘录类
 */
public class Memoto {

    private int mCheckpoint;

    private int mLifeValue;

    private String mWeapon;


    public int getmCheckpoint() {
        return mCheckpoint;
    }

    public void setmCheckpoint(int mCheckpoint) {
        this.mCheckpoint = mCheckpoint;
    }

    public int getmLifeValue() {
        return mLifeValue;
    }

    public void setmLifeValue(int mLifeValue) {
        this.mLifeValue = mLifeValue;
    }

    public String getmWeapon() {
        return mWeapon;
    }

    public void setmWeapon(String mWeapon) {
        this.mWeapon = mWeapon;
    }

    @Override
    public String toString() {
        return "Memoto{" +
                "mCheckpoint=" + mCheckpoint +
                ", mLifeValue=" + mLifeValue +
                ", mWeapon='" + mWeapon + '\'' +
                '}';
    }
}
