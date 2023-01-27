package duck.behavior.quack;

/**
 * @author shou.wangzhuang
 * @date 2023/1/18 23:55
 */
public class Squeak implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
