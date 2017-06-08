package proxy.demo;

/**
 * Created by gavin on 2017/6/8.
 */
public class XiaoMin implements ILawsuit {
    @Override
    public void submit() {
        System.out.println("老板欠工资，特此申请仲裁");
    }

    @Override
    public void broden() {
        System.out.println("这个是合同和一年的流水");
    }

    @Override
    public void defend() {
        System.out.println("证据确凿，不需要再说什么");
    }

    @Override
    public void finish() {
        System.out.println("诉讼成功 裁决老板七日内结算工资");
    }
}
