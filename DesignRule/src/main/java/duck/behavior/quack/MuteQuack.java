package duck.behavior.quack;

/**
 * @author shou.wangzhuang
 * @date 2023/1/18 23:52
 */
public class MuteQuack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("Slience");
    }
}
