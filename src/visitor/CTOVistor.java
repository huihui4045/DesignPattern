package visitor;

/**
 * Created by gavin on 2017/6/7.
 */
public class CTOVistor implements Visitor {
    @Override
    public void visit(Staff staff) {
        if (staff instanceof Manager) {

            Manager manager = (Manager) staff;

            System.out.println("经理：" + manager.name + ",新产品数量：" + manager.getProducts());

        } else if (staff instanceof Engineer) {

            Engineer engineer = (Engineer) staff;

            System.out.println("工程师：" + engineer.name + "  代码函数:" + engineer.getCodeLines());

        }
    }
}
