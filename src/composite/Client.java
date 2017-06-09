package composite;

/**
 * Created by gavin on 2017/6/9.
 * 组合模式
 */
public class Client {


    public static void main(String[] args) {

        /*****
         * 构造一个根节点
         */
        Composite root = new Composite("Root");

        Composite brance1 = new Composite("brance1");
        Composite brance2 = new Composite("brance2");


        Leaf leaf1=new Leaf("leaf1");
        Leaf leaf2=new Leaf("leaf2");

        brance1.addChild(leaf1);
        brance2.addChild(leaf2);

        root.addChild(brance1);

        root.addChild(brance2);


        root.doSomething();
    }
}
