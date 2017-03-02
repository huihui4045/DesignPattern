package abstractfactroy.interImpl;

import abstractfactroy.inter.IBrake;

/**
 * Created by gavin on 2017/3/2.
 */
public class SeniorBrake implements IBrake {
    @Override
    public void brake() {
        System.out.println("高级制动");
    }
}
