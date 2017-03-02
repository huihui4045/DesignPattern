package abstractfactroy.interImpl;

import abstractfactroy.inter.ITire;

/**
 * Created by gavin on 2017/3/2.
 */
public class SUVTire implements ITire {
    @Override
    public void tire() {
        System.out.println("越野轮胎");
    }
}
