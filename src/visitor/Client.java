package visitor;

/**
 * Created by gavin on 2017/6/7.
 *
 * 访问者模式
 */
public class Client {




    public static void main(String[] args) {

        BusinessReport report=new BusinessReport();

        report.showReport(new CEOVistor());
        report.showReport(new CTOVistor());
    }
}
