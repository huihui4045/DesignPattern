package visitor;

import java.util.Random;

/**
 * Created by gavin on 2017/6/7.
 * 员工基类
 */
public abstract class Staff {

    public String name;

    //员工的kpi
    public int kpi;

    public Staff(String name) {
        this.name = name;
        kpi = new Random().nextInt(10);
    }

    /*****
     * 接收访问者的访问
     * @param visitor
     */
    public abstract void accept(Visitor visitor);
}
