package visitor;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by gavin on 2017/6/7.
 */
public class BusinessReport {

    List<Staff> mStaffs=new LinkedList<>();


    public BusinessReport() {
      mStaffs.add(new Manager("王经理"));
      mStaffs.add(new Engineer("工程师-1"));
      mStaffs.add(new Engineer("工程师-2"));
      mStaffs.add(new Engineer("工程师-3"));
      mStaffs.add(new Engineer("工程师-4"));
    }

    public void showReport(Visitor visitor){

        for (Staff mStaff : mStaffs) {

            mStaff.accept(visitor);
        }
    }
}
