package mediator;

/**
 * Created by gavin on 2017/6/8.
 * 主板中介者
 */
public class MainBoard extends Mediator {
    private CDDevice cdDevice;//光驱设备
    private CPU cpu;//cpu
    private SoundCard soundCard;//声卡设备
    private GraphicsCard graphicsCard;//显卡设备

    @Override
    public void changed(Colleague colleague) {

        if (colleague==cdDevice){

            handleCD((CDDevice) colleague);
        }else if (colleague==cpu){

            handleCPU((CPU) colleague);
        }
    }

    /*****
     * 处理光驱读取的 数据与其他设备交互
     * @param cdDevice 光驱设备
     */
    private void handleCD(CDDevice cdDevice) {

        cpu.decodeData(cdDevice.read());
    }

    /*****
     * 处理cpu数据 与其他数据交互
     * @param cpu
     */
    public void handleCPU(CPU cpu) {

        soundCard.soundPlay(cpu.getDataSound());

        graphicsCard.videoPlay(cpu.getDataVideo());
    }

    public void setCdDevice(CDDevice cdDevice) {
        this.cdDevice = cdDevice;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public void setSoundCard(SoundCard soundCard) {
        this.soundCard = soundCard;
    }

    public void setGraphicsCard(GraphicsCard graphicsCard) {
        this.graphicsCard = graphicsCard;
    }
}
