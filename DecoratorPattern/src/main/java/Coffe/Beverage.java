package Coffe;

/**
 * @author shou.wangzhuang
 * @date 2023/1/27 21:29
 */
public abstract class Beverage {

    String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
