package stragety;

/**
 * Created by gavin on 2017/3/3.
 */
public class TranficCalculator implements CalculateStrategy {

    private CalculateStrategy mCalculateStrategy;

    public void setCalculateStrategy(CalculateStrategy mCalculateStrategy) {
        this.mCalculateStrategy = mCalculateStrategy;
    }


    public static void main(String[] args) {

        TranficCalculator tranficCalculator=new TranficCalculator();

        tranficCalculator.setCalculateStrategy(new BusStrategy());

        System.out.println("公交车的价格："+tranficCalculator.calculatePrice(22));
    }

    @Override
    public int calculatePrice(int km) {
        if (mCalculateStrategy != null) {

            return mCalculateStrategy.calculatePrice(km);
        }
        return 0;
    }
}
