package decorator;

/**
 * Created by gavin on 2017/6/13.
 */
public class Boy extends Person {
    @Override
    public void dressed() {
        /****
         * 基本逻辑
         */
        System.out.println("穿了内裤和内衣");
    }
}
