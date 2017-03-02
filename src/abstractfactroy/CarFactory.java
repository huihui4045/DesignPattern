package abstractfactroy;

import abstractfactroy.inter.IBrake;
import abstractfactroy.inter.IEngine;
import abstractfactroy.inter.ITire;

/**
 * Created by gavin on 2017/3/2.
 */
public abstract class CarFactory {

    public abstract ITire createTire();

    public abstract IBrake createBrake();

    public abstract IEngine createEngine();
}
