package stragety;

/**
 * Created by gavin on 2017/3/3.
 * 计算接口
 */
public interface CalculateStrategy {
    /**
     * 按照距离计算价格
     *
     * @param km 公里
     * @return return price
     */
    int calculatePrice(int km);
}
