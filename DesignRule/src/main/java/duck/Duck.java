package duck;

import duck.behavior.fly.FlyBahavior;
import duck.behavior.quack.QuackBehavior;

/**
 * @author shou.wangzhuang
 * @date 2023/1/18 23:46
 */
public abstract class Duck {
    FlyBahavior flyBahavior;
    QuackBehavior quackBehavior;

    public Duck() {

    }

    public abstract void display();

    public void performFly() {
        flyBahavior.fly();
    }

    public void performQuack(){
        quackBehavior.quack();
    }

    public void swim() {
        System.out.println("all ducks float");
    }
}
