package memoto;

/**
 * Created by gavin on 2017/3/14.
 */
public class CallOfDuty {

    private int mCheckpoint = 1;

    private int mLifeValue = 100;

    private String mWeapon = "沙漠之鹰";

    public void play() {


        System.out.println(String.format("玩游戏：第%d关 奋力杀敌中", mCheckpoint));
        mLifeValue -= 10;
        System.out.println("进度升级了");
        System.out.println(String.format("到达 第%d关", mCheckpoint));

    }

    public void quit() {

        System.out.println("------------------------------");
        System.out.println("推出前的游戏属性：" + this.toString());
        System.out.println("退出游戏");
        System.out.println("------------------------------");
    }

    /**
     * 创建备忘录对象
     *
     * @return
     */
    public Memoto creatMemote() {
        Memoto memoto = new Memoto();
        memoto.setmCheckpoint(mCheckpoint);
        memoto.setmLifeValue(mLifeValue);
        memoto.setmWeapon(mWeapon);

        return memoto;
    }

    public void restore(Memoto memoto) {
        this.mCheckpoint = memoto.getmCheckpoint();
        this.mLifeValue = memoto.getmLifeValue();
        this.mWeapon = memoto.getmWeapon();

        System.out.println("恢复后的游戏属性："+this.toString());
    }

    @Override
    public String toString() {
        return "CallOfDuty{" +
                "mCheckpoint=" + mCheckpoint +
                ", mLifeValue=" + mLifeValue +
                ", mWeapon='" + mWeapon + '\'' +
                '}';
    }

}
