package mediator;

/**
 * Created by gavin on 2017/6/8.
 */
public class CDDevice extends Colleague {
    private String data;//视频数据

    public CDDevice(Mediator mediator) {
        super(mediator);
    }

    /****
     * 读取视频数据
     * @return
     */
    public String read() {

        return data;
    }

    /******
     * 加载视频数据
     */
    public void load() {

        data = "视频数据,音频数据";
        mediator.changed(this);
    }
}
