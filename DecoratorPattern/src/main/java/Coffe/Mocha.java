package Coffe;

/**
 * @author shou.wangzhuang
 * @date 2023/1/27 21:36
 */
public class Mocha extends CondimentDecorator{
    private Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }
    @Override
    public double cost() {
        return 0.20 + beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.description + ", Mocha";
    }
}
