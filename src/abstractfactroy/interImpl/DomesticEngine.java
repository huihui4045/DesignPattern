package abstractfactroy.interImpl;

import abstractfactroy.inter.IEngine;

/**
 * Created by gavin on 2017/3/2.
 */
public class  DomesticEngine implements IEngine {
    @Override
    public void engine() {

        System.out.printf("国产发动机");
    }
}
