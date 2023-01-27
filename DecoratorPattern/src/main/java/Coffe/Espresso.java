package Coffe;

/**
 * @author shou.wangzhuang
 * @date 2023/1/27 21:33
 */
public class Espresso extends Beverage{

    public Espresso() {
        description = "Espresso";
    }
    @Override
    public double cost() {
        return 1.99;
    }
}
