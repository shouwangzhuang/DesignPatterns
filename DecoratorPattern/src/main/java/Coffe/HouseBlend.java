package Coffe;

/**
 * @author shou.wangzhuang
 * @date 2023/1/27 21:34
 */
public class HouseBlend extends Beverage{
    public HouseBlend() {
        description = "HouseBlend";
    }
    @Override
    public double cost() {
        return 0.89;
    }
}
