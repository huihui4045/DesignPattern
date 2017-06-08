package mediator;

/**
 * Created by gavin on 2017/6/8.
 */
public class CPU extends Colleague {
    private String dataVideo, dataSound;//视频和音频数据

    public CPU(Mediator mediator) {
        super(mediator);
    }

    /****
     * 获取视频数据
     * @return
     */
    public String getDataVideo() {
        return dataVideo;
    }

    /*****
     * 获取音频数据
     * @return
     */
    public String getDataSound() {
        return dataSound;
    }

    public void decodeData(String data){

        String[] tmp=data.split(",");

        dataVideo=tmp[0];
        dataSound=tmp[1];
        /****
         * 告诉中介者自身状态改变
         */
        mediator.changed(this);
    }
}
