package proxy.demo;

/**
 * Created by gavin on 2017/6/8.
 * 诉讼接口类
 */
public interface ILawsuit {
    /****
     * 提交申请
     */
    void submit();

    /****
     * 进行举证
     */
    void broden();

    /****
     * 开始辩护
     */
    void defend();

    /*****
     * 诉讼完成
     */
    void finish();
}
