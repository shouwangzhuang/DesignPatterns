package duck.behavior.fly;

/**
 * @author shou.wangzhuang
 * @date 2023/1/18 23:48
 */
public class FlyNoWay implements FlyBahavior {
    @Override
    public void fly() {
        System.out.println("I can not fly");
    }
}
