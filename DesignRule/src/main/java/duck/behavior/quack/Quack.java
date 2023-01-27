package duck.behavior.quack;

/**
 * @author shou.wangzhuang
 * @date 2023/1/18 23:51
 */
public class Quack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
