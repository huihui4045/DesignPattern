package mediator;

/**
 * Created by gavin on 2017/6/8.
 * 中介者模式
 */
public class Client {

    public static void main(String[] args) {

        MainBoard mainBoard=new MainBoard();

        CDDevice cdDevice=new CDDevice(mainBoard);

        CPU cpu=new CPU(mainBoard);

        GraphicsCard graphicsCard=new GraphicsCard(mainBoard);

        SoundCard soundCard=new SoundCard(mainBoard);

        mainBoard.setCdDevice(cdDevice);
        mainBoard.setCpu(cpu);
        mainBoard.setGraphicsCard(graphicsCard);
        mainBoard.setSoundCard(soundCard);

        cdDevice.load();

    }
}
