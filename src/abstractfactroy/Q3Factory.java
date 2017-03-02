package abstractfactroy;

import abstractfactroy.inter.IBrake;
import abstractfactroy.inter.IEngine;
import abstractfactroy.inter.ITire;
import abstractfactroy.interImpl.ImportEngine;
import abstractfactroy.interImpl.NormalTire;
import abstractfactroy.interImpl.SeniorBrake;

/**
 * Created by gavin on 2017/3/2.
 */
public class Q3Factory extends CarFactory {
    @Override
    public ITire createTire() {
        return new NormalTire();
    }

    @Override
    public IBrake createBrake() {
        return new SeniorBrake();
    }

    @Override
    public IEngine createEngine() {
        return new ImportEngine();
    }
}
