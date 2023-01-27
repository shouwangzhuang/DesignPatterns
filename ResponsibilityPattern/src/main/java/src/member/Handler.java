package src.member;

/**
 * @author shou.wangzhuang
 * @date 2023/1/16 22:52
 */
public  abstract class Handler {
    protected Handler chain;

    public void next(Handler handler) {
        this.chain = handler;
    }
    public abstract void doHandle(Member member);
}
