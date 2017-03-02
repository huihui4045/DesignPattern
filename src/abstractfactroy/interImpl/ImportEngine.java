package abstractfactroy.interImpl;

import abstractfactroy.inter.IEngine;

/**
 * Created by gavin on 2017/3/2.
 */
public class ImportEngine implements IEngine {
    @Override
    public void engine() {

        System.out.printf("进口发动机");
    }
}
