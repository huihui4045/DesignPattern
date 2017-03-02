package abstractfactroy.interImpl;

import abstractfactroy.inter.ITire;

/**
 * Created by gavin on 2017/3/2.
 */
public class NormalTire implements ITire {
    @Override
    public void tire() {
        System.out.println("普通轮胎");
    }
}
