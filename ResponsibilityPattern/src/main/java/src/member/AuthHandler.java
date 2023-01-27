package src.member;

/**
 * @author shou.wangzhuang
 * @date 2023/1/16 23:10
 */
public class AuthHandler extends Handler{
    public void doHandle(Member member) {
        if(!"管理员".equals(member.getRoleName())) {
            System.out.println("您不是管理员，没有操作权限");
            return;
        }
        System.out.println("您是管理员，允许操作");
    }
}
