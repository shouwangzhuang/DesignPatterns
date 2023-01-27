package src.member;

/**
 * @author shou.wangzhuang
 * @date 2023/1/16 23:08
 */
public class LoginHandler extends Handler{
    public void doHandle(Member member) {
        System.out.println("登录成功");
        member.setRoleName("管理员");
        chain.doHandle(member);
    }
}
